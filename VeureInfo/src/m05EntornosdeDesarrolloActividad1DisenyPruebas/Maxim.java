package m05EntornosdeDesarrolloActividad1DisenyPruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maxim {
	public static void main(String[] args) throws IOException {  // a las clases con Excepciones es imperativo desde java encrustarla en un bucle trz para capturar cualquier eventualidad surgida
		
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		int x,y,z,max;
		
		System.out.println("Introdueix x,y,z: ");
		x = Integer.parseInt (entrada.readLine());
		y = Integer.parseInt (entrada.readLine());
		z = Integer.parseInt (entrada.readLine());
		
		if (x>y && x>z)
			max = x;       // revisar codificación del if sin llaves
		else
			if (z>y)
				max = z;
			else
				max = y;
		System.out.println ("El máxim és "+ max);
		
		
	}
}
