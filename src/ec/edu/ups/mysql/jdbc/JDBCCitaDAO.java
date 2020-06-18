package ec.edu.ups.mysql.jdbc;

import java.util.List;

import ec.edu.ups.DAO.CitaDAO;
import ec.edu.ups.Modelo.Cita;
import ec.edu.ups.Modelo.Paciente;

public class JDBCCitaDAO extends JDBCGenericDAO<Cita, String> implements CitaDAO{

	@Override
	public void create(Cita entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cita read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cita entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cita entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cita> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente buscarPaciene(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
