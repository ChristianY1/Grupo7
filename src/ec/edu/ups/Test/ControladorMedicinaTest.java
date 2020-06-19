package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorMedicina;



public class ControladorMedicinaTest {
	
	private ControladorMedicina controladorMedicina;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testConsultarDisponibilidad() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorMedicina.consultarDisponibilidad(100);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ConsultarTotalEnMedicinas() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorMedicina.CalcularTotalEnMedicinas(15.20);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}


}
