package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;
import com.uce.edu.matricula.services.IMatriculaService;
import com.uce.edu.matricula.services.IPropietarioService;
import com.uce.edu.matricula.services.IVehiculoServices;

@SpringBootApplication
public class EjercicioPaU1P5FfApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoServices iVehiculoServices;
	@Autowired 
	private IPropietarioService iPropietarioService;
	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P5FfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("FGJ-2323");
		vehiculo.setPrecio(new BigDecimal(5000));
		vehiculo.setTipo("liviano");
		
		this.iVehiculoServices.guardar(vehiculo);
		System.out.println(vehiculo);
		
		Propietario propietario = new Propietario();
		propietario.setNombre("Fatima");
		propietario.setApellido("Fiallos");
		propietario.setCedula("1753341344");
		propietario.setGenero("mujer");
		this.iPropietarioService.guardar(propietario);
		System.out.println(propietario);
		
		System.out.println("Datos actualizados");
		propietario.setNombre("Maria");
		propietario.setApellido("Checa");
		System.out.println(propietario);
		
		System.out.println("Creacion de la matricula del vehiculo y su valor de matricula: ");
		this.iMatriculaService.crearMatricula(vehiculo, propietario);
		
	}

}
