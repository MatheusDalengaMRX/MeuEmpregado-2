package com.meuempregado.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.meuempregado.model.Empregado;
import com.meuempregado.service.EmpregadoService;


@ManagedBean(name = "empregadoMB")
@SessionScoped
public class EmpregadoMB implements Serializable{
	
	//Serial para localizar o objeto na mem�ria
	private static final long serialVersionUID = -8822968212228745684L;
	
	//Criando vari�veis do tipo das Classes necess�rias
	private Empregado empregado;
	private List<Empregado> listaEmpregados;
	private EmpregadoService empregadoService;
	
	//Construtor para novas inst�ncias das Classes
	public EmpregadoMB() {
		this.empregado = new Empregado();
		this.empregadoService = new EmpregadoService();
		this.listaEmpregados = this.empregadoService.listar();
	}

	//M�todo de inser��o dos dados do Empregado atr�ves do ManagedBean
	public void inserirEmpregadoAction() {
		this.empregadoService.inserir(this.empregado);
		System.out.println("Empregado Inserido");
		this.empregado = new Empregado();
	}
	
	//M�todo de altera��o dos dados do Empregado atr�ves do ManagedBean
	//OBS: prov�vel que haja problema com o Hibernate nesse m�todo, por causa da passagem do objeto completo, incluindo o id (o que pode dar conflito), ou n�o.
	public void alterarEmpregadoAction() {
		this.empregadoService.alterar(this.empregado);
		System.out.println("Empregado Alterado");
		this.empregado = new Empregado();
	}
	
	//M�todo de listagem de todos os dados dos Empregados atr�ves do ManagedBean
	public void listarEmpregadoAction() {
		this.listaEmpregados = this.empregadoService.listar();
		System.out.println("Empregados na lista");
	}
	
	//M�todo de listagem da busca dos dados dos Empregados atr�ves de um filtro de pesquisa da tela
	//Filtra Empregados a partir de (cidade, bairro, endere�o e cep);
	//Usar o campo de busca como #{empregadoMB.empregado.nomeCompleto}
	public void filtrarEmpregadoAction() {
		this.listaEmpregados = this.empregadoService.filtrar(this.empregado.getNomeCompleto());
		System.out.println("Empregados filtrados na lista");
		this.empregado = new Empregado();
	}
	
	/*Metodo que busca o cep e retorna dados de endereco atraves de WebService*/
	public void buscarCepAction() throws Exception {
		this.empregado = this.empregadoService.buscarCEP(this.empregado);
	}
	
	public String verEmpregadoAction() {
		return "verEmpregado";
	}
	
	//-------------------------------------------
	
	//Getters and Setters

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public List<Empregado> getListaEmpregados() {
		return listaEmpregados;
	}

	public void setListaEmpregados(List<Empregado> listaEmpregados) {
		this.listaEmpregados = listaEmpregados;
	}

	public EmpregadoService getEmpregadoService() {
		return empregadoService;
	}

	public void setEmpregadoService(EmpregadoService empregadoService) {
		this.empregadoService = empregadoService;
	}

}
