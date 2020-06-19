package ec.edu.ups.Modelo;

public class Colaboradores extends Sueldo {
	private String cargo;
	private int cargasFamiliares;

	
	
	public Colaboradores() {
		super();
	}

	

	public Colaboradores(String cargo, int cargasFamiliares) {
		super();
		this.cargo = cargo;
		this.cargasFamiliares = cargasFamiliares;
	}



	public int getCargasFamiliares() {
		return cargasFamiliares;
	}



	public void setCargasFamiliares(int cargasFamiliares) {
		this.cargasFamiliares = cargasFamiliares;
	}



	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
