package com.master.java.cero.experto.orientadaObjetos;

public class AutomovilPersona {

	private int id;
	private String fabricante;
	private String modelo;
	private Color color = Color.GRIS;
	private Motor motor;
	private Estanque estanque;
	private Persona persona;
	private Rueda[] ruedas;
	
	
// Vamos añadir la clase Enum que TipoAutomovil.java para que pueda ser utilizada. Con sus get/set
		private TipoAutomovil tipoAutomovil;
	
	/* Creamos el método estatico que por defecto será igual para todos. */
	private static Color colorPatente = Color.NARANJA;
	
	/* Creamos un valor estatico para manetner el último id para luego incrementarlo.*/
	private static int ultimoId;

	/* 1.- Incrementamos el ID */
	public AutomovilPersona() {
		this.id = ++ultimoId;
	}
	
	
	/* Atributo de clase final*/
	public static final Integer VELOCIDAC_MAXIMA_CARRETERA = 120; 
	public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 50;
	
	/* Constructores. */
	public AutomovilPersona(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	/* para no repetir código vamos a llamar a un constructor dentro de otro constructor.
	 * Este constructor va a llamar al constructor de arriba para el fabricante y el modelo.*/
	public AutomovilPersona(String fabricante, String modelo, Color color) {
	//  this.fabricante = fabricante;
	//	this.modelo = modelo;
		this(fabricante, modelo);
		this.color = color;	
	}
	
	public AutomovilPersona(String fabricante, String modelo, Color color, Motor motor) {
	//	this.fabricante = fabricante;
	//	this.modelo = modelo;
	//	this.color = color;	
		this(fabricante, modelo, color);
		this.motor = motor;
	}
		
	public AutomovilPersona(String fabricante, String modelo, Color color, Motor motor,
			Estanque estanque) {
		
	//	this.fabricante = fabricante;
	//	this.modelo = modelo;
	//	this.color = color;
		this(fabricante,modelo,color,motor);
		this.motor = motor;
		this.estanque = estanque;
	}
	
	public AutomovilPersona(String fabricante, String modelo, Color color, Motor motor, Estanque estanque,
			Persona persona, Rueda[] ruedas) {
		this(fabricante,modelo,color,motor,estanque);
		this.persona = persona;
		this.ruedas = ruedas;
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
		sb.append("\nauto.motor = " + this.motor.getCilindrada());
		
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
		return km/(estanque.getCapacidad()*porcentajeGasolina);
	}
	
	/* Otra versión con mismo nombre diferentes métodos -> Se llama sobrecarga de métodos, mismo método pero diferentes tipos de entrada
	 * También llamado principio de Encapsulamiento.
	 * Esté metodo también utiliza el polimorfismo -> Diferentes formar para realizar la misma acción. */	
	public float calcularConsumo(int km, int porcentajeGasolina) {
		return km/(estanque.getCapacidad()*(porcentajeGasolina/100f));
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Estanque getEstanque() {
		return estanque;
	}

	public void setEstanque(Estanque estanque) {
		this.estanque = estanque;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
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
		AutomovilPersona.ultimoId = ultimoId;
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
		AutomovilPersona.colorPatente = colorPatente;
	}
	
	
}
