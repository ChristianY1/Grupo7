package ec.edu.ups.Modelo;

public abstract class Sueldo extends CuentaContable{
	
	private Caja caja;
	private double cantidad;
	
	
	
	public Sueldo() {
		super();
	}
	public Sueldo(Caja caja, double cantidad) {
		super();
		this.caja = caja;
		this.cantidad = cantidad;
	}
	public Caja getCaja() {
		return caja;
	}
	
	
	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
}
