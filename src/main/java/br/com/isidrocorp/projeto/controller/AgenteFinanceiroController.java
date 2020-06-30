package br.com.isidrocorp.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.projeto.dao.AgenteFinanceiroDAO;
import br.com.isidrocorp.projeto.model.AgenteFinanceiro;

@RestController
@CrossOrigin("*")
public class AgenteFinanceiroController {
	
	@Autowired
	private AgenteFinanceiroDAO dao;
	
	@GetMapping("/agentesfinanceiros")
	public ArrayList<AgenteFinanceiro> recuperarToTen(){
		ArrayList<AgenteFinanceiro> lista ;
		lista = (ArrayList<AgenteFinanceiro>)dao.findAllOrderByVolumeDesc();
		return lista;
	}

}
