package ec.edu.modelo;

public class Propietario extends Vehiculo {




	protected String Nombre;
	protected String Apellido;
	protected String Cedula;
	
	
	//Metodos setter y getter
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "Propietario [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + "]";
	}
	
	
	
}
