package ec.edu.ups.Modelo;

public class Medico extends Usuario{
	private String especialidad;

	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Medico(String especialidad) {
		super();
		this.especialidad = especialidad;
	}



	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
