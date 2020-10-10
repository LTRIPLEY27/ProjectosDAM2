package m3.uf4;

import java.io.*;
import java.util.Scanner;

public class SumaFilaIntegers {

	public static void main(String[] args) throws IOException  {
/*CFGS DAM/DAWM03-UF4-NF4-Activitat1-SumFileIntegers Write a program that adds all the integers in a file of text integers. This program will be similar to the ManySquaresexample program 
 * of the chapter and will use a similar input file. Prompt the user for the name of the input file.
*/
	Scanner teclat = new Scanner (System.in);	
	int n; // variable a guardar con la instruccion de la cantidad de n�meros a sumar
	int [] fichero;  // arreglo del fichero para recorrer y almacenar los numeros con el parametro anterior
	int suma=0;
	int number;  // variable auxiliar
	 
	File num = new File ("e:\\integers.txt"); // creacion del fichero
	FileWriter exit = new FileWriter (num);  // el m�todo FileWriter funciona como escritura en el fichero, por elllo se le da el valor del (num)
	PrintWriter output = new PrintWriter ("e:\\integers.txt");// m�todo PrintWriter imprime los datos "escritos" en el m�todo FileWriter
	//FileReader lector = new FileReader (num);// m�todo FileReader funciona para "Leer" los valores previamente "escritos" e "impresos, siempre se ha de seguir el orden
	

	
	System.out.println("ingrese la cantidad de numeros a sumar : ");
	n = teclat.nextInt(); // cantidad de numeros a almacenar y sumar
	
	fichero = new int [n]; // cantidad de numeros a guardar en el fichero (dimensi�n)
	
	for (int i=0; i<n; i++) {
		System.out.println("ingrese n�meros por teclado ");
		fichero [i] = teclat.nextInt(); // hacemos uso de la variable auxiliar a almacenar ya que a�n no se pueden conpiar directamente en el fichero
		suma = suma + fichero[i];
	
		
	}
	
	
	for (int i=0; i<n; i++) {
		exit.write(fichero[i]); // copiamos los valores del arreglo "fichero" en Fichero que creamos con el m�todo "Write"
	}
	
	exit.close(); // es imperativo cerrar cada m�todo
	
	for (int i=0; i<n; i++) {
		output.print(fichero[i]);
	}
	
	output.close();
		
// excepciones en java
	try (Scanner scan = new Scanner (num)){// la sentencia funciona indic�ndoles la condici�n del bloque antes del par�ntesis, puede ser m�s funcional
			while (scan.hasNext()) {  // indexamos la clase scan para verificar y manejar el control del flujo de la informacion con el par�metro de nuestra eleccion (en este caso un Int) pero es aplicativo a otros tipos
				number = scan.nextInt();  // introducimos la variable number como auxiliar para que la clase scannener verifique numero a numero almacenado en el fichero la condicion				
			}
		System.out.println("la suma total es : " + suma);
		
		}catch (FileNotFoundException e) { // primera excepcion en caso de no conseguir el fichero
		System.out.println(" el archivo no existe");
	}catch (IOException e) { // excepcion IO 
		System.out.println("SE HA PRODUCIDO UN ERROR");
		}
	}
	
}
	