package QuintaActividad;
import java.util.Scanner;
/**
 * 
 * @author javie
 *
 */
public abstract class Empleado {

	Scanner S = new Scanner (System.in);
	
	// Creación de atributos
	protected String nombre;
	protected String apellido_paterno;
	protected int numero_SS;

	// Creación del constructor
	public Empleado(String nom, String ap_pa, int num_SS) {

		this.nombre = nom;

		this.apellido_paterno = ap_pa;

		this.numero_SS = num_SS;

	}

	/** Creación de los métodos getters y setters de los atributos **/

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
	 * @return the apellido_paterno
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	 * @param apellido_paterno
	 *            the apellido_paterno to set
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	 * @return the numero_SS
	 */
	public int getNumero_SS() {
		return numero_SS;
	}

	/**
	 * @param numero_SS
	 *            the numero_SS to set
	 */
	public void setNumero_SS(int numero_SS) {
		this.numero_SS = numero_SS;
	}
	
	/**
	 * Creación del método obtener que devuelve los tres atributos creados
	 */
	public void obtener() {
		
		System.out.println("El empleado con nombre : " + nombre + " con apellido paterno " + apellido_paterno + "y con nºSS " + numero_SS);
		
	}
	
	/**
	 * Creación del método establecer que se va a encargar de cambiar el valor de los atributos
	 * 
	 */
	public void establecer() {
		String new_name,new_surname;
		int new_SSname;
		
		System.out.println("Introduzca su nuevo nombre : ");
		new_name = S.next();
		
		System.out.println("Intrpduzca su nuevo apellido : ");
		new_surname = S.next();
		
		System.out.println("Introduzca su número de la Seguridad Social");
		new_SSname = S.nextInt();
		
		setNombre(new_name);
		setApellido_paterno(new_surname);
		setNumero_SS(new_SSname);
		
	    System.out.println("El nuevo nombre del empleado es : " + nombre + ", su nuevo apellido es : " + apellido_paterno  
	    		+ " y su nuevo número de la Seguridad Social es : " + numero_SS);
	}

	/** Método toString **/
	@Override
	public String toString() {
		return "Empleado [S=" + S + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", numero_SS=" + numero_SS + "]";
	}
	
	/** Método abstracto **/
	public abstract void ingresos();

}
