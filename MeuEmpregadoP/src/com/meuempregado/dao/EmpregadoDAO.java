package com.meuempregado.dao;

import java.util.ArrayList;
import java.util.List;

import com.meuempregado.model.Empregado;

public class EmpregadoDAO implements iDAO<Empregado>{

	//Hibernate or JDBC configs and imports
	
	@Override
	public void inserir(Empregado objeto) {
		// Por fazer
	}

	@Override
	public void alterar(Empregado objeto) {
		// Por fazer	
	}

	@Override
	public List<Empregado> listarTudo() {
		// Por fazer
		return null;
	}
	
	//M�TODO DE BUSCA GLOBAL
	
	public List<Empregado> buscarPorAtributos(String parametro) {
		List<Empregado> resultados = new ArrayList<Empregado>();
		
		// Por fazer
		
		return resultados;
	}
	
	//-----------------------------------------------------
	
	@Override
	public void deletar(Empregado objeto) {
		// N�O TER�, APENAS ALTERA��O DE STATUS DE ATIVIDADE
	}
	@Override
	public List<Empregado> buscarPorNome(String nome) {
		// TER� UM M�TODO S� QUE BUSCAR� INFORMA��ES DIVERSAS
		return null;
	}
}
