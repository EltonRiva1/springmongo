package com.algaworks.springmongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.springmongo.model.Funcionario;
import com.algaworks.springmongo.repository.FuncionarioRepository;
import com.algaworks.springmongo.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public List<Funcionario> obterTodos() {
		// TODO Auto-generated method stub
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario obterPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.funcionarioRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Funcionário não existe."));
	}

	@Override
	public Funcionario criar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		Funcionario chefe = this.funcionarioRepository.findById(funcionario.getChefe().getCodigo())
				.orElseThrow(() -> new IllegalArgumentException("Chefe inexistente."));
		funcionario.setChefe(chefe);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate) {
		// TODO Auto-generated method stub
		return this.funcionarioRepository.obterFuncionariosPorRangeDeIdade(de, ate);
	}

	@Override
	public List<Funcionario> obterFuncionariosPorNome(String nome) {
		// TODO Auto-generated method stub
		return this.funcionarioRepository.findByNome(nome);
	}

}
