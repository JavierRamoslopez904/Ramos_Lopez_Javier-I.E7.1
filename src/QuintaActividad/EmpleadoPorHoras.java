package QuintaActividad;
/**
 * 
 * @author javie
 *
 */
public class EmpleadoPorHoras extends Empleado{

	//Creación de los atributos
	
	private int sueldo_horas;
	
	private int numero_horas;
	
	//Creación del constructor
	
	public EmpleadoPorHoras(String nombre, String apellido_paterno,int num_SS,int sueldo_horas, int numero_horas) {
		super(nombre,apellido_paterno,num_SS);
		
		this.numero_horas = numero_horas;
		
		this.sueldo_horas = sueldo_horas;
	}
	
	/** Implementación de los métodos getters y setters **/
	/**
	 * @return the sueldo_horas
	 */
	public int getSueldo_horas() {
		return sueldo_horas;
	}

	/**
	 * @param sueldo_horas the sueldo_horas to set
	 */
	public void setSueldo_horas(int sueldo_horas) {
		this.sueldo_horas = sueldo_horas;
	}

	/**
	 * @return the numero_horas
	 */
	public int getNumero_horas() {
		return numero_horas;
	}

	/**
	 * @param numero_horas the numero_horas to set
	 */
	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}
	
	/**Este método se va a encargar de establecer de darle un nuevo valor, elegido por el usuario
	 * a las variables new_horas y new_sueldo
	 */
	public void establecer() {
		int new_horas,new_sueldo;
		System.out.println("Introduzca el número de horas : ");
		new_horas = S.nextInt();
		
		System.out.println("Introduzca lo que cobra usted a la hora : ");
		new_sueldo = S.nextInt();
		
		setNumero_horas(new_horas);
		setSueldo_horas(new_sueldo);
		
		System.out.println("sus horas establecidas son : " + new_horas + "horas y el sueldo es : " + new_sueldo + "€");
	}
	
	/**Este método se va encargar de mostrarnos si el sueldo es negativo, si esto pasa,
	 * mostraremos un mensaje de error
	 */
	public void establecerSueldo() {
		if(sueldo_horas >= 0) {
			System.out.println("Su sueldo se corresponde con : " + sueldo_horas);
		}else {
			System.out.println("ERROR, usted no puede cobrar una cantidad de dinero negativa");
		}
	}
	
	/**Este método se va a encargar de mostrarnos si el número de horas, se comprende entre
	 * 0 y 168 horas
	 */
	public void establecerHoras() {
		if(numero_horas <= 0 && numero_horas >= 168) {
			System.out.println("ERROR : ¡¡¡Usted no ha podido trabajar esta cantidad de horas!!!");
		}else {
			System.out.println("OKEY, sus números de horas trabajadas han sido de : " + numero_horas + " horas");
		}
	}
	
	/**Método que calculará los ingresos de un empleado asalarial **/
	public void ingresos() {
		int total;
		double total1_5,resta,total2;
		if(numero_horas <= 40) {
			total = numero_horas * sueldo_horas;
			
			System.out.println("Su sueldo para " + numero_horas + " horas, es de :" + total);
		}else {
			resta = numero_horas - 40;
			
			total1_5 = resta * 1.5;
			
			total2 = 40 + total1_5;
			
			System.out.println("Su sueldo para " + numero_horas + " horas, es de : " + total2);
		}
		
		
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [sueldo_horas=" + sueldo_horas + ", numero_horas=" + numero_horas + ", nombre=" + nombre + ", apellido_paterno="
		        + apellido_paterno + ", numero_SS=" + numero_SS + "]";
	}
	
	
	
	
}
