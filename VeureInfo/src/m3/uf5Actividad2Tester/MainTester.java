package m3.uf5Actividad2Tester;

import java.util.Scanner;

public class MainTester {

	public static void main(String[] args) {
		
		Scanner ask = new Scanner (System.in);
		String num;
		
		System.out.println(" ingrese el numero a evaluar : ");
		num = ask.next();
		
		// DEFINICION DEL OBJETO DE LA CLASE REVERSIVENUMBERS
		ReversiveNumbers numero = new ReversiveNumbers (num);
		
		/*for (int i = 0; i < numero.length; i++) {
			// CARGA DEL NÚMERO DENTRO DEL ARRAY 
			System.out.println("ingrese el número : ");
			num = ask.next();
			
			numero[i] = new ReversiveNumbers(num);
		}*/
		
		
		//System.out.println(numero.retorna());
		
		System.out.println(numero.getReversive());

	}

}
