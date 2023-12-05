package com.uce.edu.matricula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IVehiculoRepository;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoServices {
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.seleccionar(placa);
	}

	@Override
	public void guardar(Vehiculo vehiculo) {
		this.iVehiculoRepository.insertar(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.iVehiculoRepository.actualizar(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		this.iVehiculoRepository.eliminar(placa);
		
	}

}
