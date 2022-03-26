package interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

	private Persona persona;
	private String carrera;
	private List<String> experiencias;
	
	public Curriculum(Persona persona, String carrera, String contenido) {
		super(contenido);
		this.persona = persona;
		this.carrera = carrera;
		this.experiencias = new ArrayList<>();
	}

	public Curriculum addExperiencia(String experencias) {
		this.experiencias.add(experencias);
		return this;
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ")
		.append(persona)
		.append("\n")
		.append("Resumen: ")
		.append(this.contenido)
		.append("\n")
		.append("Profesion: ")
		.append(this.carrera)
		.append("\n")
		.append("Experiencia: ")
		.append("\n");
		
		for (String exp : this.experiencias) {
			sb.append("- ")
			  .append(exp)
			  .append("\n");
		}
		
		return sb.toString();
	}

}
