package TerceraActividad;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author javie
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Libro> libros = new ArrayList<>();
		List<Revista> revistas = new ArrayList<>();

		libros.add(new Libro(1, "señor de los anillos", 2019, false));
		libros.add(new Libro(2, "hobbit", 2005, false));
		libros.add(new Libro(3, "sirmarilion", 2009, false));
		libros.add(new Libro(4, "tuareg", 2010, false));
		
		revistas.add(new Revista(5,"Todo sobre programación",2000,9));
		revistas.add(new Revista(6,"Todo sobre Base de Datos", 2007,32));
		revistas.add(new Revista(7,"Todo sobre Lenguaje de Marcas",2020,4));
		revistas.add(new Revista(8,"Todo sobre entornos de desarollo",2001,9));

		Biblioteca2 b2 = new Biblioteca2(libros, revistas);

		b2.biblioteca();
	}

}
