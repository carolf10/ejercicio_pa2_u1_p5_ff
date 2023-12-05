package com.uce.edu.matricula.services;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

public interface IVehiculoServices {
	public Vehiculo buscar (String placa);
	public void guardar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public void eliminar (String placa);


}
