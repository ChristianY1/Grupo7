package ec.edu.ups.Modelo;

import java.sql.Date;

public class HistoriasClinicas {

	private int historia_id;
	private String fecha;
	private String historia;
	private String observaciones;
	
	public HistoriasClinicas() {
		super();
	}
	
	public HistoriasClinicas(int historia_id, String fecha, String historia, String observaciones) {
		super();
		this.historia_id = historia_id;
		this.fecha = fecha;
		this.historia = historia;
		this.observaciones = observaciones;
	}

	public int getHistoria_id() {
		return historia_id;
	}

	public void setHistoria_id(int historia_id) {
		this.historia_id = historia_id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "HistoriasClinicas [historia_id=" + historia_id + ", fecha=" + fecha + ", historia=" + historia
				+ ", observaciones=" + observaciones + "]";
	}
	
}
