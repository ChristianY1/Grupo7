package ec.edu.ups.Controlador;

import java.util.List;

import ec.edu.ups.Modelo.Factura;
import ec.edu.ups.Modelo.FacturaDetalle;
import ec.edu.ups.Modelo.Medicina;


public class ControladorFactutaDetalle {
	
	Factura factura;
	FacturaDetalle facturaDetalle;
	
	
	public boolean calcularTotalPagarEnMedicina(Medicina medicina, double precio) {
		return true;
	}
	
	
	public boolean verificarIVA(double iva) {
		return true;
	}
	
	
	public boolean consultarMetodoPago(String metodo) {
		return true;
	}
}
