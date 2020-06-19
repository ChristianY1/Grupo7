package ec.edu.ups.Modelo;

import java.util.Date;

public class Medicina {
	
	public String idMedicina;
	public String nombre;
	public String marca;
	public String agentePrincipal;
	public Date fechaCaducidad;
	public int  stock;
	public String metodoAplicacion;
	
	public Medicina() {
		super ();
	}

	public String getIdMedicina() {
		return idMedicina;
	}

	public void setIdMedicina(String idMedicina) {
		this.idMedicina = idMedicina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAgentePrincipal() {
		return agentePrincipal;
	}

	public void setAgentePrincipal(String agentePrincipal) {
		this.agentePrincipal = agentePrincipal;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMetodoAplicacion() {
		return metodoAplicacion;
	}

	public void setMetodoAplicacion(String metodoAplicacion) {
		this.metodoAplicacion = metodoAplicacion;
	}

	@Override
	public String toString() {
		return "Medicina [idMedicina=" + idMedicina + ", nombre=" + nombre + ", marca=" + marca + ", agentePrincipal="
				+ agentePrincipal + ", fechaCaducidad=" + fechaCaducidad + ", stock=" + stock + ", metodoAplicacion="
				+ metodoAplicacion + "]";
	}
	
	
	
	
	
	
	

}
