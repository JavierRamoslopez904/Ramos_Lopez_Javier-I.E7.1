package SegundaActividad;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona implements Humano {
	Scanner S = new Scanner(System.in);
	// Vamos a definir los atributos
	protected String nombre;
	protected String apellidos;
	protected String NIF;
	protected Direccion direccion;
	// Vamos a crear una lista tanto de alumnos como de profesores
	List<Estudiante> estudiante = new ArrayList<>();
	List<Profesor> profesor = new ArrayList<>();

	// Vamos a crear el constructor
	public Persona(String nombre, String apellidos, String NIF, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.NIF = NIF;
		this.direccion = direccion;
	}

	// Vamos a crear los métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	// Vamos a crear un método para añadir estudiantes y profesores
	public void añadirEstudiante() {
		int nEstudiantes, codigo_postal, ID, opcion;
		String nombre, apellidos, NIF, calle, ciudad, pais;
		System.out.println("Introduzca el número de estudiantes que quiere añadir");
		nEstudiantes = S.nextInt();
		for (int i = 0; i < nEstudiantes; i++) {
			System.out.println("Introduzca su nombre");
			nombre = S.next();
			System.out.println("Introduzca el primer apellido");
			apellidos = S.next();
			System.out.println("Introduzca su NIF");
			NIF = S.next();
			System.out.println("Introduzca su identificador único ID");
			ID = S.nextInt();
			System.out.println("<=====================================>");
			System.out.println("Ahora se procederá a pedirle información de su dirección");
			System.out.println("<=====================================>");
			System.out.println("Introduzca su calle");
			calle = S.next();
			System.out.println("Introduzca su ciudad");
			ciudad = S.next();
			System.out.println("Introduzca el país");
			pais = S.next();
			System.out.println("Introduzca su código postal");
			codigo_postal = S.nextInt();
			Direccion d = new Direccion(calle, ciudad, codigo_postal, pais);
			Estudiante e = new Estudiante(nombre, apellidos, NIF, d, ID);
			// Vamos a proceder añadir a la colección <estudiante> el objeto que hemos creado anteriormente
			estudiante.add(e);
		}
		// Y ahora para repasar los conceptos vamos a elegir la opción de mostrar la información de los estudiantes
		// la api stream
		System.out.println("Introduzca una opción para mostrar la información del libro añadido");
		System.out.println("1 --> Bucle forEach");
		System.out.println("2 --> Api Stream");
		opcion = S.nextInt();
		switch (opcion) {
		case 1:
			for (Estudiante e1 : estudiante) {
				System.out.println(e1);
			}
			break;
		case 2:
			// Mostramos el ID del estudiante
			System.out.println("Su ID :");
			estudiante.parallelStream().map(s -> s.getID()).forEach(System.out::println);
			// Mostramos el nombre del estudiante
			System.out.println("Su nombre :");
			estudiante.parallelStream().map(s -> s.getNombre()).forEach(System.out::println);
			// Mostramos los apellidos
			System.out.println("Su apellido es :");
			estudiante.parallelStream().map(s -> s.getApellidos()).forEach(System.out::println);
			// Mostramos el NIF
			System.out.println("Su NIF es :");
			estudiante.parallelStream().map(s -> s.getNIF()).forEach(System.out::println);
			// Mostramos la calle
			System.out.println("Su dirección es :");
			estudiante.parallelStream().map(s -> s.getDireccion()).forEach(System.out::println);

			break;
		}

	}

	// Vamos a añadir otro método que es el de añadir profesores
	public void añadirProfesores() {
		int nProfesores, codigo_postal, despacho, opcion;
		String nombre, apellidos, NIF, calle, ciudad, pais;
		System.out.println("Introduzca el número de profesores que quiere añadir");
		nProfesores = S.nextInt();
		for (int i = 0; i < nProfesores; i++) {
			System.out.println("Introduzca su nombre");
			nombre = S.next();
			System.out.println("Introduzca el primer apellido");
			apellidos = S.next();
			System.out.println("Introduzca su NIF");
			NIF = S.next();
			System.out.println("Introduzca su despacho");
			despacho = S.nextInt();
			System.out.println("<=====================================>");
			System.out.println("Ahora se procederá a pedirle información de su dirección");
			System.out.println("<=====================================>");
			System.out.println("Introduzca su calle");
			calle = S.next();
			System.out.println("Introduzca su ciudad");
			ciudad = S.next();
			System.out.println("Introduzca el país");
			pais = S.next();
			System.out.println("Introduzca su código postal");
			codigo_postal = S.nextInt();
			Direccion d = new Direccion(calle, ciudad, codigo_postal, pais);
			Profesor p = new Profesor(nombre, apellidos, NIF, d, despacho);
			// Al igual que hemos hecho con los estudiantes vamos a añadir a la colección de los profesores
			// el objeto creador anteriormente
			profesor.add(p);
		}
		// Y ahora para repasar los conceptos vamos a elegir la opción de mostrar la información de los estudiantes
		// la api stream
		System.out.println("Introduzca una opción para mostrar la información del libro añadido");
		System.out.println("1 --> Bucle forEach");
		System.out.println("2 --> Api Stream");
		opcion = S.nextInt();
		switch (opcion) {
		case 1:
			for (Profesor p1 : profesor) {
				System.out.println(p1);
			}
			break;
		case 2:
			// Mostramos el despacho
			System.out.println("Su despacho es :");
			profesor.parallelStream().map(s -> s.getDespacho()).forEach(System.out::println);
			// Mostramos el nombre
			System.out.println("Su nombre es :");
			profesor.parallelStream().map(s -> s.getNombre()).forEach(System.out::println);
			// Mostramos los apellidos
			System.out.println("Sus apellidos son :");
			profesor.parallelStream().map(s -> s.getApellidos()).forEach(System.out::println);
			// Mostramos su NIF
			System.out.println("Su NIF es :");
			profesor.parallelStream().map(s -> s.getNIF()).forEach(System.out::println);
			// Mostramos la direccion
			System.out.println("Su dirección es :");
			profesor.parallelStream().map(s -> s.getDireccion()).forEach(System.out::println);
			break;
		}
	}

	@Override
	public String toString() {
		return "Persona [S=" + S + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion + ", estudiante="
		        + estudiante + ", profesor=" + profesor + "]";
	}

	/* Método identificate */

	public void identificate(Persona p) {
		if (p instanceof Estudiante) {
			System.out.println("Su usuario pertenece a un Estudiante");
		} else {
			System.out.println("Su usuario pertenece a un Profesor");
		}

	}
}
