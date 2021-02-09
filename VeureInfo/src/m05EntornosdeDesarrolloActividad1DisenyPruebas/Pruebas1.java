package m05EntornosdeDesarrolloActividad1DisenyPruebas;

import java.util.Scanner;

public class Pruebas1 {
		
		static int getComptador(int x, int y) {  // los métodos deben de iniciar con una minúscula y ser verbos
			Scanner entrada = new Scanner (System.in);
			int num, c=0;
			if (x>0 && y>0){
				System.out.println("Escriu un némero");
				num = entrada.nextInt();
				if (num>=x && num<=y) {
					System.out.println("\tNúmero en el rang");
					c++;
				}
				else
					System.out.println("\tNúmero fora del rang");
			}
			else
				c= -1;
			entrada.close();
			return c;
		}

	

}