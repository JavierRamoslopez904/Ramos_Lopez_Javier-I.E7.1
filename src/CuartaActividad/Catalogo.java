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

	// Creaci�n de la colecci�n de obras art�sticas

	List<Obra> obras = new ArrayList<>();

	List<Pintura> pinturas = new ArrayList<>();

	List<Escultura> esculturas = new ArrayList<>();

	// M�todos

	/*** Implementaci�n del m�todo a�adeObra **/

	public void addObra() {
		String titulo, autor, anio;
		int num_inv;

		System.out.println("Introduzca el t�tulo de la obra que quiere a�adir : ");
		titulo = S.next();
		System.out.println("Introduzca el autor de la obra : ");
		autor = S.next();
		System.out.println("Introduzca la fecha para a�adir la obra : ");
		anio = S.next();
		System.out.println("Introduzca el n�mero de inventario de la obra a a�adir : ");
		num_inv = S.nextInt();

		Obra o = new Obra(titulo, autor, anio, num_inv);

		obras.add(o);

	}

	/** * Implementaci�n del m�todo deleteObra */

	public void deleteObra() {
		String titulo, autor, anio;
		int num_inv;

		System.out.println("Introduzca el t�tulo de la obra que quiere eliminar del museo");
		titulo = S.next();
		System.out.println("Introduzca el autor de dicha obra a borrar");
		autor = S.next();
		System.out.println("Introduzca el a�o : ");
		anio = S.next();
		System.out.println("Introduzca el n�mero del inventario que corresponde : ");
		num_inv = S.nextInt();

		Obra o = new Obra(titulo, autor, anio, num_inv);

		obras.remove(o);

		System.out.println("La obra " + o + "ha sido borrada");
	}

	/**
	 * Implementaci�n del m�todo showObra para ver si se ha a�adido la obra a�adida correctamente
	 */

	public void showObra() {
		int opcion;
		System.out.println("Introduzca una opci�n para mostrar la informaci�n de la obra a�adida");
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

			System.out.println("T�tulo/T�tulos de las obras");
			obras.stream().map(o -> o.getTitulo()).forEach(System.out::println);
			System.out.println("El autor/ Los autores de las obras es/son");
			obras.stream().map(o -> o.getAutor()).forEach(System.out::println);
			System.out.println("El a�o de la obra ");
			obras.stream().map(o -> o.getAnio()).forEach(System.out::println);
			System.out.println("El/Los n�meros de inventario es/son");
			obras.stream().map(o -> o.getNumero_inventario()).forEach(System.out::println);

			break;
		}

	}

	/**
	 * Implementaci�n del m�todo searchObra
	 */

	public void searchObra() {

		int num_inv;

		System.out.println("Introduzca el n�mero de inventario para buscar una obra : ");
		num_inv = S.nextInt();

		for (Obra o : obras) {
			if (num_inv == o.getNumero_inventario()) {
				System.out.println("El t�tulo de la obra es : " + o.getTitulo());
			} else {
				System.out.println("La obra no existe");
			}
		}
	}

	/**
	 * Implementaci�n del m�todo que a�adir� pinturas
	 */

	public void addPaints() {

		String titulo, autor, anio, soporte;
		int num_inv;
		double dimension;

		System.out.println("Introduzca el t�tulo de la pintura que desea a�adir");
		titulo = S.next();
		System.out.println("Introduzca el autor de la pintura");
		autor = S.next();
		System.out.println("Introduzca el a�o");
		anio = S.next();
		System.out.println("Introduzca el material del que est� hecho el soporte de la pintura");
		soporte = S.next();
		System.out.println("Introduzca su n�mero de inventario");
		num_inv = S.nextInt();
		System.out.println("Introduzca la dimension");
		dimension = S.nextDouble();

		Pintura p = new Pintura(titulo, anio, autor, num_inv, dimension, soporte);

		pinturas.add(p);

	}

	/**
	 * Implementaci�n del m�todo calcularSuperficie
	 */

	public void calcularSuperficie() {

		double suma = 0;

		for (Pintura p : pinturas) {
			suma += p.getDimension();
		}
		System.out.println(suma);

	}

	/**
	 * Implementaci�n del m�todo showPaints
	 */

	public void showPaints() {

		for (Pintura p : pinturas) {
			System.out.println(p);
		}

	}

	/**
	 * Implementaci�n del m�todo addEscultures
	 */

	public void addEscultures() {

		String titulo, autor, anio, material;
		int num_inv, altura;

		System.out.println("Introduzca el titulo de la escultura que quiere a�adir");
		titulo = S.next();
		System.out.println("Introduzca el autor de esa escultura ");
		autor = S.next();
		System.out.println("Introduzca el a�o : ");
		anio = S.next();
		System.out.println("Introduzca el n�mero de inventario");
		num_inv = S.nextInt();
		System.out.println("Introduzca su material de fabricaci�n : ");
		material = S.next();
		System.out.println("Introduzca la altura : ");
		altura = S.nextInt();

		Escultura e = new Escultura(titulo, autor, anio, num_inv, material, altura);

		esculturas.add(e);
	}

	/** Implementaci�n del m�todo moreHigh */

	public void moreHigh() {
		
		
		Escultura moreHigh = esculturas.stream().max((first,second) -> first.getAltura().compareTo(second.getAltura())).get();
		
		System.out.println("Ahora se le mostrar� el n�mero del inventario de est� escultura mas alta");
		System.out.println("La escultura con c�digo : " + moreHigh.getNumero_inventario() + " es la m�s alta");

	}

	/** Implementaci�n del m�todo showEscultures */

	public void showEscultures() {

		for (Escultura e : esculturas) {
			System.out.println(e);
		}

	}

	/**
	 * Implementaci�n del m�todo men�
	 */

	public void menu() {

		Catalogo c = new Catalogo();

		int opcion;

		do {
			System.out.println("<===== BIENVENIDO AL MUSEO =======>");
			System.out.println("\tPor favor, introduzca una opci�n : ");
			System.out.println("\t\t1 -> Quiero a�adir una obra al museo ");
			System.out.println("\t\t2 -> Quiero consultar cuantas obras hay a�adidas ");
			System.out.println("\t\t3 -> Quiero eliminar una obra ");
			System.out.println("\t\t4 -> Quiero buscar una obra");
			System.out.println("\t\t5 -> Quiero a�adir pinturas al museo ");
			System.out.println("\t\t6 -> Quiero calcular la suma de la dimensi�n de todas las pinturas del museo");
			System.out.println("\t\t7 -> Quiero ver las pinturas a�adidas al museo");
			System.out.println("\t\t8 -> Quiero a�adir esculturas al museo");
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
