package CuartaActividad;

/**
 * 
 * @author javie
 *
 */
public class Escultura extends Obra {

	// Creación de los atributos

	private String material;

	private  Integer altura;

	// Creación del constructor, se hará referencia a los atributos de la clase padre con el super();

	public Escultura(String titulo, String autor, String anio, int num_inv, String mat, Integer alt) {

		super(titulo, autor, anio, num_inv);

		this.material = mat;

		this.altura = alt;

	}

	// Creamos los métodos getters y setter

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the altura
	 */
	public Integer getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Escultura [material=" + material + ", altura=" + altura + ", titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", numero_inventario="
		        + numero_inventario + "]";
	}

}
