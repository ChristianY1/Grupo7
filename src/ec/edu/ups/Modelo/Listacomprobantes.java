package ec.edu.ups.Modelo;

import java.util.List;

public class Listacomprobantes {

	private List<ComprobanteDeVenta> listComprobantes;

	public Listacomprobantes(List<ComprobanteDeVenta> listComprobantes) {
		super();
		this.listComprobantes = listComprobantes;
	}

	public List<ComprobanteDeVenta> getListComprobantes() {
		return listComprobantes;
	}

	public void setListComprobantes(List<ComprobanteDeVenta> listComprobantes) {
		this.listComprobantes = listComprobantes;
	}

	@Override
	public String toString() {
		return "Listacomprobantes [listComprobantes=" + listComprobantes + "]";
	}
	
	
}
