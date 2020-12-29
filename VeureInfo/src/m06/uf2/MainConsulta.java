package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
	
		Scanner ask = new Scanner (System.in);
		
		String name, lastname, ident, agno,  direct, sex, postal, pobla;
		
		boolean respuesta = false;
		
		int opcion;
		boolean inicio = false;
		
		MySQLFirts tabla = new MySQLFirts (null, null, null, null, null, null, null);
		
		System.out.println("la tabla sobre la que se trabaja es la siguiente");
		tabla.mostrarTabla();
		
		while (inicio == false) {
		
		System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
				"desea insertar alumno (1)" + '\n' + "desea modificar alumno (2)" + '\n' +
				"desea eliminar alumno  (3)" +  '\n' + "realizar alguna consulta sobre la tabla ALUMNES (4)" + '\n' 
				+ "crear tabla poblacion (5)" + '\n'  + "modificar poblacion (6)" + '\n' + "eliminar poblacion (7)" + '\n' 
				+ "consulta sobre la tabla POBLACION (8)" + '\n' + "salir (9)");
		
		opcion = ask.nextInt();
		
			switch (opcion) {
			
			case 1:
				System.out.println(" ingrese nombre");
				name = ask.next();
				
				System.out.println(" ingrese apellido");
				lastname = ask.next();
				
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

				
				MySQLFirts nueva = new MySQLFirts (name , lastname, ident, agno, direct, sex, postal);
			
				nueva.metodoInsertar();
				nueva.mostrarTabla();
				break;
				
			case 2:
				String eleccion;
				String col;
				String nuevoValor;
				
				System.out.println("ingrese el nombre de la columna a la que desea editar el parámetro");
				col = ask.next();
				
				System.out.println(" ingrese  el nuevo valor que desea modificar  ");
				eleccion = ask.next();
				
				System.out.println(" ingrese el DNI de la fila a modificar");
				nuevoValor = ask.next();
			
				tabla.metodoModificar( col, eleccion, nuevoValor);
				tabla.mostrarTabla();	
				
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
				char response;
				System.out.println("desea realizar una consulta sobre una columna específica, marque (Y) para sí, o (N) para consultar la tabla al completo");
					response = ask.next().charAt(0);
					if (response == 'Y' || response == 'y') {
						String sen1;			
						
						System.out.println(" ingrese la columna a consultar");
						sen1 = ask.next();
						
						tabla.metodoConsultaSobreunElemento(sen1);
					} else {
						tabla.mostrarTabla();
					}
			
				break;
				
			case 5:
				String code, pobl;
				System.out.println(" ingrese la poblacion que desea crear");
				pobl = ask.next();
				
				System.out.println(" ingrese el codigo postal");
				code = ask.next();
				
				tabla.crearPoblacion(code, pobl);
				
				//tabla.consultaPoblacion();
				tabla.mostrarPoblacion();
				
				break;
				
			case 6:
				
				String poblatName;
				String neu;
				String clau;
				
				System.out.println("ingrese el nombre de la columna que desea modificar");
				poblatName = ask.next();
				
				System.out.println("ingrese el nombre de la nueva poblacion");
				neu = ask.next();
				
				System.out.println("ingrese el codigo postal de la poblacion a modificar");
				clau = ask.next();
				
				tabla.modificaPoblacion( poblatName, neu, clau);
				tabla.mostrarPoblacion();
				
				break;
			case 7:
				String eli;
				char res;
				boolean resp = false;
				System.out.println(" ingrese el codigo de la poblacion que desea eliminar");
				eli = ask.next();
				
			    tabla.verificaCodigo(eli);
			    tabla.getContador();
				System.out.println(tabla.getVerificaCodigo());
				//tabla.CodigoVerificado(eli);
				//System.out.println(tabla.getCodigoVerificado());
				
				if (tabla.getCodigoVerificado() == true) {
					System.out.println(" el código a eliminar lo dispone uno o más alumnos, si lo elimina, eliminará al alumno, desea continuar, marque 'y' para (sí) o 'n' para no ?");
					res = ask.next().charAt(0);
					if (res == 'Y' || res == 'y') {
						resp = true;
					} else {
						resp = false;
					}
				
				} else if (tabla.getCodigoVerificado() == false && tabla.getContador() < 1 )  {
					System.out.println("el código a eliminar la poblacion?");
					res = ask.next().charAt(0);
					if (res == 'Y' || res == 'y') {
						resp = true;
					} else {
						resp = false;
					}
				} else {
					System.out.println("verifique bien la consulta para no borrar alumnos de forma indeseada");
				}
				
				tabla.eliminaPoblacion(eli, resp);
				
				//tabla.mostrarPoblacion();
				
				//tabla.verificaCodigo(eli);
				//System.out.println(tabla.getVerificaCodigo());
				//tabla.verificaCodigo(eli);
				
				break;
				
			case 8:
				char a;
				System.out.println("Para realizar una consulta sobre una columna, marque (Y) o sobre toda la tabla cualquier tecla");
				a = ask.next().charAt(0);
					if (a == 'Y' || a == 'y') {
						String x;
						System.out.println("indique el nombre de la columna a consultar");
						x = ask.next();
						tabla.metodoConsultaPoblacion(x);
					} else {
						tabla.mostrarPoblacion();
					}
				break;
				
			case 9:
				inicio = true;
				break;
				
			default :
				System.out.println(" OPCION NO VALIDA, INTENTE NUEVAMENTE");
			}
			
		}

		
	}
}