package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	
	private static List<Propietario> base= new ArrayList<>();

	@Override
	public Propietario seleccionar(String cedula) {
		for(Propietario propietario:base) {
			if(propietario.getCedula().equals(cedula)) {
				Propietario ptr = new Propietario();
				ptr.setApellido(propietario.getApellido());
				ptr.setCedula(propietario.getCedula());
				ptr.setGenero(propietario.getGenero());
				ptr.setNombre(propietario.getNombre());
				return ptr;
			}
		}
		return null;
	}
	
	public Propietario seleccionarEliminar(String placa) {
		for(Propietario propietario:base) {
			if(propietario.getCedula().equals(placa)) {
				return propietario;
			}
		}
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		Propietario propietario= this.seleccionarEliminar(cedula);
		base.remove(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getCedula());
		this.actualizar(propietario);
		
	}

	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);
		
	}

}
