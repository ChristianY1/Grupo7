package ec.edu.ups.Modelo;

import java.util.List;

public class Informacion {
	private List<Colaboradores> listaColaboradores;
	private List<Medico> listaMedicos;
	
	
	
	public Informacion() {
		super();
	}


	public Informacion(List<Colaboradores> listaColaboradores, List<Medico> listaMedicos) {
		super();
		this.listaColaboradores = listaColaboradores;
		this.listaMedicos = listaMedicos;
	}


	public List<Colaboradores> getListaColaboradores() {
		return listaColaboradores;
	}


	public void setListaColaboradores(List<Colaboradores> listaColaboradores) {
		this.listaColaboradores = listaColaboradores;
	}


	public List<Medico> getListaMedicos() {
		return listaMedicos;
	}


	public void setListaMedicos(List<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	
	
	
	
}
