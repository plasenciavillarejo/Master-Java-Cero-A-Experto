package interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo;

public class Persona {

	private String nombre;
	private String apellido;
	
	// Constructor vacío por si queremos crear una persona y añadir el nombre o apellido.
	public Persona() {
		
	}
	
	// Constructor para crear una persona en la que se le pasa el nombre y el apellido.
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
	
	
	
}
