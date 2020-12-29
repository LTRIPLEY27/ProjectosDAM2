package m3.uf4PasswordChecker;

import java.util.Scanner;

public class PasswordMain {

	public static void main(String[] args) {

		Scanner teclat = new Scanner (System.in);
		
		// declaro la clase Scanner para capturar la variable por teclado
		Scanner pass = new Scanner (System.in);
		PasswordChecker PasswordtoCheck = new PasswordChecker (); //  declaracion del objeto de la clase Password
		String resposta = "y"; // condicional para el menu
		
		while (resposta.contains("y") || resposta.contains("Y")) {
		
			System.out.print ("ingrese la contrasenya : " );
			String p = pass.next();
		
			PasswordtoCheck.setPassword(p);
			PasswordtoCheck.verificar_clave();
			System.out.println (PasswordtoCheck.verificar_clave());// se debe de indican en el main la impresion del método pues en caso contrario devuelve el error de no imprimir nada
		
		
			System.out.println (" ");
			System.out.println ("desea continuar, indique con un (y) para si o con un (n) para salir ?" );
			resposta = teclat.next();
		
		}
		}


	}



