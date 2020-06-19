package ec.edu.ups.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorCitas;

public class ControladorCitaTest {
	
	private ControladorCitas controladorCitas;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testVerificarEstadoCita() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCitas.verificarEstadoCita("1");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSeleccionarMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCitas.seleccionarMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEnviarMensajeConfirmacion() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCitas.enviarMensajeConfirmacion();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNotificarMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCitas.notificarMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarAgendaMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCitas.consultarAgendaMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
