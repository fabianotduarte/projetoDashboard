package br.com.isidrocorp.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.projeto.dao.DepartamentoDAO;
import br.com.isidrocorp.projeto.model.Departamento;

@RestController
public class DepartamentoController {

	@Autowired
	DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> listarTodos(){
		ArrayList<Departamento> lista = (ArrayList<Departamento>)dao.findAll();
		return lista;
	}
}
