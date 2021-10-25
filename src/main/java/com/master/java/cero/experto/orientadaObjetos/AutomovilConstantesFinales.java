package com.master.java.cero.experto.orientadaObjetos;

public class AutomovilConstantesFinales {

	private int id;
	private String fabricante;
	private String modelo;
	private Color color = Color.GRIS;
	private double cilindrada;
	private int capacidadEstanque = 40;
	
	
// Vamos añadir la clase Enum que TipoAutomovil.java para que pueda ser utilizada. Con sus get/set
		private TipoAutomovil tipoAutomovil;
	
	/* Creamos el método estatico que por defecto será igual para todos. */
	private static Color colorPatente = Color.NARANJA;
	
	/* Creamos un valor estatico para manetner el último id para luego incrementarlo.*/
	private static int ultimoId;

	/* 1.- Incrementamos el ID */
	public AutomovilConstantesFinales() {
		this.id = ++ultimoId;
	}
	
	
	/* Atributo de clase final*/
	public static final Integer VELOCIDAC_MAXIMA_CARRETERA = 120; 
	public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 50;
	
	/* Constructores. */
	public AutomovilConstantesFinales(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	/* para no repetir código vamos a llamar a un constructor dentro de otro constructor.
	 * Este constructor va a llamar al constructor de arriba para el fabricante y el modelo.*/
	public AutomovilConstantesFinales(String fabricante, String modelo, Color color) {
	//  this.fabricante = fabricante;
	//	this.modelo = modelo;
		this(fabricante, modelo);
		this.color = color;	
	}
	
	public AutomovilConstantesFinales(String fabricante, String modelo, Color color, double Cilindrada) {
	//	this.fabricante = fabricante;
	//	this.modelo = modelo;
	//	this.color = color;	
		this(fabricante, modelo, color);
		this.cilindrada = cilindrada;
	}
		
	public AutomovilConstantesFinales(String fabricante, String modelo, Color color, double cilindrada,
			int capacidadEstanque) {
		
	//	this.fabricante = fabricante;
	//	this.modelo = modelo;
	//	this.color = color;
		this(fabricante,modelo,color,cilindrada);
		this.cilindrada = cilindrada;
		this.capacidadEstanque = capacidadEstanque;
	}

	/* 1.- Static= Hace que el atributo sea de la clase.
	 * 2.- Final = Hace que el atributo sea una constante y no se pueda modificar en la herencia .*/
	public String verDetalle() {
		/* 1.- Mostramos el detalle del Automovil.
		 * 2.- Siempre que quiera acceder aun método de la misma clase tengo que usar el -> "this." */
		
		StringBuilder sb = new StringBuilder();
		sb.append("auto.id = " + this.id);
		sb.append("\nauto.fabricante = " + this.fabricante);
		sb.append("\nauto.modelo = " + this.modelo);
		sb.append("\nauto.tipo = " + this.tipoAutomovil);
		sb.append("\nauto.color = " + this.color);
		sb.append("\nauto.patenteColor = " + colorPatente);
		sb.append("\nauto.cilindrada = " + this.cilindrada);
		
		return sb.toString();
	}
	
	/* Clase Frenar. */
	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando!";
	}
	
	/* Clase Acelerar. */
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		
		return acelerar + "\n" + frenar;
	}
	
	/* Calculamos la cantidad de gasolina gastada*/
	public float calcularConsumo(int km, float porcentajeGasolina) {
		return km/(capacidadEstanque*porcentajeGasolina);
	}
	
	/* Otra versión con mismo nombre diferentes métodos -> Se llama sobrecarga de métodos, mismo método pero diferentes tipos de entrada
	 * También llamado principio de Encapsulamiento.
	 * Esté metodo también utiliza el polimorfismo -> Diferentes formar para realizar la misma acción. */	
	public float calcularConsumo(int km, int porcentajeGasolina) {
		return km/(capacidadEstanque*(porcentajeGasolina/100f));
	}
	
	/* Clase Acelerar. */
	public String acelerar(int rpm) {
		return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
	}
	
	
	/* Get and Set */
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadEstanque() {
		return capacidadEstanque;
	}

	public void setCapacidadEstanque(int capacidadEstanque) {
		this.capacidadEstanque = capacidadEstanque;
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getUltimoId() {
		return ultimoId;
	}

	public static void setUltimoId(int ultimoId) {
		AutomovilConstantesFinales.ultimoId = ultimoId;
	}

	public TipoAutomovil getTipoAutomovil() {
		return tipoAutomovil;
	}

	public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
	}
	
	
	public static Color getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(Color colorPatente) {
		AutomovilConstantesFinales.colorPatente = colorPatente;
	}
	
	
}
