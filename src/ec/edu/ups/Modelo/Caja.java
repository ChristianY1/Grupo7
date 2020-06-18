package ec.edu.ups.Modelo;

import java.util.List;

public class Caja extends CuentaContable{
	private List<ComprobanteDeVenta> listcv;
	private List<Sueldo> listSueldo;
	private double saldo;
	
	
	public Caja() {
		super();
	}

	public Caja(List<ComprobanteDeVenta> listcv, List<Sueldo> listSueldo, double saldo) {
		super();
		this.listcv = listcv;
		this.listSueldo = listSueldo;
		this.saldo = saldo;
	}
	
	public List<ComprobanteDeVenta> getListcv() {
		return listcv;
	}
	public void setListcv(List<ComprobanteDeVenta> listcv) {
		this.listcv = listcv;
	}
	public List<Sueldo> getListSueldo() {
		return listSueldo;
	}
	public void setListSueldo(List<Sueldo> listSueldo) {
		this.listSueldo = listSueldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
