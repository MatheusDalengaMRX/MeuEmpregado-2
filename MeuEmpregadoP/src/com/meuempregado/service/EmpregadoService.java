package com.meuempregado.service;

import java.util.ArrayList;
import java.util.List;

import com.meuempregado.dao.FactoryDao;
import com.meuempregado.model.Empregado;

public class EmpregadoService implements InterfaceService<Empregado>{

	//M�todo de inser��o de um novo Empregado
	@Override
	public void inserir(Empregado entity) {
		FactoryDao.createGenericDao(Empregado.class).inserir(entity);
	}

	//M�todo de exclus�o de um novo Empregado
	@Override
	public void excluir(Integer id) {
		FactoryDao.createGenericDao(Empregado.class).excluir(id);
	}

	//M�todo de altera��o das informa��es do objeto "entity" do tipo Empregado que for passado por par�metro
	@Override
	public void alterar(Empregado entity) {
		FactoryDao.createGenericDao(Empregado.class).alterar(entity);
	}

	//M�todo que busca todos os registros da base de dados
	@Override
	public List<Empregado> listar() {
		return FactoryDao.createGenericDao(Empregado.class).listar();
	}

	//M�todo que busca pelo id o registro da base de dados
	@Override
	public Empregado obter(Integer id) {
		return FactoryDao.createGenericDao(Empregado.class).obter(id);
	}
	
	//M�todo que filtra registros direto da base de dados, atrav�s de um par�metro.
	/*public List<Empregado> buscarPorAtributos(String parametro){
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
	}*/
}
