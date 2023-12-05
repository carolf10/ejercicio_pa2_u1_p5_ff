package com.uce.edu.matricula.repository;

import com.uce.edu.matricula.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public Matricula seleccionar (String placa, String cedula);
	public void insetar (Matricula matricula);


}
