package m3.uf4;

import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumaFilaIntegers {

	public static void main(String[] args) throws IOException  {
/*CFGS DAM/DAWM03-UF4-NF4-Activitat1-SumFileIntegers Write a program that adds all the integers in a file of text integers. This program will be similar to the ManySquaresexample program 
 * of the chapter and will use a similar input file. Prompt the user for the name of the input file.
 
 
		
		
		Scanner teclat = new Scanner (System.in);
		
		int suma =0;
		int n;
		int [] fichero; // array para guardar los integers a almacenar
		
		File integer = new File ("e:\\integers.txt"); 
		//Scanner Scan = new Scanner( "e:\\integers.txt" );
		PrintWriter ficheroSuma = new PrintWriter ("e:\\integers.txt"); // clase PrintWriter para escribir sobre el fichero
			
		//output.println("esto es una prueba");
		//output.close();
		
		System.out.println(" cuántos números desea almacenar en el fichero");
		n = teclat.nextInt(); // dimensión a escoger del fichero
		
		fichero  = new int [n]; // adjunto el valor de n como dimensión del fichero
		
		
			for (int i=0; i<fichero.length; i++) {
				Scanner sc = new Scanner(System.in);  // adhesión del método scanner para delimitar al uso de Integers
				System.out.print("Ingrese numeros : ");  // verificacion del Integer
				int num = sc.nextInt();
				  // si es "true"
					//while (sc.hasNext()) { 
						//System.out.println(sc.next());
						ficheroSuma.write(fichero[i]); // carga en el array fichero
			}
			ficheroSuma.close();
						//suma = suma + num;	
							
			
					
			}

	
	
		//	System.out.println("La suma de los numeros es : " + suma );	
*/
	Scanner teclat = new Scanner (System.in);	
	int n;
	
	//Suma suma;
	File num = new File ("e:\\integers.txt");
	FileInputStream exit = new FileInputStream (num);
	DataOutputStream entrada = new DataOutputStream (exit);
	
	//FileOutputStream fichero1 = new FileOutputStream (num);
	//ObjectOutputStream salida =  new ObjectOutputStream (fichero1);
	
	System.out.println("ingrese la cantidad de numeros a sumar : ");
	n = teclat.nextInt();
	
	int [] fichero = null;
	
	for (int i=0; i<n; i++) {
		entrada.writeInt(fichero[i]);
	}
	
	entrada.close();
	}
	
}
	//try {
		
	
		
	//} catch (Exception ex) {ex.printStackTrace();
	
	
	
	//// variable auxiliar donde se almacena el fichero a leer
	//Integer n;
	
	
	
	//String escribir = "escribir este mensaje";  // variable a almacenar en el fichero de prueba
	//String leido = " "; // variable auxiliar donde se almacenara
	
	//blank = fichero;
	
	//fichero.toString();
	/*
	try {  // siempre se ha de usar el método try para controlar el flujo de potenciales errores pues al leer un archivo podrian ocurrir
		FileWriter integers = new FileWriter ("e:\\integers.txt"); //creacion de la ruta del fichero
		integers.write(escribir); // le indicamos que al fichero ha de escribirse lo que se definio en la variable String que queriamos guardar
		integers.close(); // es imperativo que se cierre con (close()) pues en caso contrario no almacena nada
		
	} catch (Exception ex) { ex.printStackTrace(); }// manejo del flujo de error  IMPORTANTÍSIMO
			
	try { // se han de indicar excepciones a comprobar el flujo por cada dato (uno para escribir, otro para leer y así dependiendo de lo que deseemos)
		FileReader lector = new FileReader ("e:\\integers.txt"); // se le indice el fichero a leer
		BufferedReader leer = new BufferedReader (lector);  // BufferedReader es una variable necesaria en la lectura de ficheros, ya que almacena la lectura que se aya haciendo del mismo
		leido = leer.readLine(); 
		
	} catch (Exception ex) { ex.printStackTrace();}
	
	System.out.println (" se ha guardado " + leido);*/
	




