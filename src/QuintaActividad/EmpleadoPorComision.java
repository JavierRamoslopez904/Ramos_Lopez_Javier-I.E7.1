package QuintaActividad;
/**
 * 
 * @author javie
 *
 */
public class EmpleadoPorComision extends Empleado{

	//Creación de los atributos de la clase
	protected int ventas;
	
	protected double tarifa_comision;
	
	protected double salario_base;
	
	//Creación del constructor
	
	public EmpleadoPorComision(String nombre, String apellido_paterno,int num_SS,int ventas, double tarifa) {
		super(nombre,apellido_paterno,num_SS);
		
		this.ventas = ventas;
		
		this.tarifa_comision = tarifa;
	}

	/** Métodos getters y setters de los atributos **/
	/**
	 * @return the ventas
	 */
	public int getVentas() {
		return ventas;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	/**
	 * @return the tarifa_comision
	 */
	public double getTarifa_comision() {
		return tarifa_comision;
	}

	/**
	 * @param tarifa_comision the tarifa_comision to set
	 */
	public void setTarifa_comision(double tarifa_comision) {
		this.tarifa_comision = tarifa_comision;
	}

	/**
	 * @return the salario_base
	 */
	public double getSalario_base() {
		return salario_base;
	}

	/**
	 * @param salario_base the salario_base to set
	 */
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	/**Método para cambiarle el valor a los atributos ventas y tarifa de comision **/
	public void establecer() {
		int new_ventas;
		double new_tarifa;
		System.out.println("Por favor, introduzca el nuevo valor de las ventas : ");
		new_ventas = S.nextInt();
		
		System.out.println("Por favor, introduzca el nuevo valor de la tarifa");
		new_tarifa = S.nextInt();
		
		setTarifa_comision(new_tarifa);		
		setVentas(new_ventas);
		
		System.out.println("<== CAMBIOS APLICADOS ==>");
		System.out.println("Su nuevo valor de tarifas por comision es de : " + tarifa_comision + " €, y el nuevo valor de las ventas es de : " + ventas + " €");
	}
	
	/*Método para obtener los valores de los atributos **/
	public void obtener() {
		
		System.out.println("El importe de las ventas es de : " + ventas + " €, y la comisión de la tarifa es de : " + tarifa_comision + " €");
		
	}
	
	/**Método para calcular los ingresos de los empleados por comision **/
	public void ingresos() {
		double total;
		
		total = ventas * tarifa_comision;
		
		System.out.println("El valor total de sus ingresos es de : " + total + "€");
	}

	@Override
	public String toString() {
		return "EmpleadoPorComision [ventas=" + ventas + ", tarifa_comision=" + tarifa_comision + ", salario_base=" + salario_base + ", nombre=" + nombre
		        + ", apellido_paterno=" + apellido_paterno + ", numero_SS=" + numero_SS + "]";
	}
	
	
	
}
