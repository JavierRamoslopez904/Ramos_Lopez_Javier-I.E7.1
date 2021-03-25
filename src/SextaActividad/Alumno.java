package SextaActividad;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author javie
 *
 */
public class Alumno {

	Scanner S = new Scanner (System.in);
	
	// Creación de colecciones para ver aquellos cursos realizados y los cursos actuales
	List<Curso> cursos_realizados;

	List<Curso> cursos_actuales;

	// Creación de atributos
	private String nombre, DNI;
	private double saldo;

	// Creación del constructor
	public Alumno(String nom, String DNI, double sal) {
		
		this.nombre = nom;
		
		this.DNI = DNI;
		
		this.saldo = sal;
	
	}
	/** Métodos getters y setters **/
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**Método que se encarga de aumentar el saldo, una cantidad definida por el usuario  **/
	public void incrementarSaldo() {
		double new_saldo;
		System.out.println("¿Cuánto dinero quiere añadir a su saldo?");
		new_saldo = S.nextInt();
		
		saldo = saldo + new_saldo;
		
		System.out.println("Por lo que su saldo actualizado es de : " + saldo + " €");
		
	}
	
	/**Método que se encarga de reducir el saldo, una cantidad definida por el usuario **/
	public void decrementarSaldo() {
		double new_saldo;
		System.out.println("¿Cuánto dinero quiere retirar de su saldo?");
		new_saldo = S.nextInt();
		
		saldo = saldo - new_saldo;
		
		System.out.println("Por lo que su saldo actualizado es de : " + saldo + " €");
		
	}
	@Override
	public String toString() {
		return "Alumno [S=" + S + ", cursos_realizados=" + cursos_realizados + ", cursos_actuales=" + cursos_actuales + ", nombre=" + nombre + ", DNI=" + DNI
		        + ", saldo=" + saldo + "]";
	}

}
