package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorConsultaMedica;

public class ControladorConsultaMedicaTest {
	
	private ControladorConsultaMedica controladorConsultaMedica;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testNotificarMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.notificarMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNotificarPaciente() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.notificarPaciente();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSolicitarDatosExtras() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.solicitarDatosExtas();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarAusenciaPaciente() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.registrarAusenciaPaciente();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testGenerarFactura() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.generarFactura();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testAgendarRevision() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorConsultaMedica.agendarRevision();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
