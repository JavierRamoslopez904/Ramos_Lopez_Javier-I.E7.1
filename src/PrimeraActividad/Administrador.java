package PrimeraActividad;

import java.util.Scanner;

//En esta clase pasará lo mismo que pasa con la clase Moderador, que se realizará una herencia a la clase padre, 
//que como ya sabemos es abstracta, y obligatoriamente tenemos que hacer referencia a los métodos abstractos
public class Administrador extends Usuario {
	Scanner S = new Scanner(System.in);
	// Vamos a definir los atributos
	private int mensajes;
	private String correo;
	private String nick;
	private int baneos;

	// Vamos a crear un constructor pero vamos a tener que hacer referencia también del super para que podamos hacer
	// referencia a los atributos de la clase padre
	public Administrador(int mensajes, String correo, String nick, int men, String co, String nic, int baneos) {
		super(mensajes, correo, nick);
		this.mensajes = men;
		this.correo = co;
		this.nick = nic;
		this.baneos = baneos;
	}

	// Vamos a hacer referencia a los métodos abstractos que hemos creado en la clase padre
	// Primero haremos referencia al método incrementa
	public void incrementa() {
		int mens;
		System.out.println("Introduzca el número de mensajes ");
		mens = S.nextInt();
		this.mensajes = mens + 1;
		System.out.println("El número total de mensajes es : " + mensajes);
	}

	// Luego haremos referencia al método decrementa
	public void decrementa() {
		int mens;
		System.out.println("Introduzca el número de mensajes ");
		mens = S.nextInt();
		this.mensajes = mens - 1;
		System.out.println("El número total de mensajes es : " + mensajes);
	}

	// El último método abstracto que vamos a implementar es el método de modificar el correo
	public void modificarCorreo() {
		System.out.println("Introduzca el nuevo nombre para su correo");
		correo = S.next();
		System.out.println("Su nuevo correo es : " + correo);
	}

	// Vamos a crear el último método, que este no es un método abstracto el cual hemos hecho creado en la clase padre
	// si no que es un método característico de esta clase
	public void baneosInc() {
		System.out.println("Introduzca el número de baneos que ha realizado el Administrador");
		baneos = S.nextInt();
		System.out.println("El número de baneos son : " + baneos);
	}
}
