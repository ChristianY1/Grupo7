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
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testValidarCedula() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorPaciente.validarCedula("1400919302");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
