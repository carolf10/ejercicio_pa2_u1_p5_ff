package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> base = new ArrayList<>();
	@Override
	public Vehiculo seleccionar(String placa) {
		for(Vehiculo vehiculo:base) {
			if(vehiculo.getPlaca().equals(placa)) {
				Vehiculo vhl = new Vehiculo();
				vhl.setMarca(vehiculo.getMarca());
				vhl.setPlaca(vehiculo.getPlaca());
				vhl.setPrecio(vehiculo.getPrecio());
				vhl.setTipo(vehiculo.getTipo());
				return vhl;
			}
		}
		return null;
	}
	
	public Vehiculo seleccionarEliminar(String placa) {
		for(Vehiculo vehiculo:base) {
			if(vehiculo.getPlaca().equals(placa)) {
				return vehiculo;
			}
		}
		return null;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		base.add(vehiculo);

	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.actualizar(vehiculo);

	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehiculo = this.seleccionarEliminar(placa);
		base.remove(vehiculo);

	}

}
