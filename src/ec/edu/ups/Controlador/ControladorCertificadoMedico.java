package ec.edu.ups.Controlador;

import java.util.ArrayList;

import ec.edu.ups.Modelo.CertificadoMedico;
import ec.edu.ups.Modelo.Medico;
import ec.edu.ups.Modelo.Paciente;

public class ControladorCertificadoMedico {
	
	CertificadoMedico certificadoMedico;
	Paciente paciente;
	Medico medico;
	
	public boolean SolicitarConfirmacionEnvio(String paciente) {
		return true;
	}
	
	public boolean EnviarCertificadoEmail(String email) {
		return true;
	}
	
	public boolean RegistrarCertificadoPaciente(String certificados) {
		return true;
	}
	
	public boolean RegistrarCertificadoMedico(String listReporte) {
		return true;
	}

}
