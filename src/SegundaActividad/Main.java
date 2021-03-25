package SegundaActividad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		// Definición de objetos
		Direccion d = new Direccion("San Juan", "Linares de la Sierra", 21207, "España");
		Persona p = new Persona("Javier", " Ramos López", "21016078N", d);

		int opcion;
		do {
			System.out.println("<=== BIENVENIDO ===>");
			System.out.println("¿ Qué opción desea realizar ?");
			System.out.println("1 --> Identificarse");
			System.out.println("2 --> Añadir Alumnos");
			System.out.println("3 --> Añadir Profesores");
			System.out.println("0 --> Salir");
			opcion = S.nextInt();
			switch (opcion) {
			case 1:
				Estudiante e = new Estudiante("Alonso", "Ramos López", "20105631B", d, 6);
				Profesor pr = new Profesor("Teodoro", "Coronado", "54312324P", d, 0);
				int Opcion;
				System.out.println("¿ Cómo desea identificarse ?");
				System.out.println("1 --> Alumno");
				System.out.println("2 --> Profesor");
				Opcion = S.nextInt();
				switch (Opcion) {
				case 1:
					p.identificate(e);
					break;
				case 2:
					p.identificate(pr);
					break;
				}
				break;
			case 2:
				p.añadirEstudiante();
				break;
			case 3:
				p.añadirProfesores();
				break;
			}

		} while (opcion != 0);
	}

}
