package ec.edu.ups.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ec.edu.ups.Controlador.ControladorHistoriasClinicas;
import ec.edu.ups.Modelo.HistoriasClinicas;

public class ControladorHistoriasClinicasTest {

	private List<HistoriasClinicas> listaHistoriasClinicas;
	private ControladorHistoriasClinicas HistoriasClinicas;
	
	@BeforeEach
	void setUp() throws Exception {
		this.listaHistoriasClinicas = new ArrayList<HistoriasClinicas>();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCrearhistorias(HistoriasClinicas listaHistoriasClinicas) {
		int id = 1;
		String fecha ="12/06/2020";
		String historia = "La historia clinica es... chan chan chan";
		String observaciones = "no hay texto";
		String resultadoEsperado = "1, 12/06/2020, La historia clinica es... chan chan chan,no hay texto";
		String resultadoObtenido = HistoriasClinicas.crearhistorias(id,fecha,historia,observaciones);
		assertEquals(resultadoEsperado, resultadoObtenido);		
	}
	
	@Test
	void testBuscar() {
		HistoriasClinicas histClinicas = new HistoriasClinicas();
		listaHistoriasClinicas.add(histClinicas);
		List<HistoriasClinicas> resultadoEsperado = listaHistoriasClinicas;
		List<HistoriasClinicas> resultadoObtenido = HistoriasClinicas.buscar(histClinicas);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
