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
		
		numero.revierteNumero();
		System.out.println(numero.getReversive());
		
		//numero.sumaNumero();
		
		numero.convertReversive();
	//System.out.println("la suma es " +  numero.convertReversive(););

	}

}
