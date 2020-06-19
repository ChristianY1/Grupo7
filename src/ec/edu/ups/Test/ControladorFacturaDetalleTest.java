package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorFactutaDetalle;



public class ControladorFacturaDetalleTest {
	
	private ControladorFactutaDetalle controladorFacturaDetalle;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCalcularTotalPagarEnMedicina() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFacturaDetalle.calcularTotalPagarEnMedicina(18.25);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testVerificarIVA() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFacturaDetalle.verificarIVA(0.15);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarMetodoPago() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorFacturaDetalle.consultarMetodoPago("Contado");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	

}
