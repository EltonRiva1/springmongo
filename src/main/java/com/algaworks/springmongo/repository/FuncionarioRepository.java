package com.algaworks.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.algaworks.springmongo.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
	@Query("{$and:[{'idade':{$gte:?0}},{'idade':{$lte:?1}}]}")
	List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

	List<Funcionario> findByNome(String nome);
}
