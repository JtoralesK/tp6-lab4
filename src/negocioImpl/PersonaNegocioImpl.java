package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daolmpl.PersonaDaolmpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio{
	
	PersonaDao pdao = new PersonaDaolmpl();
	
	@Override
	public boolean insert(Persona persona) {
		boolean estado = false;
		if(persona.getNombre().trim().length()>0 &&
				persona.getApellido().trim().length()>0 &&
				persona.getDni().length()>0) {
			estado=pdao.insert(persona);
		}
		return estado;
	}

	@Override
	public boolean delete(Persona persona) {
		boolean estado=false;
		if(persona.getDni().length()>0) {
			estado= pdao.delete(persona);
		}
		return estado;
	}

	public List<Persona> readAll() {
		return pdao.readAll();
	}
	
}
