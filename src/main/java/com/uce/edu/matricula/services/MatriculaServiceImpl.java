package com.uce.edu.matricula.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IMatriculaRepository;
import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public Matricula buscar(String placa, String cedula) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.seleccionar(placa, cedula);
	}

	@Override
	public void guardar(Matricula matricula) {
		this.iMatriculaRepository.insetar(matricula);
		
	}

	@Override
	public void crearMatricula(Vehiculo vehiculo, Propietario propietario) {
		BigDecimal valorMatricula=null;
		if(this.buscar(vehiculo.getPlaca(), propietario.getCedula())==null){
			if(vehiculo.getPlaca().equals("pesado")) {
				BigDecimal pesadpVal= new BigDecimal(0.25);
				valorMatricula = vehiculo.getPrecio().multiply(pesadpVal);
				System.out.println("El valor de la matricula es: " + valorMatricula);
			}else if(vehiculo.getTipo().equals("liviano")) {
				BigDecimal livianoVal= new BigDecimal(0.2);
				valorMatricula = vehiculo.getPrecio().multiply(livianoVal);
				System.out.println("El valor de la matricula es: " + valorMatricula);
			}
			
			if(valorMatricula.compareTo(new BigDecimal(2200)) == 1) {
				BigDecimal descuento= valorMatricula.multiply(new BigDecimal(0.05));
				valorMatricula= valorMatricula.subtract(descuento);
				System.out.println("El valor de la matricula con descuento es: "+ valorMatricula);	
			}
			
			Matricula matricula = new Matricula();
			matricula.setFechaMatricula(LocalDateTime.now());
			matricula.setPropietario(propietario);
			matricula.setValorMatricula(valorMatricula);
			matricula.setVehiculo(vehiculo);
			this.guardar(matricula);
			
			System.out.println("Datos de la matricula: \n" +  matricula);
			
		}
		
	}

	
}
