package QuintaActividad;
import java.util.Scanner;
/**
 * Esta clase va a servir para crear el menú con el que el usuario va a ir interaccionando
 * @author javie
 *
 */
public class Menu {

	Scanner S = new Scanner (System.in);
	
	Empleado e = new EmpleadoBaseMasComision("Javier", "Ramos", 5452342, 78, 43.8, 1220);
	Empleado e1 = new EmpleadoPorComision("Alonso", "Ramos", 545234, 90, 32.1);
	EmpleadoPorHoras e2 = new EmpleadoPorHoras("Francisco", "Ramos", 5643253, 70, 5);
	Empleado e3 = new EmpleadosAsalariados("Inma", "López", 42312, 80);
	
	public void menu() {
		int opcion;
		do {
		System.out.println("Bienvenido a la base de datos de los empleados");
		System.out.println("¿ De qué tipo de empleado quiere obtener información ?");
		System.out.println("1. Empleado con base más comision");
		System.out.println("2. Empleados por comision");
		System.out.println("3. Empleados por horas");
		System.out.println("4. Empleados asalariados");
		System.out.println("5. Salir");
		opcion = S.nextInt();

		switch (opcion) {
		case 1:
			int opcion2;
			System.out.println("\t1.1 Establecer");
			System.out.println("\t1.2 Obtener");
			System.out.println("\t1.3 Ingresos");
			System.out.println("Introduzca una opción : ");
			opcion2 = S.nextInt();

			switch (opcion2) {
			case 1:
				e.establecer();
				break;
			case 2:
				e.obtener();
				break;
			case 3:
				e.ingresos();
				break;
			}
			break;
		case 2:
			int opcion3;
			System.out.println("\t2.1 Establecer");
			System.out.println("\t2.2 Obtener");
			System.out.println("\t2.3 Ingresos");
			System.out.println("Introduzca una opción : ");
			opcion3 = S.nextInt();

			switch (opcion3) {
			case 1:
				e1.establecer();
				break;
			case 2:
				e1.obtener();
				break;
			case 3:
				e1.ingresos();
				break;
			}
			break;
		case 3:
			int opcion4;
			System.out.println("\t3.1 Establecer");
			System.out.println("\t3.2 Establecer sueldo");
			System.out.println("\t3.3 Establecer horas");
			System.out.println("\t3.4 Ingresos");
			opcion4 = S.nextInt();

			switch (opcion4) {
			case 1:
				e2.establecer();
				break;
			case 2:
				e2.establecerSueldo();
				break;
			case 3:
				e2.establecerHoras();
				break;
			case 4:
				e2.ingresos();
				break;

			}
			break;
		case 4:
			int opcion5;
			System.out.println("\t4.1 Establecer");
			System.out.println("\t4.2 Obtener");
			System.out.println("\t4.3 Ingresos");
			opcion5 = S.nextInt();

			switch (opcion5) {
			case 1:
				e3.establecer();
				break;
			case 2:
				e3.obtener();
				break;
			case 3:
				e3.ingresos();
				break;

			}
			break;
		case 5:
			System.out.println("VUELVA PRONTO");
			break;

		}
		}while(opcion != 5);
		
	}
}
