package ec.edu.ups.Modelo;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Cita {
	
	private String idCita;
	private LocalDateTime horaAsignada;
	private Calendar fechaAsignada;
	private String estadoCita;
	
	
	
	public Cita() {
		super();
	}



	public Cita(String idCita, LocalDateTime horaAsignada, Calendar fechaAsignada, String estadoCita) {
		super();
		this.idCita = idCita;
		this.horaAsignada = horaAsignada;
		this.fechaAsignada = fechaAsignada;
		this.estadoCita = estadoCita;
	}



	public String getIdCita() {
		return idCita;
	}



	public void setIdCita(String idCita) {
		this.idCita = idCita;
	}



	public LocalDateTime getHoraAsignada() {
		return horaAsignada;
	}



	public void setHoraAsignada(LocalDateTime horaAsignada) {
		this.horaAsignada = horaAsignada;
	}



	public Calendar getFechaAsignada() {
		return fechaAsignada;
	}



	public void setFechaAsignada(Calendar fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}



	public String getEstadoCita() {
		return estadoCita;
	}



	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}



	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", horaAsignada=" + horaAsignada + ", fechaAsignada=" + fechaAsignada
				+ ", estadoCita=" + estadoCita + "]";
	}
	
	
	
	

}
