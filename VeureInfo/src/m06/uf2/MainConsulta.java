package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
	
		Scanner ask = new Scanner (System.in);
		
		String name, ident, direct, sex, pobla;
		
		boolean respuesta = false;
		
		int agno, postal;
		
		MySQLFirts tabla = new MySQLFirts (null, null, 0, null, null, 0, null);
		
		System.out.println("la tabla sobre la que se trabaja es la siguiente");
		tabla.mostrarTabla();
		
		while (respuesta) {
			
			
		}
		/*
		System.out.println(" ingrese nombre");
		name = ask.next();
		
		System.out.println(" ingrese DNI");
		ident = ask.next();
		
		System.out.println(" ingrese any de nacimiento");
		agno = ask.nextInt();
		
		System.out.println(" ingrese direccion postal");
		direct = ask.next();
		
		System.out.println(" ingrese sexo");
		sex = ask.next();
		
		System.out.println(" ingrese código postal");
		postal = ask.nextInt();
		
		System.out.println(" ingrese poblacion");
		pobla = ask.next();

		
		MySQLFirts nueva = new MySQLFirts (name , ident, agno, direct, sex, postal, pobla);
	
		//nueva.metodoInsertar();
		
		*/
		
	}
}