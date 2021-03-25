package SegundaActividad;

public class Estudiante extends Persona {
	// Vamos a definir los atributos
	protected int ID;

	// Vamos a implementar el constructor
	public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, int ID) {
		super(nombre, apellidos, NIF, direccion);
		this.ID = ID;
	}

	// Vamos a crear los métodos getters y setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Estudiante [ID=" + ID + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion + "]";
	}

}
