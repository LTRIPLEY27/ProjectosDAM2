package m05EntornosdeDesarrolloActividad1DisenyPruebas;

import java.util.Scanner;

public class Pruebas1 {
		
		static int getComptador(int x, int y) {  // los m�todos deben de iniciar con una min�scula y ser verbos
			Scanner entrada = new Scanner (System.in);
			int num, c=0;
			if (x>0 && y>0){
				System.out.println("Escriu un n�mero");
				num = entrada.nextInt();
				if (num>=x && num<=y) {
					System.out.println("\tN�mero en el rang");
					c++;
				}
				else
					System.out.println("\tN�mero fora del rang");
			}
			else
				c= -1;
			entrada.close();
			return c;
		}

	

}