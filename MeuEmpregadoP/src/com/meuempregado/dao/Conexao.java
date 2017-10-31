package com.meuempregado.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
private static EntityManagerFactory emf;
	
	private Conexao() { }
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("MeuEmpregadoP");
		}
		return emf;
	}

}