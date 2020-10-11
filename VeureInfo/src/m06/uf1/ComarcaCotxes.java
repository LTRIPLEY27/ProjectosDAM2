package m06.uf1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class ComarcaCotxes { 
		

//implements java.io.Serializable//
							// la interfaz "seriarizable" indica que la clase hara uso de flujos de ent0rada y salida
	
	
	  // los atributos se han de definir en la clase al momento siguiente
	 // modelo de cada objeto cotxe
	
	

	
	
	
		public String marca;
		public String modelo;
		public int any;
		public String matricula;
		
		public ComarcaCotxes  (String marca, String modelo, int any, String matricula){
			this.marca = marca;
			this.modelo = modelo;
			this.any = any;
			this.matricula = matricula;
		}
		


static void arrayComarcaCotxes (ComarcaCotxes[] array) {
		for (int i=0; i< array.length; i++) {
			System.out.println((i+1) + array[i].marca + array[i].modelo + array[i].any + array[i].matricula);
		}
		//+ array[i].modelo, + array[i].matricula
}	
		
		
		public static void main(String[] args) {
			Scanner teclat = new Scanner (System.in);
			
			int n;
			System.out.println("cuantos coches desea almacenar?");
			n = teclat.nextInt();
			
			ComarcaCotxes [] arrayComarcaCotxes = new ComarcaCotxes[n] ; // es mejor la insercion de datos en un array
			
			
			
			
			arrayComarcaCotxes[0] = new ComarcaCotxes ("mercedes", "benz", 1980, "ETK");
			arrayComarcaCotxes [1] = new ComarcaCotxes ("Buick", "coupe", 1956, "SDDF");
			arrayComarcaCotxes [1] = new ComarcaCotxes ("Buick", "coupe", 1956, "SDDF");
			
			
			
			//File cotxes = new File ("e:\\cotxesComarca.txt");
			
			System.out.println("los coches son;: ");
			arrayComarcaCotxes(arrayComarcaCotxes);
			
			
			
	/*FileOutputStream salida = new FileOutputStream (cotxes);
	
	ObjectOutputStream imprime = new ObjectOutputStream(salida);
	//DataOutputStream imprime = new DataOutputStream (salida);
 	//FileWriter cotxes1 = new FileWriter ("cotxes");
 	//PrintWriter cotxes2 =  new PrintWriter ("cotxes");
 	int n;
 	
 	String [] marca ;
 	String [] modelo;
 	int [] any;;
 	String  [] matricula;
 	
 	
 		
 	System.out.println("Cuántos coches desea almacenar?");
 	n= teclat.nextInt();
 	
 	marca = new String [n];
 	modelo = new String [n];
 	any = new int [n];
 	matricula = new String [n];
	
 	
 	
 	for (int i=0; i<n; i++) {
 		
 		System.out.println(" ingrese la marca : ");
 		marca[i] = teclat.next();
 		
 		
 		System.out.println("ingrese el modelo : ");
 		modelo[i] = teclat.next();
 		
 		System.out.println("ingrese el any");
 		any[i] = teclat.nextInt();
 		
 		System.out.println(" ingrese la matrícula");
 		matricula [i] = teclat.next();
 		
 		
 		
 		cotxe = new ComarcaCotxes (); 
 		
 		imprime.writeUTF(marca[i]);	
 		imprime.writeUTF(modelo[i]);
 		imprime.writeInt(any[i]);
 		imprime.writeUTF(matricula[i]);
 		
 	}

 	imprime.close();*/
	}
 	
	
 		}


	