package PrimeraActividad;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int opcion;
		// Vamos a implementar el polimorfismo
		// Como ya sabemos nosotros no podemos crear un objeto de una clase abstracta, como es Usuario, por lo que
		// a la hora de poner el new la clase que ponemos no será la clase abstracta, sino una de sus clases hijas
		Usuario moderador = new Moderador(6, "ramoslopezjavier5@gmal.com", "JaVi8", 10, "alonsoramoslopez@gmail.com", "AlOnSo", 7);
		Usuario Administrador = new Administrador(6, "ramoslopezjavier5@gmail.com", "JaVi8", 15, "inmalopezmartin@gmail.com", "InMa", 9);
		// Vamos a mostrar una opción en la cual haya un poco de interacción con el usuario y el pueda elegir que
		// información desea consultar, si la información del administrador o la del moderador
		System.out.println("Introduzca una opción : ");
		System.out.println("1 --> INFORMACIÓN DEL MODERADOR");
		System.out.println("2 --> INFORMACIÓN DEL ADMINISTRADOR");
		opcion = S.nextInt();
		switch (opcion) {
		case 1:
			moderador.incrementa();
			moderador.decrementa();
			moderador.modificarCorreo();
			break;
		case 2:
			Administrador.incrementa();
			Administrador.decrementa();
			Administrador.modificarCorreo();
			break;
		}

	}

}
