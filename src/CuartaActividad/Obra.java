package CuartaActividad;

/**
 * 
 * @author javie
 *
 */
public class Obra {

	// Creación de los atributos

	protected String titulo, autor, anio;

	protected int numero_inventario;

	// Creación del constructor

	public Obra(String titulo, String autor, String anio, int num_inv) {

		this.titulo = titulo;

		this.autor = autor;

		this.anio = anio;

		this.numero_inventario = num_inv;

	}

	/* Creamos los métodos getters y setters */

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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the anio
	 */
	public String getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 *            the anio to set
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/**
	 * @return the numero_inventario
	 */
	public int getNumero_inventario() {
		return numero_inventario;
	}

	/**
	 * @param numero_inventario
	 *            the numero_inventario to set
	 */
	public void setNumero_inventario(int numero_inventario) {
		this.numero_inventario = numero_inventario;
	}

	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", numero_inventario=" + numero_inventario + "]";
	}

}
