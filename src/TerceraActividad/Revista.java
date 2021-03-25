package TerceraActividad;

public class Revista extends Biblioteca {

	// Creaci�n del atributo

	private int numero;

	// Creaci�n del constructor

	public Revista(int codigo, String titulo, int anio, int numero) {

		super(codigo, titulo, anio);

		this.numero = numero;

	}

	// M�todos getters y setters

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

	/* Implementaci�n de los m�todos abtractos de la clase padre */

	/**
	 * M�todo toString
	 */

	public String toString() {

		return "La revista con t�tulo " + titulo + " cuenta con un c�digo que es " + codigo + " y fue publicada en el a�o " + anio + " siendo su n�mero el :  "
		        + numero;

	}

	/**
	 * M�todo que se encargar� de devolver el a�o de publicaci�n
	 */

	public int getYearOfPublication() {

		System.out.println("La revista fue publicada en el a�o ");
		return anio;
	}

	/**
	 * M�todo que se encargar� de devolver el c�digo
	 */

	public void getCodigo() {

		System.out.println("El c�digo de la revista es : " + codigo);

	}

}
