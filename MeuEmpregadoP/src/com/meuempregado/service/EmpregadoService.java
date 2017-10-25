package com.meuempregado.service;

import java.util.ArrayList;
import java.util.List;

import com.meuempregado.dao.EmpregadoDAO;
import com.meuempregado.model.Empregado;

public class EmpregadoService {

	//vari�vel dao do tipo EmpregadoDAO
	private EmpregadoDAO dao;
	
	//Construtor
	public EmpregadoService() {
		//atribui ao dao uma nova inst�ncia, cada vez que � chamado uma nova inst�ncia "EmpregadoService"
		dao = new EmpregadoDAO();
	}
	
	//M�todo de inser��o de um novo Empregado
	public void inserirEmpregado(Empregado e) {
		dao.inserir(e);
	}
	
	//M�todo de altera��o das informa��es do objeto "e" do tipo Empregado que for passado por par�metro
	public void alterarEmpregado(Empregado e) {
		dao.alterar(e);
	}
	
	//M�todo que busca todos os registros da base de dados
	public List<Empregado> listarTudo(){
		return dao.listarTudo();
	}
	
	//M�todo que filtra registros direto da base de dados, atrav�s de um par�metro.
	public List<Empregado> buscarPorAtributos(String parametro){
		//Faz uma lista do tipo empregado
		List<Empregado> lista = new ArrayList<Empregado>();
		
		//verifica��o da string que foi passada por par�metro
		if(parametro != null && parametro.trim().length() > 0) {
			lista = dao.buscarPorAtributos(parametro);
		}else {
			lista = listarTudo();
		}
		
		//Retorna o que foi atribu�da � lista do tipo Empregado
		return lista;
	}
}
