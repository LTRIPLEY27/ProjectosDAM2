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

public class ComarcaCotxes  implements Serializable{ 
		

//implements java.io.Serializable//
							// la interfaz "seriarizable" indica que la clase hara uso de flujos de ent0rada y salida
	
	
	  // los atributos se han de definir en la clase al momento siguiente
	 // modelo de cada objeto cotxe
	
	

	
	
	
		public String marca;
		public String modelo;
		public int any;
		public String matricula;
		
		// constructor
		public ComarcaCotxes  (String m, String mo, int a, String ma){
			this.marca = m;
			this.modelo = mo;
			this.any = a;
			this.matricula = ma;
		}
		
		///////////////////////////////////////////////
		
		//Intenté realizar la recogida de datos coche por coche y arrays por arrays segun cada atributo pero me fue imposible pues no supe como implementarlo
		/*
		public String getMarca () {
			return (this.marca);
		}
		
		public void setMarca(String m) {
			this.marca = m;
		}
		
		public String getModelo () {
			return (this.modelo);
		}
		
		public void setModelo(String mo) {
			this.modelo = mo;
		}
		
		public int getAny () {
			return (this.any);
		}
		
		public void setAny (int a) {
			this.any = a;
		}
		
		public String getMatricula () {
			return (this.modelo);
		}
		
		public void setMatricula (String ma) {
			this.matricula = ma;
		}

		*/

static void arrayComarcaCotxes (ComarcaCotxes[] array) {
		for (int i=0; i< array.length; i++) {
			System.out.println((i+1) + array[i].marca + array[i].modelo + array[i].any + array[i].matricula);
		}
		
}	
		

		
		public static void main(String[] args) throws IOException {
			//Scanner teclat = new Scanner (System.in);
			
			ComarcaCotxes [] arrayComarcaCotxes = new ComarcaCotxes[10] ; // es mejor la insercion de datos en un array
			// se crea el array de objetos a almacenar en el fichero
			
			File cotxes = new File ("e:\\cotxesComarca.txt");
			FileOutputStream salida = new FileOutputStream (cotxes);
			ObjectOutputStream dataCotxe = new ObjectOutputStream (salida);
			
			//int n;
			//System.out.println("cuantos coches desea almacenar?");
			//n = teclat.nextInt();
			
			
				
			
			
			arrayComarcaCotxes [0] = new ComarcaCotxes ("mercedes", "benz", 1980, "ETK");
			arrayComarcaCotxes [1] = new ComarcaCotxes ("Buick", "coupe", 1956, "SDDF");
			arrayComarcaCotxes [2] = new ComarcaCotxes ("Rolls", "Roice", 1924, "WERT");
			arrayComarcaCotxes [3] = new ComarcaCotxes ("Ferrari", "L30", 1963, "ZORRO");
			arrayComarcaCotxes [4] = new ComarcaCotxes ("Jaguar", "litle bastard", 1967, "DEAN");
			arrayComarcaCotxes [5] = new ComarcaCotxes ("Audi", "A7", 2019, "SjklF");
			arrayComarcaCotxes [6] = new ComarcaCotxes ("Porsche", "coupe", 1956, "SDDF");
			arrayComarcaCotxes [7] = new ComarcaCotxes ("Ford", "Fordlane", 1927, "ERCYXZ");
			arrayComarcaCotxes [8] = new ComarcaCotxes ("BMW", "grand legacy", 1974, "876H");
			arrayComarcaCotxes [9] = new ComarcaCotxes ("Toyota", "corolla", 1986, "SppÜ");
			
			
			dataCotxe.writeObject(arrayComarcaCotxes);
			
			dataCotxe.close();
		
			//File cotxes = new File ("e:\\cotxesComarca.txt");
			
			System.out.println("los coches son;: ");
			arrayComarcaCotxes(arrayComarcaCotxes);
			System.out.println(" ");
	
			
	///////////////////////////////////////////////////
			
			
			//De esta forma si que me surgia la implementacion de datos atributo por atributo pero no eran para un objeto sino solo impresion en el fichero
			
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


	