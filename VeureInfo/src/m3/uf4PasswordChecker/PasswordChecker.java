package m3.uf4PasswordChecker;
/*
 * File: PasswordChecker.java
 * Author: María Isabel Calzadilla
 * Date: 10-22-2020
 * Description: Actividad 4 PasswordChecker M=03
 */
import java.io.Serializable;
import java.util.Scanner;

/*	public static void main(String[] args) {
// Write a program that repeatedly asks the user for a proposed password until the user enters  an  acceptable  password.
//When  the  user  enters  an  acceptable  password,  the program writes a message and exits. Acceptable passwords: 
//1.Are at least 7 characters long.2.Contain both upper and lower case alphabetic characters.3.Contain at least 1 digit.
//The logic of this program can be quite tricky. 
*/

public class PasswordChecker implements Serializable {
	
	//atributos de la clase PasswordChecker
	private String password;

	
	// constructor de la clase password
	public  PasswordChecker ( String p)
	{

		this.password = p;
	}

	public PasswordChecker() {
		// TODO Auto-generated constructor stub
	}

	public String getPassword()  // metodo para obtener la contrasenya
	{
		return (this.password);
	}
	
	public void  setPassword (String p)  // método para actualizar la contrasenya
	{
		this.password = p;
	}
	
	
	public  boolean verificar_clave() { // se modifico el String ya que no es un void y debe de retornar el valor a analizar 	
			
			
			if (this.password.length()>=7) { // condicional de la longitud necesaria para ser admisible
				if (verificar_letra_Minuscula()) {
					System.out.print("contrasenya admitida ");
					return true;  // los convertí a datos booleans para mayor eficiencia	
				}
				
				else {
					return false;  // condicional falso a romper el ciclo interno que concatena la funcion siguiente
				}
			} else  // condicional externo
			
			{
				System.out.print("no es admitida, tiene que tener al menos 7 caracteres");
				return false;
	
		}
	
	}
	
	
	public  boolean verificar_letra_Minuscula () {  // método para verificar las condiciones siguiente, está interrelacionado con el If interno del método anterior
		char x;  // variable auxiliar para verificar
		boolean letraMayus = false;  // se inicia el boolean con el valor en false para que devuelva la respuesta
		boolean letraMin = false; // condicional minúscula
		boolean num = false; // condicional del integer
		
		for (int i=0; i<this.password.length(); i++) {  // el for verifica el string del main con el constructor y los "setters"
			x = this.password.charAt(i);   // uso de la variable condicional para verificar caracter a caracter con el método charAt cada elemento
			if(Character.isUpperCase(x)) {  // Clase "Character" Java (crea un objeto en circunstancias extraordinarias y verifica un dato del tipo primitivo "chars", "floats", "integers")
				letraMayus = true;   // con la clase se facilita el uso de multiples métodos como los que hago uso
			}
			else if (Character.isLowerCase(x)) { // verificacion del objeto "Character" para verificar si contempla una minúscula
				letraMin = true;
			} else if (Character.isDigit(x)) {  // verificación con el método "isDigit"
				num = true;
			}
			
			if (letraMayus && letraMin && num) {   // condicional global, si cada elemento es "true" entonces la contrasenya es válida
				System.out.print("admitida");
				return true;
				}
			}
		System.out.print("no es admitida, debe contener al menos 1 digito, 1 mayúscula y 1 minúscula");
		return false;  // respuesta en caso de no cumplirse las condiciones
		}
	}
			
	