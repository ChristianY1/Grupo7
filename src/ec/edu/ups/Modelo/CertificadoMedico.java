package ec.edu.ups.Modelo;

public class CertificadoMedico {
	
	private String idCeritificado;
	private ConsultaMedica fechaConsultaMedica;
	private ConsultaMedica motivoConsultaMedica;
	private String diagnositicoMedico;
	private String consideracionesMedico;
	
	public CertificadoMedico() {
		super();
	}

	public CertificadoMedico(String idCeritificado, ConsultaMedica fechaConsultaMedica,
			ConsultaMedica motivoConsultaMedica, String diagnositicoMedico, String consideracionesMedico) {
		super();
		this.idCeritificado = idCeritificado;
		this.fechaConsultaMedica = fechaConsultaMedica;
		this.motivoConsultaMedica = motivoConsultaMedica;
		this.diagnositicoMedico = diagnositicoMedico;
		this.consideracionesMedico = consideracionesMedico;
	}

	public String getIdCeritificado() {
		return idCeritificado;
	}

	public void setIdCeritificado(String idCeritificado) {
		this.idCeritificado = idCeritificado;
	}

	public ConsultaMedica getFechaConsultaMedica() {
		return fechaConsultaMedica;
	}

	public void setFechaConsultaMedica(ConsultaMedica fechaConsultaMedica) {
		this.fechaConsultaMedica = fechaConsultaMedica;
	}

	public ConsultaMedica getMotivoConsultaMedica() {
		return motivoConsultaMedica;
	}

	public void setMotivoConsultaMedica(ConsultaMedica motivoConsultaMedica) {
		this.motivoConsultaMedica = motivoConsultaMedica;
	}

	public String getDiagnositicoMedico() {
		return diagnositicoMedico;
	}

	public void setDiagnositicoMedico(String diagnositicoMedico) {
		this.diagnositicoMedico = diagnositicoMedico;
	}

	public String getConsideracionesMedico() {
		return consideracionesMedico;
	}

	public void setConsideracionesMedico(String consideracionesMedico) {
		this.consideracionesMedico = consideracionesMedico;
	}

	@Override
	public String toString() {
		return "CertificadoMedico [idCeritificado=" + idCeritificado + ", fechaConsultaMedica=" + fechaConsultaMedica
				+ ", motivoConsultaMedica=" + motivoConsultaMedica + ", diagnositicoMedico=" + diagnositicoMedico
				+ ", consideracionesMedico=" + consideracionesMedico + "]";
	}
	
}
