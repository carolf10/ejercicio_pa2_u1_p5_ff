package com.uce.edu.matricula.services;

import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

public interface IMatriculaService {
	public Matricula buscar (String placa, String cedula);
	public void guardar (Matricula matricula);
	public void crearMatricula (Vehiculo vehiculo, Propietario propietario);


}
