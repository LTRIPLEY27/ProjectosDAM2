package m3.uf4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumaFilaIntegers {

	public static void main(String[] args) throws IOException {
/*CFGS DAM/DAWM03-UF4-NF4-Activitat1-SumFileIntegers Write a program that adds all the integers in a file of text integers. This program will be similar to the ManySquaresexample program 
 * of the chapter and will usea similar input file. Prompt the user for the name of the input file.
 * 
 
		
		File program = new File("integer.txt");
		Scanner scan = new Scanner (program);
		
		PrintWriter output = new PrintWriter ("integer.txt");
		output.println();*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese numeros : ");
		int num = sc.nextInt();
		System.out.println("La suma de los numeros es : " + suma(num));
	}
	public static int suma(int num) 
	{
		return num + num;
	}


	}


