package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorFactura;

public class ControladorFacturaTest {
	
	private ControladorFactura controladorFactura;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testEnviarFacturaEmail() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFactura.enviarFacturaEmail("prueba123@gmail.com");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarPaciente() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFactura.registrarPaciente("25552255555");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarFacturaMedico() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFactura.registrarFacturaMedico("140502555202");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarDatosFacturacion() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFactura.consultarDatosFacturacion("100000", "Alex", "Reinoso");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
}
