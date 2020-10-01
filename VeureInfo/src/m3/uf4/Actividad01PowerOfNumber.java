package m3.uf4;

import java.util.Scanner;

public class Actividad01PowerOfNumber {

	public static void main(String[] args) {
		/*CFGS DAM/DAWM03-UF4-NF3-Activitat1-PowerOfANumberWrite a program that computes XNwhere X is a floating point number and N is a positive integer. The program must tell the user
		 *  that Nmust be positive when the user enters a negative  value. Do not use Math.pow()or similar, use a while.
		 * 
		 */
		
		Scanner teclat= new Scanner (System.in);
		

		float num1;    // declaracion del valor del parametro a convertir
		int n;      // parametro a calcular (n poencia)
		int x=0;      // variable contador del while
		float suma =  00 ;    // variable almacenadora del condicionl
		float total= 00;
		boolean comprobar;    // condicional a verificar el bloque de instrucciones del programa
		
		System.out.println("ingrese el valor a calcular : ");
		num1= teclat.nextFloat();   // adhesion del valor a la variable
		
		System.out.println("ingrese la potencia a calcular");
		n= teclat.nextInt();
		
		if (n>0) {    // condicional evaluador (si n es mayor a 0 "numero positivo", entonces comprobar es true
			comprobar = true;
			x=0;    // contador es cero
				while (true&& x<=n) {   // mientras el condicional del numero positivo es "true" y el contador sea menor a la potencia a calcular
					//num1 = num1 * num1;
					suma = num1 * num1;  // suma es igual a numero * numero
					total = suma * num1; // total es igual al resultado de la suma por el numero
					x++;   // contador incrementa hasta llegar a false y romper el ciclo
				}
				System.out.println(total);  // total (numero a la potencia)
		}
		else {  // en caso de no ser un numero positivo
				System.out.println(" la potencia no es un numero positivo");  // identificar que no es un positivo y por ende se cierra el ciclo
				}
		
		teclat.close();
	}

}
