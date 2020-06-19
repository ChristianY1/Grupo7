package ec.edu.ups.Controlador;


import java.util.List;

import ec.edu.ups.Modelo.Cita;
import ec.edu.ups.Modelo.Medico;
import ec.edu.ups.Modelo.Paciente;

public class ControladorPaciente {

	private Paciente paciente;

	int[] coeficienteValidacionCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
	int verificador = 0;
	int tercerDigito = 0;
	int suma = 0;
	int digito = 0;
	
	public List verMedicos() {
		List medicos=null;
		return medicos;
	}

	public boolean validarCedula(String cedula) {
		boolean validacion = false;
		try {
			if (cedula.length() == 10) {
				tercerDigito = Integer.parseInt(cedula.substring(2, 3));
				if (tercerDigito < 6) {

					verificador = Integer.parseInt(cedula.substring(9, 10));

					for (int i = 0; i < (cedula.length() - 1); i++) {
						digito = Integer.parseInt(cedula.substring(i, i + 1)) * coeficienteValidacionCedula[i];
						suma += ((digito % 10) + (digito / 10));
					}
					if ((suma % 10 == 0) && (suma % 10 == verificador)) {
						validacion = true;
					} else if ((10 - (suma % 10)) == verificador) {
						validacion = true;
					} else {
						validacion = false;
					}
				} else {
					validacion = false;
				}
			} else {
				validacion = false;
			}
		} catch (NumberFormatException nfe) {
			validacion = false;
		} catch (Exception err) {
			System.out.println("Una excepcion ocurrio en el proceso de validadcion");
			validacion = false;
		}

		if (!validacion) {
			System.out.println("La Cédula ingresada es Incorrecta");
		}
		return validacion;
	}
	
	public List obtenerCitas(String cedula) {
		List citasList=paciente.getCitasList();
		return citasList;
	}	
	
	public List obtenerHistorialMedico(String cedula) {
		List historialMedicoList=paciente.getHistoriasClinicas();
		return historialMedicoList;
	}
	
	public boolean agendarCita() {
		return true;
	}
	
}
