package m3.uf5Actividad2Tester;

import java.util.Scanner;

public class MainTester {

	public static void main(String[] args) {
		
		Scanner ask = new Scanner (System.in);
		//int []num;
		
		System.out.println("indique el número a verificar");
		int [] num = new int [ask.nextInt()];
		
		ReversiveNumbers [] numero = new ReversiveNumbers (int [] num);
		
		

	}

}
