package ec.edu.service;


import ec.edu.modelo.Vehiculo;

public interface IMatriculaService {
	
	double calcularMatricula(double precio, int tipo);
	String mensajesPrecio(double precio);
	
}
