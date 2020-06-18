package ec.edu.ups.DAO;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JDBCDAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PacienteDAO getPacienteDAO();
	public abstract CitaDAO getCitaDAO();
	public abstract ConsultaMedicaDAO getConsultaMedicaDAO();
	public abstract CertificadoMedicoDAO getCertificadoMedicoDAO();
	
	

}
