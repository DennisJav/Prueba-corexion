package ec.edu.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Vehiculo {
	protected String Marca;
	protected String paisOrigen;
	protected String Placa;
	protected int Tipo;
	protected double Precio;
	protected double valorMatricula;
	protected Propietario datos;
	protected VehiculoLiviano datosLiviano;
	protected VehiculoPesado datosPesado;
	
	

	public static final Logger LOG = LoggerFactory.getLogger( Vehiculo.class);
	
	
//	public Vehiculo(Propietario datos) {
//		this.datos = datos;
//	}
	
//	public String VehiculoPropietario(String nombre, String apellido, String cedula) {
//		
//		this.datos.setApellido(apellido);
//		this.datos.setNombre(nombre);
//		this.datos.setCedula(cedula);
//		
//		
//		return "DAtos guardados ";
//		
//	}
	
	



	//Metodos setter y getter
	public String getMarca() {
		return Marca;
	}
	@Override
	public String toString() {
		return "Vehiculo [Marca=" + Marca + ", paisOrigen=" + paisOrigen + ", Placa=" + Placa + ", Tipo=" + Tipo
				+ ", Precio=" + Precio + ", valorMatricula=" + valorMatricula + ", datos=" + datos + ", datosLiviano="
				+ datosLiviano + ", datosPesado=" + datosPesado + "]";
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getDatos() {
		return datos;
	}

	public void setDatos(Propietario datos) {
		this.datos = datos;
	}
	
	public VehiculoLiviano getDatosLiviano() {
		return datosLiviano;
	}



	public void setDatosLiviano(VehiculoLiviano datosLiviano) {
		this.datosLiviano = datosLiviano;
	}



	public VehiculoPesado getDatosPesado() {
		return datosPesado;
	}



	public void setDatosPesado(VehiculoPesado datosPesado) {
		this.datosPesado = datosPesado;
	}

	
}
