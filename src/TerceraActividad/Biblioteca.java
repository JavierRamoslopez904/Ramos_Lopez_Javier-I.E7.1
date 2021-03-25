package TerceraActividad;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author javie
 *
 */
public abstract class Biblioteca {

	// Creaci�n de los atributos

	protected int codigo;

	protected String titulo;

	protected int anio;

	// Creaci�n del constructor

	public Biblioteca(int cod, String tit, int anio) {

		this.codigo = cod;

		this.titulo = tit;

		this.anio = anio;

	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 *            the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Definici�n de los m�todos abstractos, para su implementaci�n en las clases hijos

	/**
	 * M�todo toString
	 */

	public abstract String toString();

	/**
	 * M�todo que devolver� su a�o de publicaci�n
	 */

	public abstract int getYearOfPublication();

	/**
	 * M�todo que devolver� el c�digo
	 */

	public abstract void getCodigo();

}
