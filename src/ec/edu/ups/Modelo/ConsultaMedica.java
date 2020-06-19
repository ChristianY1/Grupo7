package ec.edu.ups.Modelo;

import java.util.Date;

public class ConsultaMedica {
	
	private String idConsulta;
	private Date fechaConsulta;
	private String motivoConsulta;
	private String datosExtras;
	private Paciente historiaPaciente;
	private String examenesRequeridos;
	//private Factura factura;
	private CertificadoMedico certificadoMedico;
	
	public ConsultaMedica() {
		super();
	}

//	public ConsultaMedica(String idConsulta, Date fechaConsulta, String motivoConsulta, String datosExtras,
//			Paciente historiaPaciente, String examenesRequeridos, Factura factura,
//			CertificadoMedico certificadoMedico) {
//		super();
//		this.idConsulta = idConsulta;
//		this.fechaConsulta = fechaConsulta;
//		this.motivoConsulta = motivoConsulta;
//		this.datosExtras = datosExtras;
//		this.historiaPaciente = historiaPaciente;
//		this.examenesRequeridos = examenesRequeridos;
//		//this.factura = factura;
//		this.certificadoMedico = certificadoMedico;
//	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public String getDatosExtras() {
		return datosExtras;
	}

	public void setDatosExtras(String datosExtras) {
		this.datosExtras = datosExtras;
	}

	public Paciente getHistoriaPaciente() {
		return historiaPaciente;
	}

	public void setHistoriaPaciente(Paciente historiaPaciente) {
		this.historiaPaciente = historiaPaciente;
	}

	public String getExamenesRequeridos() {
		return examenesRequeridos;
	}

	public void setExamenesRequeridos(String examenesRequeridos) {
		this.examenesRequeridos = examenesRequeridos;
	}

//	public Factura getFactura() {
//		return factura;
//	}
//
//	public void setFactura(Factura factura) {
//		this.factura = factura;
//	}

	public CertificadoMedico getCertificadoMedico() {
		return certificadoMedico;
	}

	public void setCertificadoMedico(CertificadoMedico certificadoMedico) {
		this.certificadoMedico = certificadoMedico;
	}

	@Override
	public String toString() {
		return "ConsultaMedica [idConsulta=" + idConsulta + ", fechaConsulta=" + fechaConsulta + ", motivoConsulta="
				+ motivoConsulta + ", datosExtras=" + datosExtras + ", historiaPaciente=" + historiaPaciente
				+ ", examenesRequeridos=" + examenesRequeridos + "]";
	}
	
	
	
	
	
}
