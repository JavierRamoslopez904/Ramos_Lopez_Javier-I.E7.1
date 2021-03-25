package CuartaActividad;

/**
 * 
 * @author javie
 *
 */
public class Pintura extends Obra {

	// Creación de los atributos

	private double dimension;

	private String soporte;

	// Creación del constructor

	public Pintura(String titulo, String anio, String autor, int num_inv, double di, String sop) {

		super(titulo, anio, autor, num_inv);

		this.dimension = di;

		this.soporte = sop;

	}

	/* Creación de los métodos getters y setters */

	/**
	 * @return the dimension
	 */
	public double getDimension() {
		return dimension;
	}

	/**
	 * @param dimension
	 *            the dimension to set
	 */
	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the soporte
	 */
	public String getSoporte() {
		return soporte;
	}

	/**
	 * @param soporte
	 *            the soporte to set
	 */
	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	@Override
	public String toString() {
		return "Pintura [dimension=" + dimension + ", soporte=" + soporte + ", titulo=" + titulo + ", autor=" + autor + ", anio=" + anio
		        + ", numero_inventario=" + numero_inventario + "]";
	}

}
