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
		int o;
		System.out.println("indique cuantos valores desea almacenar");
		o = ask.nextInt();
		ask.nextLine();
		
		// objeto arrayCoffe del tipo CoffeTester
		CoffeTester arrayCoffe = new CoffeTester(o);
		
		// carga de datos manual del array
		for (int i = 0; i < arrayCoffe.getLongitud(); i++) {
			System.out.println(" ingrese los valores de PH a almacenar");
			num = ask.nextDouble();
			ask.nextLine();
			
			// refiere al método add donde le pasamos por parámetro el indice y el número
			arrayCoffe.add(i, num);
			System.out.println(" n n ");
			//arrayCoffe[i] = num;
		}
		
		System.out.println(arrayCoffe.findMax());
	

	}
}