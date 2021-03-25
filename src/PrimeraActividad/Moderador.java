package PrimeraActividad;

import java.util.Scanner;

public class Moderador extends Usuario {
	Scanner S = new Scanner(System.in);
	// Al tratarse de una clase hija que est� heredando de su clase padre, y esta clase padre (en este caso Usuario) es
	// abstracta, pues tenemos que hacer referencia a los m�todos abstractos de la clase padre.
	// Vamos a definir los atributos
	private int mensajes;
	private String correo;
	private String nick;
	private int papelera;

	// Vamos a crear un constructor. En este constructor vamos a tener que hacer referencia, con la palabra reservada super,
	// a los atributos de la clase padre Usuario
	public Moderador(int mensajes, String correo, String nick, int men, String cor, String nic, int papelera) {
		super(mensajes, correo, nick);
		this.correo = cor;
		this.mensajes = men;
		this.nick = nic;
		this.papelera = papelera;
	}

	// Vamos a hacer referencia al primer m�todo abstracto, que se va a encargar de incrementar el n�mero de mensajes
	public void incrementa() {
		int mens;
		System.out.println("Introduzca el n�mero de mensajes que hay ");
		mens = S.nextInt();
		this.mensajes = mens + 1;
		System.out.println("El n�mero de mensajes totales es : " + mensajes);
	}

	// Vamos a hacer referencia al segundo m�todo, que se va a encargar de decrementar el n�mero de mensajes
	public void decrementa() {
		int mens;
		System.out.println("Introduzca el n�mero de mensajes que hay ");
		mens = S.nextInt();
		this.mensajes = mens - 1;
		System.out.println("El n�mero de mensajes es : " + mensajes);
	}

	// Vamos a hacer referencia al tercer m�todo de modificar correo
	public void modificarCorreo() {
		System.out.println("Por favor moderador, introduzca su nuevo correo");
		correo = S.next();
		System.out.println("Su nuevo correo es : " + correo);
	}

	// Vamos a crear un nuevo m�todo llamado papeleraInc
	public void papeleraInc() {
		System.out.println("Introduzca el n�mero de post que ha introducido en su papelera");
		papelera = S.nextInt();
		System.out.println("El n�mero de post que hay en la papelera es : " + papelera);
	}
}
