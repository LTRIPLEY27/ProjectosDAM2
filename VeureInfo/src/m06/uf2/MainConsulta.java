package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
	
		Scanner ask = new Scanner (System.in);
		
		String name, ident, agno,  direct, sex, postal, pobla;
		
		boolean respuesta = false;
		
		int opcion;
		
		MySQLFirts tabla = new MySQLFirts (null, null, null, null, null, null);
		
		System.out.println("la tabla sobre la que se trabaja es la siguiente");
		tabla.mostrarTabla();
		
		
		
		System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
				"desea insertar alumno (1)" + '\n' + " desea modificar alumno (2)" + '\n' +
				"desea eliminar alumno  (3)" +  '\n' + " realizar alguna consulta sobre un elemento (4)" + '\n' 
				+ "crear tabla poblacion (5)" + '\n'  + " eliminar poblacion (6)" + '\n' + "salir (7)");
		
		opcion = ask.nextInt();
		
		while (opcion < 7) {
			switch (opcion) {
			
			case 1:
				System.out.println(" ingrese nombre");
				name = ask.next();
				
				System.out.println(" ingrese DNI");
				ident = ask.next();
				
				System.out.println(" ingrese any de nacimiento");
				agno = ask.next();
				
				System.out.println(" ingrese direccion postal");
				direct = ask.next();
				
				System.out.println(" ingrese sexo");
				sex = ask.next();
				
				System.out.println(" ingrese código postal");
				postal = ask.next();
				
				//System.out.println(" ingrese poblacion");
				//pobla = ask.next();

				
				MySQLFirts nueva = new MySQLFirts (name , ident, agno, direct, sex, postal);
			
				nueva.metodoInsertar();
				nueva.mostrarTabla();
				break;
				
			case 2:
				String eleccion;
				String col;
				String nuevoValor;
				//System.out.println(" ingrese la columna que desea modificar");
				//col = ask.next();
				System.out.println(" ingrese  la fila que desea modificar  ");
				eleccion = ask.next();
				System.out.println(" ingrese el nuevo valor a modificar");
				nuevoValor = ask.next();
				tabla.metodoModificar( eleccion, nuevoValor);
				tabla.mostrarTabla();	
				//}
				break;
				
			case 3:
				String elemento;
				String column;
				System.out.println(" ingrese la columna a eliminar");
				column = ask.next();
				System.out.println(" ingrese el elemento a eliminar");
				elemento = ask.next();
				
				tabla.metodoBorrar(elemento, column);
				tabla.mostrarTabla();
				break;
				
			case 4:
				String elem;
				String elem1;
				
				
				
				System.out.println(" ingrese la columna a consultar");
				elem = ask.next();
				
				System.out.println(" ingrese el elemento a consultar");
				elem1 = ask.next();
				
				tabla.metodoVerificaElemento(elem, elem1);
				break;
				
			case 5:
				String code, pobl;
				System.out.println(" ingrese la poblacion que desea crear");
				pobl = ask.next();
				
				System.out.println(" ingrese el codigo postal");
				code = ask.next();
				
				tabla.crearPoblacion(code, pobl);
				
				tabla.consultaPoblacion();
				tabla.mostrarPoblacion();
				
				break;
				
			case 6:
				String eli;
				System.out.println(" ingrese el codigo de la poblacion que desea eliminar");
				eli = ask.next();
				
				tabla.eliminaPoblacion(eli);
				
				tabla.mostrarPoblacion();
			default :
				System.out.println(" OPCION NO VALIDA, INTENTE NUEVAMENTE");
			}
			
		}
		/*
		 * 
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