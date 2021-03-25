package QuintaActividad;
/**
 * 
 * @author javie
 *
 */
public class EmpleadosAsalariados extends Empleado{

	//Creación del único atributo de la clase EmpleadosAsalariados
	
	private double salario_semanal;
	
	//Creación del constructor
	
	public EmpleadosAsalariados(String nombre, String apellido_paterno, int num_SS, double salario_semanal) {
		
		super(nombre,apellido_paterno,num_SS);
		
		this.salario_semanal = salario_semanal;
		
	}
	
	/** Métodos getters y setters del atributo **/

	/**
	 * @return the salario_semanal
	 */
	public double getSalario_semanal() {
		return salario_semanal;
	}

	/**
	 * @param salario_semanal the salario_semanal to set
	 */
	public void setSalario_semanal(double salario_semanal) {
		this.salario_semanal = salario_semanal;
	}
	
	/** Este método se va a encargar de determinar si el salario semanal es positivo o negativo **/
	public void establecer() {
		
		if(salario_semanal >= 0) {
			
			System.out.println("Su salario semanal es : " + salario_semanal);
			
		}else {
			
			System.out.println("ERROR : ¡¡¡ NO PUEDE ALMACENAR UNA CANTIDAD NEGATIVA !!!");
		}
	}
	
	/** Este método se va a encargar de devolver el valor del salario semanal 
	 * @return **/
	public void obtener() {
		
		System.out.println("El salario semanal es de : " + salario_semanal);
		
	}
	
	/** Este método se va a encargar de devolver los ingresos del empleado asalarial **/
	public void ingresos() {
		
		System.out.println("Para el empleado asalariado, sus ingresos son únicamente el salario semanal");
		System.out.println("El salario es : " + salario_semanal);
		
	}

	@Override
	public String toString() {
		return "EmpleadosAsalariados [salario_semanal=" + salario_semanal + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", numero_SS="
		        + numero_SS + "]";
	}
}
