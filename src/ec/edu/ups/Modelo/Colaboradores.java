package ec.edu.ups.Modelo;

public class Colaboradores extends Sueldo {
	private String cargo;

	
	
	public Colaboradores() {
		super();
	}

	public Colaboradores(String cargo) {
		
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
