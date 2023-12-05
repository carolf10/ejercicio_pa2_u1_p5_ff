package com.uce.edu.matricula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionar(cedula);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.iPropietarioRepository.actualizar(propietario);

	}

	@Override
	public void eliminar(String placa) {
		this.iPropietarioRepository.eliminar(placa);

	}

	@Override
	public void guardar(Propietario propietario) {
		this.iPropietarioRepository.insertar(propietario);
		
	}

}
