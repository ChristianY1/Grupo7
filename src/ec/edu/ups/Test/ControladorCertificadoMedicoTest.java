package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorCertificadoMedico;



public class ControladorCertificadoMedicoTest {
	
	private ControladorCertificadoMedico controladorCertificadoMedico;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSolicitarInformacionEnvio() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCertificadoMedico.SolicitarConfirmacionEnvio("NegarConfirmacion");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEnviarCertificadoEmail() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCertificadoMedico.EnviarCertificadoEmail("prosebascalle@hotmail.com");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarCertificadoPaciente() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCertificadoMedico.RegistrarCertificadoMedico("CertificadoParaPaciente");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarCertificadoMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCertificadoMedico.RegistrarCertificadoMedico("CertificadoParaPaciente");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	

}
