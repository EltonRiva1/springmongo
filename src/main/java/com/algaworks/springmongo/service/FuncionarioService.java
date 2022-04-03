package com.algaworks.springmongo.service;

import java.util.List;

import com.algaworks.springmongo.model.Funcionario;

public interface FuncionarioService {
	List<Funcionario> obterTodos();

	Funcionario obterPorCodigo(String codigo);

	Funcionario criar(Funcionario funcionario);

	List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

	List<Funcionario> obterFuncionariosPorNome(String nome);
}
