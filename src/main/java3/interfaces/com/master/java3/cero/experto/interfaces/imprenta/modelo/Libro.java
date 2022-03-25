package interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

	private List<Imprimible> paginas;
	private String autor;
	private String titulo;
	private Genero genero;
	
	
	public Libro(String autor, String titulo, Genero genero) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.paginas = new ArrayList<>();
	}
	
	
	public Libro addPagina(Imprimible pagina){
		paginas.add(pagina);
		return this;
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder("Titulo: ");
		sb.append(this.titulo).append("\n")
			.append("Autor: ").append(this.autor).append("\n")
			.append("Titulo: ").append(this.titulo).append("\n")
			.append("Genero: ").append(this.genero).append("\n");
		
		for(Imprimible pag : this.paginas) {
			sb.append(pag.imprimir()).append("\n");
		}
		return sb.toString();
	}
	
}
