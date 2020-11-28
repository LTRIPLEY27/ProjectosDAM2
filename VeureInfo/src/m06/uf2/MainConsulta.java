package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
	
		Scanner ask = new Scanner (System.in);
		
		String name, ident, direct, sex, pobla;
		
		boolean respuesta = false;
		
		int agno, postal, opcion;
		
		MySQLFirts tabla = new MySQLFirts (null, null, 0, null, null, 0, null);
		
		System.out.println("la tabla sobre la que se trabaja es la siguiente");
		tabla.mostrarTabla();
		
		System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
				"desea insertar alumno (1)" + '\n' + " desea modificar alumno (2)" + '\n' +
				"desea eliminar alumno  (3)" + '\n' + "modificar poblacion (4)" + '\n' + "salir (5)");
		
		opcion = ask.nextInt();
		
		while (opcion < 5) {
			switch (opcion) {
			
			case 1:
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
			
				nueva.metodoInsertar();
				nueva.mostrarTabla();
				break;
				
			case 2:
				//String modifica = ("UPDATE  ");
				String eleccion;
				int valor;
				String nuevoValor;
				System.out.println(" ingrese la columna que desea modificar");
				eleccion = ask.next();
				System.out.println(" ingrese el numero de la fila que desea modificar  ");
				valor = ask.nextInt();
				System.out.println(" ingrese el nuevo valor a modificar");
				nuevoValor = ask.next();
				String modifica = ("UPDATE ALUMNE SET " + eleccion + " = " + nuevoValor + "WHERE " + eleccion + " = " + valor);
				//if (eleccion.equalsIgnoreCase(name)) {
				tabla.mostrarTabla();	
				//}
				break;
			}
			
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