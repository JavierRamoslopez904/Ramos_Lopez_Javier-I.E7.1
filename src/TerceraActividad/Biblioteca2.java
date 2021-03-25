package TerceraActividad;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author javie
 *
 */
public class Biblioteca2 {
	Scanner S = new Scanner(System.in);

	// Creaci�n de las colecciones
	List<Libro> libros;

	List<Revista> revistas;

	// Creaci�n del constructor

	public Biblioteca2(List<Libro> libros, List<Revista> revistas) {

		this.libros = libros;

		this.revistas = revistas;

	}

	// M�todos

	/**
	 * Este m�todo se va a encargar de mostrar aquellos libros que est�n prestados
	 */
	public void countPrestados() {

		System.out.println("Los libros que est�n prestados son : ");
		libros.stream().filter(lib -> lib.prestado() == true).map(lib -> lib.toString()).forEach(System.out::println);

	}

	/**
	 * Este m�todo se va a encargar de mostrar tanto las revistas como los libros que son anteriores a un a�o introducido por el usuario
	 */
	public void publicationsBeforeA() {

		int a�o;
		System.out.println("Introduzca un a�o");
		a�o = S.nextInt();
		System.out.println("A continuaci�n se mostrar�n los libros anteriores a ese a�o");
		libros.stream().filter(lib -> lib.getYearOfPublication() < a�o).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("A continuaci�n se mostrar�n las revistas anteriores a ese a�o");
		revistas.stream().filter(rev -> rev.getYearOfPublication() < a�o).map(rev -> rev.toString()).forEach(System.out::println);
	}

	/**
	 * Este m�todo se va a encargar de mostrar las colecciones de los libros y las revistas, para ello usaremos un for moderno
	 */
	public void showDates() {

		for (Libro l : libros) {
			System.out.println(l);
		}
		for (Revista r : revistas) {
			System.out.println(r);
		}

	}

	/**
	 * Este m�todo se va a encargar de mostrarnos los libros que van a estar prestados y luego le pediremos un c�digo al usuario para extraer ese libro
	 */
	public void prestarLibro() {
		int codigo;
		System.out.println("Los libros que usted puede tomar prestados son : ");
		libros.stream().filter(lib -> lib.prestado() == false).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("Introduzca el c�digo para poder extraer un libro");
		codigo = S.nextInt();

		Libro l = libros.get(codigo);

		l.prestar();

	}

	/**
	 * Este m�todo se va a encargar de mostrarnos aquellos libros que est�n devueltos, para ello el atributo prestado dever� estar en false
	 */
	public void devolverLibros() {
		int codigo;
		System.out.println("Los libros que se pueden devolver son ");
		libros.stream().filter(lib -> lib.prestado() == false).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("Introduzca el c�digo apra llevarse un libro");
		codigo = S.nextInt();
		Libro l = libros.get(codigo);
		l.devolver();

	}

	/**
	 * M�todo que se va a encargar de crear un men�, para que no tengamos que crearlo en el main
	 */
	public void menu() {

		System.out.println("<=== BIENVENIDO A SU BIBLIOTECA FAVORITA ===>");
		System.out.println(" � En qu� puedo ayudarle ?");
		System.out.println("1. Quiero ver los libros disponibles");
		System.out.println("2. Quiero prestar un libro");
		System.out.println("3. Quiero devolver un libro");
		System.out.println("4. Quiero ver cuantos libros hay mostrados");
		System.out.println("5. Quiero ver las publicaciones anteriores a una fecha elegida por m�");
		System.out.println("6. Salir del sistema");

	}

	/**
	 * Y este m�todo va a ser al que vamos a llamar en la clase biblioteca para realizar las operaciones
	 */
	public void biblioteca() {
		menu();
		int numero;
		do {
			System.out.println("Por favor, introduzca una opci�n");
			numero = S.nextInt();
			switch (numero) {
			case 1:
				showDates();
				break;
			case 2:
				prestarLibro();
				break;
			case 3:
				devolverLibros();
				break;
			case 4:
				countPrestados();
				break;
			case 5:
				publicationsBeforeA();
				break;
			case 6:
				System.out.println("Vuelva pronto ^^");
				break;

			}
		} while (numero != 6);

	}

}
