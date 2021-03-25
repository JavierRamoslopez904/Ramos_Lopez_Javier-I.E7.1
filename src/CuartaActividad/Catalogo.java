package CuartaActividad;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author javie
 *
 */
public class Catalogo {

	Scanner S = new Scanner(System.in);

	// Creación de la colección de obras artísticas

	List<Obra> obras = new ArrayList<>();

	List<Pintura> pinturas = new ArrayList<>();

	List<Escultura> esculturas = new ArrayList<>();

	// Métodos

	/*** Implementación del método añadeObra **/

	public void addObra() {
		String titulo, autor, anio;
		int num_inv;

		System.out.println("Introduzca el título de la obra que quiere añadir : ");
		titulo = S.next();
		System.out.println("Introduzca el autor de la obra : ");
		autor = S.next();
		System.out.println("Introduzca la fecha para añadir la obra : ");
		anio = S.next();
		System.out.println("Introduzca el número de inventario de la obra a añadir : ");
		num_inv = S.nextInt();

		Obra o = new Obra(titulo, autor, anio, num_inv);

		obras.add(o);

	}

	/** * Implementación del método deleteObra */

	public void deleteObra() {
		String titulo, autor, anio;
		int num_inv;

		System.out.println("Introduzca el título de la obra que quiere eliminar del museo");
		titulo = S.next();
		System.out.println("Introduzca el autor de dicha obra a borrar");
		autor = S.next();
		System.out.println("Introduzca el año : ");
		anio = S.next();
		System.out.println("Introduzca el número del inventario que corresponde : ");
		num_inv = S.nextInt();

		Obra o = new Obra(titulo, autor, anio, num_inv);

		obras.remove(o);

		System.out.println("La obra " + o + "ha sido borrada");
	}

	/**
	 * Implementación del método showObra para ver si se ha añadido la obra añadida correctamente
	 */

	public void showObra() {
		int opcion;
		System.out.println("Introduzca una opción para mostrar la información de la obra añadida");
		System.out.println("1 --> Bucle forEach");
		System.out.println("2 --> Api Stream");
		opcion = S.nextInt();
		switch (opcion) {
		case 1:
			for (Obra o : obras) {
				System.out.println(o);
			}
			break;
		case 2:

			System.out.println("Título/Títulos de las obras");
			obras.stream().map(o -> o.getTitulo()).forEach(System.out::println);
			System.out.println("El autor/ Los autores de las obras es/son");
			obras.stream().map(o -> o.getAutor()).forEach(System.out::println);
			System.out.println("El año de la obra ");
			obras.stream().map(o -> o.getAnio()).forEach(System.out::println);
			System.out.println("El/Los números de inventario es/son");
			obras.stream().map(o -> o.getNumero_inventario()).forEach(System.out::println);

			break;
		}

	}

	/**
	 * Implementación del método searchObra
	 */

	public void searchObra() {

		int num_inv;

		System.out.println("Introduzca el número de inventario para buscar una obra : ");
		num_inv = S.nextInt();

		for (Obra o : obras) {
			if (num_inv == o.getNumero_inventario()) {
				System.out.println("El título de la obra es : " + o.getTitulo());
			} else {
				System.out.println("La obra no existe");
			}
		}
	}

	/**
	 * Implementación del método que añadirá pinturas
	 */

	public void addPaints() {

		String titulo, autor, anio, soporte;
		int num_inv;
		double dimension;

		System.out.println("Introduzca el título de la pintura que desea añadir");
		titulo = S.next();
		System.out.println("Introduzca el autor de la pintura");
		autor = S.next();
		System.out.println("Introduzca el año");
		anio = S.next();
		System.out.println("Introduzca el material del que está hecho el soporte de la pintura");
		soporte = S.next();
		System.out.println("Introduzca su número de inventario");
		num_inv = S.nextInt();
		System.out.println("Introduzca la dimension");
		dimension = S.nextDouble();

		Pintura p = new Pintura(titulo, anio, autor, num_inv, dimension, soporte);

		pinturas.add(p);

	}

	/**
	 * Implementación del método calcularSuperficie
	 */

	public void calcularSuperficie() {

		double suma = 0;

		for (Pintura p : pinturas) {
			suma += p.getDimension();
		}
		System.out.println(suma);

	}

	/**
	 * Implementación del método showPaints
	 */

	public void showPaints() {

		for (Pintura p : pinturas) {
			System.out.println(p);
		}

	}

	/**
	 * Implementación del método addEscultures
	 */

	public void addEscultures() {

		String titulo, autor, anio, material;
		int num_inv, altura;

		System.out.println("Introduzca el titulo de la escultura que quiere añadir");
		titulo = S.next();
		System.out.println("Introduzca el autor de esa escultura ");
		autor = S.next();
		System.out.println("Introduzca el año : ");
		anio = S.next();
		System.out.println("Introduzca el número de inventario");
		num_inv = S.nextInt();
		System.out.println("Introduzca su material de fabricación : ");
		material = S.next();
		System.out.println("Introduzca la altura : ");
		altura = S.nextInt();

		Escultura e = new Escultura(titulo, autor, anio, num_inv, material, altura);

		esculturas.add(e);
	}

	/** Implementación del método moreHigh */

	public void moreHigh() {
		
		
		Escultura moreHigh = esculturas.stream().max((first,second) -> first.getAltura().compareTo(second.getAltura())).get();
		
		System.out.println("Ahora se le mostrará el número del inventario de está escultura mas alta");
		System.out.println("La escultura con código : " + moreHigh.getNumero_inventario() + " es la más alta");

	}

	/** Implementación del método showEscultures */

	public void showEscultures() {

		for (Escultura e : esculturas) {
			System.out.println(e);
		}

	}

	/**
	 * Implementación del método menú
	 */

	public void menu() {

		Catalogo c = new Catalogo();

		int opcion;

		do {
			System.out.println("<===== BIENVENIDO AL MUSEO =======>");
			System.out.println("\tPor favor, introduzca una opción : ");
			System.out.println("\t\t1 -> Quiero añadir una obra al museo ");
			System.out.println("\t\t2 -> Quiero consultar cuantas obras hay añadidas ");
			System.out.println("\t\t3 -> Quiero eliminar una obra ");
			System.out.println("\t\t4 -> Quiero buscar una obra");
			System.out.println("\t\t5 -> Quiero añadir pinturas al museo ");
			System.out.println("\t\t6 -> Quiero calcular la suma de la dimensión de todas las pinturas del museo");
			System.out.println("\t\t7 -> Quiero ver las pinturas añadidas al museo");
			System.out.println("\t\t8 -> Quiero añadir esculturas al museo");
			System.out.println("\t\t9 -> Quiero ver las esculturas del museo ");
			System.out.println("\t\t10 -> Quiero ver la escultura mas alta del museo");

			opcion = S.nextInt();

			switch (opcion) {
			case 1:
				c.addObra();
				break;
			case 2:
				c.showObra();
				break;
			case 3:
				c.deleteObra();
				break;
			case 4:
				c.searchObra();
				break;
			case 5:
				c.addPaints();
				break;
			case 6:
				c.calcularSuperficie();
				break;
			case 7:
				c.showPaints();
				break;
			case 8:
				c.addEscultures();
				break;
			case 9:
				c.showEscultures();
				break;
			case 10:
				 c.moreHigh();
				break;
			}
		} while (opcion != 0);

	}

}
