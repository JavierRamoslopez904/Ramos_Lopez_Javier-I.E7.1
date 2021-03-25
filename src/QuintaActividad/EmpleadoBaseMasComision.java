package QuintaActividad;
/**
 * 
 * @author javie
 *
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{

	//Creaci�n del �nico atributo
	private double salario;
	
	//Creaci�n del constructor
	public EmpleadoBaseMasComision(String nombre,String apellido_paterno,int num_SS,int ventas,double tarifa,double salario) {
		super(nombre,apellido_paterno,num_SS,ventas,tarifa);
		
		this.salario = salario;
	}
	
	/** M�todos getters y setters del atributo salario base **/
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**M�todo que se encarga de asignarle otro valor al atributo salario base **/
	public void establecer() {
		double new_salario;
		
		System.out.println("Por favor, introduzca su nuevo salario : " );
		new_salario = S.nextDouble();
		
		setSalario(new_salario);
		
		System.out.println("Su nuevo salario base es de : " + new_salario);
	}
	
	/**M�todo que se encarga de mostrar el valor de su salario base sin realizar ning�n
	 * tipo de cambio
	 */
	public void obtener() {
		
		System.out.println("El valor del salario es de : " + salario + " �");
		
	}
	
	/**M�todo que se encargar� de calcular los ingresos de los empleados de base mas comision **/
	public void ingresos() {
		double total;
		
		total = (tarifa_comision * ventas) + salario;
		
		System.out.println("Sus ingresos son de " + total + "�");
		
	}

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [salario=" + salario + ", ventas=" + ventas + ", tarifa_comision=" + tarifa_comision + ", salario_base=" + salario_base
		        + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", numero_SS=" + numero_SS + "]";
	}
}
