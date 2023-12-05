package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	
	private static List<Matricula> base= new ArrayList<>();

	@Override
	public Matricula seleccionar(String placa, String cedula) {
		for(Matricula matricula:base) {
			if(matricula.getVehiculo().getPlaca().equals(placa) && matricula.getPropietario().getCedula().equals(cedula)) {
				Matricula mtl = new Matricula();
				mtl.setFechaMatricula(matricula.getFechaMatricula());
				mtl.setPropietario(matricula.getPropietario());
				mtl.setValorMatricula(matricula.getValorMatricula());
				mtl.setVehiculo(matricula.getVehiculo());
				return mtl;
			}
		}
		return null;
	}

	@Override
	public void insetar(Matricula matricula) {
		base.add(matricula);
		
	}

}
