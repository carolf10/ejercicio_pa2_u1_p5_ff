package com.uce.edu.matricula.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Matricula {
	private Propietario propietario;
	private Vehiculo vehiculo;
	private BigDecimal valorMatricula;
	private LocalDateTime fechaMatricula;
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	@Override
	public String toString() {
		return "Matricula [propietario=" + propietario + ", vehiculo=" + vehiculo + ", valorMatricula=" + valorMatricula
				+ ", fechaMatricula=" + fechaMatricula + "]";
	}
	

}
