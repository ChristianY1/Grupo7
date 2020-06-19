package ec.edu.ups.Modelo;

import java.util.List;

public class Medico extends Usuario{
	
	private int med_id;
	private String especialidad;
	private List<Reporte> listReporte;

	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medico(int med_id, String especialidad, List<Reporte> listReporte) {
		super();
		this.med_id = med_id;
		this.especialidad = especialidad;
		this.listReporte = listReporte;
	}

	public int getMed_id() {
		return med_id;
	}

	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	public List<Reporte> getListReporte() {
		return listReporte;
	}

	public void setListReporte(List<Reporte> listReporte) {
		this.listReporte = listReporte;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico [med_id=" + med_id + ", especialidad=" + especialidad + ", listReporte=" + listReporte + "]";
	}
	
}
