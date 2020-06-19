package ec.edu.ups.Modelo;

import java.util.List;

public class Informacion {
	
	private List<Colaboradores> listaColaboradores;
	private List<Medico> listaMedicos;
	private List<Paciente> listaPacientes;
	
	
	public Informacion() {
		super();
	}


	public Informacion(List<Colaboradores> listaColaboradores, List<Medico> listaMedicos, List<Paciente> listaPacientes) {
		super();
		this.listaColaboradores = listaColaboradores;
		this.listaMedicos = listaMedicos;
		this.listaPacientes = listaPacientes;
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


	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}


	public void setListaPacientes(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	
	
}
