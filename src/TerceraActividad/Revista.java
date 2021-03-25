package TerceraActividad;

public class Revista extends Biblioteca {

	// Creación del atributo

	private int numero;

	// Creación del constructor

	public Revista(int codigo, String titulo, int anio, int numero) {

		super(codigo, titulo, anio);

		this.numero = numero;

	}

	// Métodos getters y setters

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/* Implementación de los métodos abtractos de la clase padre */

	/**
	 * Método toString
	 */

	public String toString() {

		return "La revista con título " + titulo + " cuenta con un código que es " + codigo + " y fue publicada en el año " + anio + " siendo su número el :  "
		        + numero;

	}

	/**
	 * Método que se encargará de devolver el año de publicación
	 */

	public int getYearOfPublication() {

		System.out.println("La revista fue publicada en el año ");
		return anio;
	}

	/**
	 * Método que se encargará de devolver el código
	 */

	public void getCodigo() {

		System.out.println("El código de la revista es : " + codigo);

	}

}
