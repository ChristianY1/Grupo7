package ec.edu.ups.mysql.jdbc;

import java.util.List;

import ec.edu.ups.DAO.CertificadoMedicoDAO;
import ec.edu.ups.Modelo.CertificadoMedico;
import ec.edu.ups.Modelo.Paciente;

public class JDBCCertificadoMedicoDAO extends JDBCGenericDAO<CertificadoMedico, String> implements CertificadoMedicoDAO{

	@Override
	public void create(CertificadoMedico entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CertificadoMedico read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CertificadoMedico entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CertificadoMedico entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CertificadoMedico> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente buscarPaciene(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
