package m3.uf5Actividad3;

import java.util.Scanner;

/*
 * Alumne: María Isabel Calzadilla.
 * DAM UF5
 * Date: 08-12-2020
 * Activity: Actividad 03 m03UF5
 */
public class MainCoffeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		Scanner ask = new Scanner (System.in);
		//15
		CoffeTester [] arrayCoffe = new CoffeTester[3];
		
		// carga de datos manual del array
		for (int i = 0; i < arrayCoffe.length; i++) {
			System.out.println(" ingrese los valores de PH a almacenar");
			num = ask.nextDouble();
			
			arrayCoffe[i] = new CoffeTester (num);
		}
		
		// impresion del array mediante un toString
		for (int i = 0; i < arrayCoffe.length; i ++) {
			System.out.println(arrayCoffe[i].toString());
		}
		
		double maxValor = CoffeTester.findMax();
		
		System.out.println(maxValor);
	

}
