package ec.edu.ups.Modelo;

public class FacturaDetalle {
	
	private String indicacionesConsumo;
	private double totalPagarConsulta;
	private double totalPagarMedicina;
	private double totalPagar;
	private Medicina medicina;
	
	
	public FacturaDetalle() {
		super ();
	}


	public String getIndicacionesConsumo() {
		return indicacionesConsumo;
	}


	public void setIndicacionesConsumo(String indicacionesConsumo) {
		this.indicacionesConsumo = indicacionesConsumo;
	}


	public double getTotalPagarConsulta() {
		return totalPagarConsulta;
	}


	public void setTotalPagarConsulta(double totalPagarConsulta) {
		this.totalPagarConsulta = totalPagarConsulta;
	}


	public double getTotalPagarMedicina() {
		return totalPagarMedicina;
	}


	public void setTotalPagarMedicina(double totalPagarMedicina) {
		this.totalPagarMedicina = totalPagarMedicina;
	}


	public double getTotalPagar() {
		return totalPagar;
	}


	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}


	public Medicina getMedicina() {
		return medicina;
	}


	public void setMedicina(Medicina medicina) {
		this.medicina = medicina;
	}


	@Override
	public String toString() {
		return "FacturaDetalle [indicacionesConsumo=" + indicacionesConsumo + ", totalPagarConsulta="
				+ totalPagarConsulta + ", totalPagarMedicina=" + totalPagarMedicina + ", totalPagar=" + totalPagar
				+ ", medicina=" + medicina + "]";
	}
	
	
	
	

}
