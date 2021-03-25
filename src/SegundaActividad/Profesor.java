package SegundaActividad;

public class Profesor extends Persona {
	// Vamos a crear los atributos
	protected int despacho;

	// Vamos a crear el constructor
	public Profesor(String nombre, String apellidos, String NIF, Direccion direccion, int despacho) {
		super(nombre, apellidos, NIF, direccion);
		this.despacho = despacho;
	}

	// Vamos a crear los métodos getters y setter
	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return "Profesor [despacho=" + despacho + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion + "]";
	}

}
