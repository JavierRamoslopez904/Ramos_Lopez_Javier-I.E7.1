package TerceraActividad;

public class Libro extends Biblioteca implements Prestable {

	// Creación del atributo

	private boolean prestado;

	// Constructor

	public Libro(int codigo, String titulo, int anio, boolean prestado) {

		super(codigo, titulo, anio);

		this.prestado = false;
	}

	// Métodos getters y setters

	/**
	 * @return the prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * @param prestado
	 *            the prestado to set
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	/* Implementación de los métodos abtractos de la clase padre */

	/**
	 * Método toString
	 */

	public String toString() {

		return "El libro con título " + titulo + " cuenta con un código que es " + codigo + " y fue publicado en el año " + anio
		        + " actualmente el su estado es : " + prestado;

	}

	/**
	 * Método que se encargará de devolver el año de publicación
	 */

	public int getYearOfPublication() {

		return anio;

	}

	/**
	 * Método que se encargará de devolver el código
	 */

	public void getCodigo() {

		System.out.println("El código del libro es : " + codigo);

	}

	/* Implementación de los métodos de la interfaz */

	/**
	 * Método para prestar un libro
	 */

	public void prestar() {

		setPrestado(true);
		System.out.println("Libro prestado");

	}

	/**
	 * Método para devolver un libro
	 */

	public void devolver() {

		setPrestado(false);
		System.out.println("Libro devuelto");

	}

	/**
	 * Método para ver si un libro está o no prestado
	 */

	public boolean prestado() {
		if (prestado == false) {
			return false;
		} else {
			return true;
		}

	}

}
