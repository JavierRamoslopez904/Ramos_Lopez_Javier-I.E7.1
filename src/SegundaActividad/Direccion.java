package SegundaActividad;

public class Direccion {
	// Vamos a definir los atributos
	private String calle;
	private String ciudad;
	private int codigo_postal;
	private String pais;

	// Vamos a crear un constructor
	public Direccion(String calle, String ciudad, int cod, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigo_postal = cod;
		this.pais = pais;
	}

	// Aunque el ejercicio no nos pida crear los métodos getters y setters, vamos a crearlos
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigo_postal=" + codigo_postal + ", pais=" + pais + "]";
	}

}
