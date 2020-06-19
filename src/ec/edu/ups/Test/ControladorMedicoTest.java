package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorMedico;

class ControladorMedicoTest {
	private ControladorMedico controladorMedico;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularSueldo() {
		double resultadoEsperado = 3947.98;
		double resultadoObtenido = controladorMedico.calcularSueldo("Cardiologo");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testVerificarEspecialidad() {
		int id = 1;
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorMedico.verificarEspecialidad(id);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	

}
