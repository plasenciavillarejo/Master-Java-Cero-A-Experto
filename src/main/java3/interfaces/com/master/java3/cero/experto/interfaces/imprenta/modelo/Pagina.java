package interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{

	public Pagina(String contenido) {
		super(contenido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imprimir() {
		return this.contenido;
	}

}
