package PrimeraActividad;

import java.util.Scanner;

//En esta clase pasar� lo mismo que pasa con la clase Moderador, que se realizar� una herencia a la clase padre, 
//que como ya sabemos es abstracta, y obligatoriamente tenemos que hacer referencia a los m�todos abstractos
public class Administrador extends Usuario {
	Scanner S = new Scanner(System.in);
	// Vamos a definir los atributos
	private int mensajes;
	private String correo;
	private String nick;
	private int baneos;

	// Vamos a crear un constructor pero vamos a tener que hacer referencia tambi�n del super para que podamos hacer
	// referencia a los atributos de la clase padre
	public Administrador(int mensajes, String correo, String nick, int men, String co, String nic, int baneos) {
		super(mensajes, correo, nick);
		this.mensajes = men;
		this.correo = co;
		this.nick = nic;
		this.baneos = baneos;
	}

	// Vamos a hacer referencia a los m�todos abstractos que hemos creado en la clase padre
	// Primero haremos referencia al m�todo incrementa
	public void incrementa() {
		int mens;
		System.out.println("Introduzca el n�mero de mensajes ");
		mens = S.nextInt();
		this.mensajes = mens + 1;
		System.out.println("El n�mero total de mensajes es : " + mensajes);
	}

	// Luego haremos referencia al m�todo decrementa
	public void decrementa() {
		int mens;
		System.out.println("Introduzca el n�mero de mensajes ");
		mens = S.nextInt();
		this.mensajes = mens - 1;
		System.out.println("El n�mero total de mensajes es : " + mensajes);
	}

	// El �ltimo m�todo abstracto que vamos a implementar es el m�todo de modificar el correo
	public void modificarCorreo() {
		System.out.println("Introduzca el nuevo nombre para su correo");
		correo = S.next();
		System.out.println("Su nuevo correo es : " + correo);
	}

	// Vamos a crear el �ltimo m�todo, que este no es un m�todo abstracto el cual hemos hecho creado en la clase padre
	// si no que es un m�todo caracter�stico de esta clase
	public void baneosInc() {
		System.out.println("Introduzca el n�mero de baneos que ha realizado el Administrador");
		baneos = S.nextInt();
		System.out.println("El n�mero de baneos son : " + baneos);
	}
}
