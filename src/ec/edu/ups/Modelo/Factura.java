package ec.edu.ups.Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	
	private String idFactura;
	private String fechaFactura;
	private Paciente paciente;
	private Medico medico;
	//private ArrayList<FacturaDetalle> facturaDetalle;
	
	
	public Factura() {
		super();
	}

	
	public Factura(String idFactura, String fechaFactura) {
		super();
		this.idFactura = idFactura;
		this.fechaFactura = fechaFactura;
		
	}


	public String getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}


	public String getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


}
