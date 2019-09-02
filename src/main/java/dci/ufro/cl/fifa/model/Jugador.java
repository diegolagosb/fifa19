package dci.ufro.cl.fifa.model;

public class Jugador {

	private int id;
	private String nombre;
	private int edad;
	private String fotografia;
	private String nacionalidad;
	private int rating;
	private String club;
	private int potencial;
	private int velocidad;
	private int controlBalon;
	private int agilidad;
	private int resistencia;

	/**
	 * @param id
	 * @param fotografia
	 * @param nombre
	 * @param nacionalidad
	 * @param rating
	 * @param edad
	 * @param club
	 * @param potencial
	 * @param velocidad
	 * @param controlBalon
	 * @param agilidad
	 * @param resistencia
	 */
	public Jugador(int id, String fotografia, String nombre, String nacionalidad, int rating, int edad, String club, int potencial, int velocidad, int controlBalon, int agilidad, int resistencia) {
        this.id = id;
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rating = rating;
        this.edad = edad;
        this.club = club;
        this.potencial = potencial;
        this.velocidad = velocidad;
        this.controlBalon = controlBalon;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
    }

	public Jugador(){

	}

	public String getFotografia() {
		return this.fotografia;
	}

	/**
	 * 
	 * @param fotografia
	 */
	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {this.id = id;}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getClub() {
		return this.club;
	}

	/**
	 * 
	 * @param club
	 */
	public void setClub(String club) {
		this.club = club;
	}

	public int getPotencial() {
		return this.potencial;
	}

	/**
	 * 
	 * @param potencial
	 */
	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getControlBalon() {
		return this.controlBalon;
	}

	/**
	 * 
	 * @param controlBalon
	 */
	public void setControlBalon(int controlBalon) {
		this.controlBalon = controlBalon;
	}

	public int getAgilidad() {
		return this.agilidad;
	}

	/**
	 * 
	 * @param agilidad
	 */
	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public int getResistencia() {
		return this.resistencia;
	}

	/**
	 * 
	 * @param resistencia
	 */
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Jugador{id=" + id +", nombre='" + nombre + ", edad=" + edad + ", fotografia='" + fotografia +", nacionalidad='" + nacionalidad +", rating=" + rating +", club='" + club +", potencial=" + potencial +'}';
	}
}