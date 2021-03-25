package PrimeraActividad;

import java.util.Scanner;

//Vamos a poner la clase abstracta ya que vamos a definir los m�todos sin implementarlos en esta clase
//y luego en las clases hijas, que van a heredar, vamos a llamar al m�todo y ah� si que vamos a 
//crearlos
public abstract class Usuario {
	Scanner S = new Scanner(System.in);
	// Vamos a definir los atributos de la clase
	// Vamos a poner los atributos como protected ya que se realizar�n ciertas tareas�
	// con herencia y es lo m�s c�modo
	protected int mensajes;
	protected String correo;
	protected String nick;

	// Vamos a crear un constructor
	public Usuario(int mensajes, String correo, String nick) {
		this.mensajes = mensajes;
		this.correo = correo;
		this.nick = nick;
	}

	// Antes de crear los m�todos que nos pide el problema, vamos a generar los getters y setters de los tres atributos
	// que hemos creado
	public int getMensajes() {
		return mensajes;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	// Vamos a implementar el primer m�todo
	public abstract void incrementa();

	// Vamos a implementar el segundo m�todo
	public abstract void decrementa();

	// Y por �ltimo vamos a crear el tercer m�todo
	public abstract void modificarCorreo();
}
