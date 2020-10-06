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
		int n;      // parametro a calcular (n potencia)
		int x=0;      // variable contador del while
		float aux = 1;  // variable auxiliar para llevar el control del float base, en la primera ronda sera el valor uno para luego ir adhiriendo el resultado al multiplicar por el float e incrementar
		boolean comprobar;    // condicional a verificar el bloque de instrucciones del programa
		
		System.out.println("ingrese el valor a calcular : ");
		num1= teclat.nextFloat();   // adhesion del valor a la variable
		
		System.out.println("ingrese la potencia a calcular");
		n= teclat.nextInt();// valor del numero positivo
		
		if (n>0) {    // condicional evaluador (si n es mayor a 0 "numero positivo", entonces comprobar es true
			comprobar = true;
			x=0;    // contador evaluador del while es cero
				while (true&& x<n) {   // mientras el condicional del número positivo es "true" y el contador sea menor a la potencia a calcular
					aux = aux * num1;  // aux es igual a 1 * numero mientras el contador del while sea menor a la potencia
					x++;   // contador incrementa hasta llegar a false y romper el ciclo
				}
				System.out.println(aux);  // total (numero a la potencia)
		}
		else {  // en caso de no ser un numero positivo no entra al bloque del while ya que deriva del condicional
				System.out.println(" la potencia no es un número positivo");  // identificar que no es un positivo y por ende se cierra el ciclo
				}
		
		teclat.close();
	}

}

