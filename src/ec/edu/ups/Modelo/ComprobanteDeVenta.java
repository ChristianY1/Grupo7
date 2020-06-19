package ec.edu.ups.Modelo;

import java.sql.Date;

import javax.xml.crypto.Data;

public class ComprobanteDeVenta {
	private String tipo;
	private String fecha;
	private int numero;
	
	
	
	public ComprobanteDeVenta() {
		super();
	}
	public ComprobanteDeVenta(String tipo, String fecha, int numero) {
		super();
		this.tipo = tipo;
		this.fecha = fecha;
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "ComprobanteDeVenta [tipo=" + tipo + ", fecha=" + fecha + ", numero=" + numero + "]";
	}	
	
}
