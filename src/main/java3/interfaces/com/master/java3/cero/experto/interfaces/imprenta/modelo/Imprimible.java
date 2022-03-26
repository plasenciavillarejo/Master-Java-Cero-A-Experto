package interfaces.com.master.java3.cero.experto.interfaces.imprenta.modelo;

public interface Imprimible {

	/* **************************************************************************** */
	/* NOTA: Una interfaz solo puede contener métodos que sea finales o estaticos */
	/* **************************************************************************** */
	
	/* Puede implementar clases finales estáticas */
	final static String TEXTO_DEFECTO = "\n Imprimiendo una Libro sin implementar el método en la clase hija (LIBRO) método por defecto defaul desde la interfaz";
	
	/* Un método cuando es public también es default por tanto, si queremos tener buenas práctias.
	 cuando creemos un métod public por defecto no se indica. Se quedaría tal y como lo hemos dejado abajo
	 public String imprimit() => String imprimir()
	 */
	
	//String imprimir();
	
	/*
	 * Una característica de java 8 es que las interfaces pueden implementar un método con cuerpo esto hace que las clases hijas
	 	no estén obligadas a implementar dicho método en ellas. Si no que por defecto todo se implementa en la interfaz.
	  Un ejemplo sería el siguiente:
	  	Si comentamos por ejemplo el método Public String imprimir() de la clase Libro, automaticamente implementaría el método 
	  	implemenado desde la interfaz.
	  */
	
	default String imprimir(){
		return TEXTO_DEFECTO;
	}

	
	/* Se puede implementar también método staticos, que dichos métodos pertenecen a la interfaz. */
	
	static void imprimir(Imprimible imprimible) {
		System.out.println(imprimible.imprimir());
	}
	

}