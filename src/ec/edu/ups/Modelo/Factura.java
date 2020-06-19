package ec.edu.ups.Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	
	private String idFactura;
	private Date fechaFactura;
	private Paciente paciente;
	private Medico medico;
	private ArrayList<FacturaDetalle> facturaDetalle;
	
	
	public Factura() {
		super();
	}


	public String getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}


	public Date getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(Date fechaFactura) {
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


	public ArrayList<FacturaDetalle> getFacturaDetalle() {
		return facturaDetalle;
	}


	public void setFacturaDetalle(ArrayList<FacturaDetalle> facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fechaFactura=" + fechaFactura + ", paciente=" + paciente
				+ ", medico=" + medico + "]";
	}
	
	
	
	

}
