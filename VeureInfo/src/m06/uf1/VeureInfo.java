package m06.uf1;
import java.io.File;// Imput In and Out.
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class VeureInfo {

	public static void main(String[] args) {
		//Exercici 1
				//Fes un programa que s'anomeni VeureInfo que:

			  //Accepti de l�nia d'ordres (args[0]) el directori o fitxer que es vol consultar. Cal comprova que existeix file.exists()
			  // Si �s un directori (file.isDirectory()) que mostri el seu contingut, com ho fa a CODI1.1
				// Si �s un fitxer (file.isFile()) que mostri la seva informaci�, com ho fa a CODI1.2
				
				System.out.println("indique el fichero a consultar : ");
				
				File comprobar = new File (args[0]);  // objeto comprobar de forma autom�tica
				System.out.println(comprobar);
				long lastModified = comprobar.lastModified(); // usamos el dato primitivo long para adjuntar el formato del me�todo
				String pattern = "yyyy-MM-dd hh:mm aa";  // Expresion regular que nos ayudar� a verificar la fecha en un formato convencional, modificando el m�todo "lastModified" para 
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); // clase SimpleDateFormat para ordenar los milisegundos que nos devuelve el m�todo "lastModified" al formato que le indicamos en el pattern
				
				Date modificacion = new Date(lastModified );
				System.out.println( "El archivo " + comprobar + " fue modificado por �ltima vez :  " + simpleDateFormat.format( lastModified ) );
				
				boolean Respuesta; // comprobacion l�gica para el programa
				
				if (comprobar.exists()==true){ // condicional limitante a cada una de las opciones y los bloques a realizar en caso de true or false comrpobando el m�todo ".exists"
					Respuesta = true;
				
				
				// condicional para retornar el valor deseado== si es un directorio (bloque de instrucciones)
				
					while (!false&&comprobar.isDirectory() || comprobar.isFile()) {  // condicional para 
						System.out.println("El archivo Existe :    " + comprobar.exists()); // m�todo para saber si existe o no un fichero (retorna un valor boolean)
						System.out.println("__"); // adjunto para que sea mas claro en el programa
					
							System.out.println("Es un directorio  :    " + comprobar.isDirectory()); // m�todo indicativo de si es o no un directorio (
							String [] directorio = comprobar.list();  // adjunci�n del valor del argumento en un array para imprimir todos los valores
							for (int i= 0; i<directorio.length; i++) {
								System.out.println(directorio[i]); // impresion del array del directorio 
							
							}
							System.out.println("Nombre del fichero : " + comprobar.getName()); // m�todo para obtener el nombre de un fichero (getName)
							System.out.println("Ruta           : "+comprobar.getPath());
							System.out.println("Ruta absoluta  : "+comprobar.getAbsolutePath());
							System.out.println("Es pot escriure: "+comprobar.canRead());
							System.out.println("Es pot llegir  : "+comprobar.canWrite());
							System.out.println("Grandaria      : "+comprobar.length());
							System.out.println("Est� oculto      : "+comprobar.isHidden());
							
							//if (comprobar.lastModified()){
								
							//}
						break;// en caso de entrar al bucle while y cumplir las �rdenes finalizar con la directiva break
							
								
					}} // cerrado del ciclo en caso de que el m�todo sea "true"
				else  { // condicional en caso de que el m�todo sea "false"
						System.out.println("la l�nea de ordenes no es un fichero ni un directorio"); // sentencia final de cierre
		}

	}
		}
	
	

		
