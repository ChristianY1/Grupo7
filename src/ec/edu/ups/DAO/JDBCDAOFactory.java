package ec.edu.ups.DAO;

public class JDBCDAOFactory extends DAOFactory{

	
	@Override
	public PacienteDAO getPacienteDAO() {
		// TODO Auto-generated method stub
		return new JDBPacienteDAO();
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
