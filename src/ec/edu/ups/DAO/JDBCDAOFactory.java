package ec.edu.ups.DAO;

import ec.edu.ups.mysql.jdbc.JDBCCertificadoMedicoDAO;
import ec.edu.ups.mysql.jdbc.JDBCCitaDAO;
import ec.edu.ups.mysql.jdbc.JDBCConsultaMedicaDAO;
import ec.edu.ups.mysql.jdbc.JDBCPacienteDAO;

public class JDBCDAOFactory extends DAOFactory{

	
	@Override
	public PacienteDAO getPacienteDAO() {
		// TODO Auto-generated method stub
		return new JDBCPacienteDAO();
	}

	@Override
	public CitaDAO getCitaDAO() {
		// TODO Auto-generated method stub
		return new JDBCCitaDAO();
	}

	@Override
	public ConsultaMedicaDAO getConsultaMedicaDAO() {
		// TODO Auto-generated method stub
		return new JDBCConsultaMedicaDAO();
	}

	@Override
	public CertificadoMedicoDAO getCertificadoMedicoDAO() {
		// TODO Auto-generated method stub
		return new JDBCCertificadoMedicoDAO();
	}

}
