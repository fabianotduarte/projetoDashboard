package br.com.isidrocorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projeto.model.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro, Integer> {
	

}
