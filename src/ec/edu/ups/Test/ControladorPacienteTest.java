package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorPaciente;

public class ControladorPacienteTest {
	
	private ControladorPaciente controladorPaciente;
	@BeforeEach
	void setUp() throws Exception {
		controladorPaciente = new ControladorPaciente();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testValidarCedula() {
		boolean resultadoEsperado = false;
		String cedula = "1400919302";
		boolean resultadoObtenido = controladorPaciente.validarCedula(cedula);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
