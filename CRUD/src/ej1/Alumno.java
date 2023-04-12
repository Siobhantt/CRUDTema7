package ej1;

public class Alumno {
	/**
	 * Atributo del nombre del alumno
	 */
	private String nombre;
	/**
	 * Nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Obtiene el nombre del alumno
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del alumno
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la nota media del alumno
	 * 
	 * @return
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * establece la nota media del alumno
	 * 
	 * @param notaMedia
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre    del alumno
	 * @param notaMedia del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
}
