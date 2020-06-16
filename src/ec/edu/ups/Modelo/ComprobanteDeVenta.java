package ec.edu.ups.Modelo;

import java.sql.Date;

import javax.xml.crypto.Data;

public class ComprobanteDeVenta {
	private String tipo;
	private Date fecha;
	private int numero;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}
