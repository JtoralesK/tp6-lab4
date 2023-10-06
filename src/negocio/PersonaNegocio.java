package negocio;

import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {
	public boolean insert (Persona persona);
	public boolean delete (Persona persona);
	public static List<Persona> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
