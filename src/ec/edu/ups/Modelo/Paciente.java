package ec.edu.ups.Modelo;

import ec.edu.ups.Modelo.Usuario;

public class Paciente extends Usuario{
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private String telefono;
	private String cedula;
	private String email;
	private String contrasena;
	
	
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(String nombre, String apellido, int edad, String sexo, String telefono, String cedula, String email,
			String contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo
				+ ", telefono=" + telefono + ", cedula=" + cedula + ", email=" + email + ", contrasena=" + contrasena
				+ "]";
	}
	
	
	
	
	
}
