package main;

import java.util.List;

import daolmpl.PersonaDaolmpl;
import entidad.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDaolmpl n = new PersonaDaolmpl();
		try{
			List <Persona> listPersonas = n.readAll();
			for(Persona p :listPersonas) {
				System.out.println(p);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
