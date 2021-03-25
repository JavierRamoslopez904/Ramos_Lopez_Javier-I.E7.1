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

	// Creación de las colecciones
	List<Libro> libros;

	List<Revista> revistas;

	// Creación del constructor

	public Biblioteca2(List<Libro> libros, List<Revista> revistas) {

		this.libros = libros;

		this.revistas = revistas;

	}

	// Métodos

	/**
	 * Este método se va a encargar de mostrar aquellos libros que están prestados
	 */
	public void countPrestados() {

		System.out.println("Los libros que están prestados son : ");
		libros.stream().filter(lib -> lib.prestado() == true).map(lib -> lib.toString()).forEach(System.out::println);

	}

	/**
	 * Este método se va a encargar de mostrar tanto las revistas como los libros que son anteriores a un año introducido por el usuario
	 */
	public void publicationsBeforeA() {

		int año;
		System.out.println("Introduzca un año");
		año = S.nextInt();
		System.out.println("A continuación se mostrarán los libros anteriores a ese año");
		libros.stream().filter(lib -> lib.getYearOfPublication() < año).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("A continuación se mostrarán las revistas anteriores a ese año");
		revistas.stream().filter(rev -> rev.getYearOfPublication() < año).map(rev -> rev.toString()).forEach(System.out::println);
	}

	/**
	 * Este método se va a encargar de mostrar las colecciones de los libros y las revistas, para ello usaremos un for moderno
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
	 * Este método se va a encargar de mostrarnos los libros que van a estar prestados y luego le pediremos un código al usuario para extraer ese libro
	 */
	public void prestarLibro() {
		int codigo;
		System.out.println("Los libros que usted puede tomar prestados son : ");
		libros.stream().filter(lib -> lib.prestado() == false).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("Introduzca el código para poder extraer un libro");
		codigo = S.nextInt();

		Libro l = libros.get(codigo);

		l.prestar();

	}

	/**
	 * Este método se va a encargar de mostrarnos aquellos libros que están devueltos, para ello el atributo prestado deverá estar en false
	 */
	public void devolverLibros() {
		int codigo;
		System.out.println("Los libros que se pueden devolver son ");
		libros.stream().filter(lib -> lib.prestado() == false).map(lib -> lib.toString()).forEach(System.out::println);

		System.out.println("Introduzca el código apra llevarse un libro");
		codigo = S.nextInt();
		Libro l = libros.get(codigo);
		l.devolver();

	}

	/**
	 * Método que se va a encargar de crear un menú, para que no tengamos que crearlo en el main
	 */
	public void menu() {

		System.out.println("<=== BIENVENIDO A SU BIBLIOTECA FAVORITA ===>");
		System.out.println(" ¿ En qué puedo ayudarle ?");
		System.out.println("1. Quiero ver los libros disponibles");
		System.out.println("2. Quiero prestar un libro");
		System.out.println("3. Quiero devolver un libro");
		System.out.println("4. Quiero ver cuantos libros hay mostrados");
		System.out.println("5. Quiero ver las publicaciones anteriores a una fecha elegida por mí");
		System.out.println("6. Salir del sistema");

	}

	/**
	 * Y este método va a ser al que vamos a llamar en la clase biblioteca para realizar las operaciones
	 */
	public void biblioteca() {
		menu();
		int numero;
		do {
			System.out.println("Por favor, introduzca una opción");
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
