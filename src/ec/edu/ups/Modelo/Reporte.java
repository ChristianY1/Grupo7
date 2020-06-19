package ec.edu.ups.Modelo;

public class Reporte {

	private int report_id;
	private String Datos;
	private String Diario;
	private double balances;
	private LibroDiario libroDiario;
	
	public Reporte() {
		super();
	}
	
	public Reporte(int report_id, String datos, String diario, double balances, LibroDiario libroDiario) {
		super();
		this.report_id = report_id;
		Datos = datos;
		Diario = diario;
		this.balances = balances;
		this.libroDiario = libroDiario;
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public String getDatos() {
		return Datos;
	}

	public void setDatos(String datos) {
		Datos = datos;
	}

	public String getDiario() {
		return Diario;
	}

	public void setDiario(String diario) {
		Diario = diario;
	}

	public double getBalances() {
		return balances;
	}

	public void setBalances(double balances) {
		this.balances = balances;
	}

	public LibroDiario getLibroDiario() {
		return libroDiario;
	}

	public void setLibroDiario(LibroDiario libroDiario) {
		this.libroDiario = libroDiario;
	}

	@Override
	public String toString() {
		return "Reporte [report_id=" + report_id + ", Datos=" + Datos + ", Diario=" + Diario + ", balances=" + balances
				+ ", libroDiario=" + libroDiario + "]";
	}
	
}
