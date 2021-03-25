package TerceraActividad;

public class Libro extends Biblioteca implements Prestable {

	// Creaci�n del atributo

	private boolean prestado;

	// Constructor

	public Libro(int codigo, String titulo, int anio, boolean prestado) {

		super(codigo, titulo, anio);

		this.prestado = false;
	}

	// M�todos getters y setters

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

	/* Implementaci�n de los m�todos abtractos de la clase padre */

	/**
	 * M�todo toString
	 */

	public String toString() {

		return "El libro con t�tulo " + titulo + " cuenta con un c�digo que es " + codigo + " y fue publicado en el a�o " + anio
		        + " actualmente el su estado es : " + prestado;

	}

	/**
	 * M�todo que se encargar� de devolver el a�o de publicaci�n
	 */

	public int getYearOfPublication() {

		return anio;

	}

	/**
	 * M�todo que se encargar� de devolver el c�digo
	 */

	public void getCodigo() {

		System.out.println("El c�digo del libro es : " + codigo);

	}

	/* Implementaci�n de los m�todos de la interfaz */

	/**
	 * M�todo para prestar un libro
	 */

	public void prestar() {

		setPrestado(true);
		System.out.println("Libro prestado");

	}

	/**
	 * M�todo para devolver un libro
	 */

	public void devolver() {

		setPrestado(false);
		System.out.println("Libro devuelto");

	}

	/**
	 * M�todo para ver si un libro est� o no prestado
	 */

	public boolean prestado() {
		if (prestado == false) {
			return false;
		} else {
			return true;
		}

	}

}
