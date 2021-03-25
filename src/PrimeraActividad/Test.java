package PrimeraActividad;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int opcion;
		// Vamos a implementar el polimorfismo
		// Como ya sabemos nosotros no podemos crear un objeto de una clase abstracta, como es Usuario, por lo que
		// a la hora de poner el new la clase que ponemos no ser� la clase abstracta, sino una de sus clases hijas
		Usuario moderador = new Moderador(6, "ramoslopezjavier5@gmal.com", "JaVi8", 10, "alonsoramoslopez@gmail.com", "AlOnSo", 7);
		Usuario Administrador = new Administrador(6, "ramoslopezjavier5@gmail.com", "JaVi8", 15, "inmalopezmartin@gmail.com", "InMa", 9);
		// Vamos a mostrar una opci�n en la cual haya un poco de interacci�n con el usuario y el pueda elegir que
		// informaci�n desea consultar, si la informaci�n del administrador o la del moderador
		System.out.println("Introduzca una opci�n : ");
		System.out.println("1 --> INFORMACI�N DEL MODERADOR");
		System.out.println("2 --> INFORMACI�N DEL ADMINISTRADOR");
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
