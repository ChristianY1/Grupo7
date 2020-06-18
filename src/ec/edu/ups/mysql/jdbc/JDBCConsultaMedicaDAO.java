package ec.edu.ups.mysql.jdbc;

import java.util.List;

import ec.edu.ups.DAO.ConsultaMedicaDAO;
import ec.edu.ups.Modelo.ConsultaMedica;
import ec.edu.ups.Modelo.Paciente;

public class JDBCConsultaMedicaDAO extends JDBCGenericDAO<ConsultaMedica, String> implements ConsultaMedicaDAO{

	@Override
	public void create(ConsultaMedica entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConsultaMedica read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ConsultaMedica entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ConsultaMedica entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ConsultaMedica> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente buscarPaciene(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
