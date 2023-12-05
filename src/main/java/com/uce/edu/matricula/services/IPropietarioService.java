package com.uce.edu.matricula.services;

import com.uce.edu.matricula.repository.modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscar (String placa);
	public void guardar (Propietario propietario);
	public void actualizar (Propietario propietario);
	public void eliminar (String placa);


}
