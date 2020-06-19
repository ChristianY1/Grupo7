package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorLibroDiario;
import ec.edu.ups.Modelo.LibroDiario;

public class ControladorLibroDiarioTest {

	private List<LibroDiario> listLibroDiario;
	private ControladorLibroDiario controladorLibroDiario;
	
	@BeforeEach
	void setUp() throws Exception {
		this.listLibroDiario = new ArrayList<LibroDiario>();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCrearLibroDiario(LibroDiario listLibroDiario) {
		LibroDiario libroDiario = new LibroDiario();
		int id = 1;
		String debe = "Aqui debe tanto";
		String haber = "Aqui haber tanto";
		String fecha = "12/06/2020";
		String resultadoEsperado = "1, Aqui debe tanto, Aqui haber tanto, 12/06/2020";
		String resultadoObtenido = controladorLibroDiario.crearLibroDiario(id, debe, haber, fecha);
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	@Test
	void testCargarLibroDiario() {
		LibroDiario libroDiario = new LibroDiario();
		listLibroDiario.add(libroDiario);
		List<LibroDiario> resultadoEsperado = listLibroDiario;
		List<LibroDiario> resultadoObtenido = controladorLibroDiario.cargarLibroDiario(libroDiario);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
}
