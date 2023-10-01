package dao;

import java.util.List;

import entidad.Persona;

public interface PersonaDao {
	
	public boolean insert(Persona person);
	public boolean delete(Persona personaToDelete);
	public List<Persona> readAll();
}
