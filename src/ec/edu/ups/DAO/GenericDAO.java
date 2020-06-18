package ec.edu.ups.DAO;

import java.util.List;

import ec.edu.ups.Modelo.Paciente;

public interface GenericDAO<T, ID> {
	
	public void create(T entity);
	public T read(ID id);
	public void update(T entity);
	public void delete(T entity);
	public List<T> find();
	public Paciente buscarPaciene(ID id);
	
}
