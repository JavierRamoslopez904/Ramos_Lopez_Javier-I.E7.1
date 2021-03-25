package CuartaActividad;

/**
 * 
 * @author javie
 *
 */
public class Artista {

	// Creación de los atributos

	private String nombre, lugar_nacimiento, fecha_nacimiento, fecha_muerte;

	// Creación del constructor

	public Artista(String nombre, String ln, String fn, String fm) {

		this.nombre = nombre;

		this.lugar_nacimiento = ln;

		this.fecha_nacimiento = fn;

		this.fecha_muerte = fm;
	}

	/* Generamos los métodos getters y setters */

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the lugar_nacimiento
	 */
	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	/**
	 * @param lugar_nacimiento
	 *            the lugar_nacimiento to set
	 */
	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	/**
	 * @return the fecha_nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento
	 *            the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the fecha_muerte
	 */
	public String getFecha_muerte() {
		return fecha_muerte;
	}

	/**
	 * @param fecha_muerte
	 *            the fecha_muerte to set
	 */
	public void setFecha_muerte(String fecha_muerte) {
		this.fecha_muerte = fecha_muerte;
	}

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", lugar_nacimiento=" + lugar_nacimiento + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_muerte="
		        + fecha_muerte + "]";
	}

}
