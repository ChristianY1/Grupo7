package ec.edu.ups.Modelo;

import java.sql.Date;

public class LibroDiario {
	
	private int libroD_id;
	private String debe;
	private String haber;
	private Date fecha;
	
	public LibroDiario() {
		super();
	}
	
	public LibroDiario(int libroD_id, String debe, String haber, Date fecha) {
		super();
		this.libroD_id = libroD_id;
		this.debe = debe;
		this.haber = haber;
		this.fecha = fecha;
	}

	public int getLibroD_id() {
		return libroD_id;
	}

	public void setLibroD_id(int libroD_id) {
		this.libroD_id = libroD_id;
	}

	public String getDebe() {
		return debe;
	}

	public void setDebe(String debe) {
		this.debe = debe;
	}

	public String getHaber() {
		return haber;
	}

	public void setHaber(String haber) {
		this.haber = haber;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "LibroDiario [libroD_id=" + libroD_id + ", debe=" + debe + ", haber=" + haber + ", fecha=" + fecha + "]";
	}
}
