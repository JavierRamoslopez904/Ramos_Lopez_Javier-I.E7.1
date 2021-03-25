package SextaActividad;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author javie
 *
 */
public class Curso {

	Scanner S = new Scanner(System.in);

	// Creaci�n de una colecci�n
	List<Alumno> alumnos_matriculados;

	// Creaci�n de atributos
	protected String titulo, fecha_inicio, fecha_fin;
	protected int num_dias_clase, num_alumnos_matriculados;
	protected double precio;

	// Creaci�n del constructor
	public Curso(String tit, String fi, String ff, int ndc, int nam, double pr) {

		this.titulo = tit;

		this.fecha_inicio = fi;

		this.fecha_fin = ff;

		this.num_dias_clase = ndc;

		this.num_alumnos_matriculados = nam;

		this.precio = pr;

	}

	/** M�todos getters y setters **/
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fecha_inicio
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}

	/**
	 * @return the fecha_fin
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}

	/**
	 * @return the num_dias_clase
	 */
	public int getNum_dias_clase() {
		return num_dias_clase;
	}

	/**
	 * @return the num_alumnos_matriculados
	 */
	public int getNum_alumnos_matriculados() {
		return num_alumnos_matriculados;
	}

	/**
	 * @param num_alumnos_matriculados
	 *            the num_alumnos_matriculados to set
	 */
	public void setNum_alumnos_matriculados(int num_alumnos_matriculados) {
		this.num_alumnos_matriculados = num_alumnos_matriculados;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * M�todo inscripci�n que servir� para ver si un alumno est� matriculado en un curso
	 */
	public void inscripcion() {
		
		
	}


	public void expedirse(Alumno a) {
		
		
	}
}
