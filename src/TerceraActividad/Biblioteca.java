package TerceraActividad;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author javie
 *
 */
public abstract class Biblioteca {

	// Creación de los atributos

	protected int codigo;

	protected String titulo;

	protected int anio;

	// Creación del constructor

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

	// Definición de los métodos abstractos, para su implementación en las clases hijos

	/**
	 * Método toString
	 */

	public abstract String toString();

	/**
	 * Método que devolverá su año de publicación
	 */

	public abstract int getYearOfPublication();

	/**
	 * Método que devolverá el código
	 */

	public abstract void getCodigo();

}
