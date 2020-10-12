package m06.uf1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
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
	
	
	
	
		private String marca;
		private String modelo;
		private int any;
		private String matricula;
		
		// constructor
		public ComarcaCotxes  (String marca, String modelo, int any, String matricula){
			this.marca = marca;
			this.modelo = modelo;
			this.any = any;
			this.matricula = matricula;
		}
		
		
		
		///////////////////////////////////////////////
		
		//Intenté realizar la recogida de datos coche por coche y arrays por arrays segun cada atributo pero me fue imposible pues no supe como implementarlo
		
		public String getMarca () {
			return (this.marca);
		}
		
		public void setMarca(String ma) {
			marca = ma;
		}
		
		public String getModelo () {
			return (this.modelo);
		}
		
		public void setModelo(String mo) {
			modelo = mo;
		}
		
		public int getAny () {
			return (this.any);
		}
		
		public void setAny (int a) {
			any = a;
		}
		
		public String getMatricula () {
			return (this.matricula);
		}
		
		public void setMatricula (String ma) {
			matricula = ma;
		}

		

static void arrayComarcaCotxes (ComarcaCotxes[] array) { // en la busqueda de métodos funcionales para el ejercicio di con el arraList, el cual aun no comprendo del todo bien pero intenté hacer uso para el código del programa
		for (int i=0; i< array.length; i++) { //en el método array intenté replicar al ejercicio almacenado en un único arreglo de objetos, arreglos de atributos.
			System.out.println((i) + array[i].marca + array[i].modelo + array[i].any + array[i].matricula);
		}// almacené el arreglo de atributos en un único array
		
}	
		

		
		public static void main(String[] args) throws IOException  {
			//Scanner teclat = new Scanner (System.in);
			ComarcaCotxes[] arrayComarcaCotxes = new ComarcaCotxes[3] ;
			
			// creo un objeto array de la clase ComarcaCotxes para indicar cada valor de los objetos a introducir
			 // es mejor la insercion de datos en un array
			// se crea el array de objetos a almacenar en el fichero
			
			File cotxes = new File ("e:\\cotxesComarca.txt"); // creo el archivo con la ruta a almacenar
			FileOutputStream salida = new FileOutputStream (cotxes); // flujo de salida al disco con el parámetro del "File" 
			ObjectOutputStream dataCotxe = new ObjectOutputStream (salida); //con el ObjectOutputStream procesamos los datos vinculandora con el FileOutputStream
			FileInputStream entrada = new FileInputStream (cotxes); // con el FileInputStream indicamos el flujo de entrada al disco, con el parámetro del archivo que creamos (File)
			ObjectInputStream lectura = new ObjectInputStream (entrada); // equiparable al ObjectOutputStream, el ObjectInputStream procesa los datos y se han de vincular con el FileIn
			
		/*
			int n;
			System.out.println("cuantos coches desea almacenar?");
			n = teclat.nextInt();
			ComarcaCotxes [] arrayComarcaCotxes; 
			ComarcaCotxes [] arrayComarcaCotxes1 = new ComarcaCotxes[n] ;
			
			for (int i=0; i<n; i++) {
				System.out.println("ingrese la marca: ");
				arrayComarcaCotxes1[i].marca =;
				
				System.out.println("ingrese modelo: ");
				arrayComarcaCotxes1[i].modelo = teclat.next();
				
				System.out.println("ingrese el any: ");
				arrayComarcaCotxes1[i].any = teclat.nextInt();
				
				System.out.println("ingrese la matricula: ");
				arrayComarcaCotxes1[n].matricula = teclat.next();
				
				dataCotxe.writeObject(arrayComarcaCotxes1);
				
				
				
				//ComarcaCotxes.arrayComarcaCotxes(i);
			}
			
				
			/*/
			
			
			String m[] = {"mercedes", "Buick","Rolls","Ferrari","Jaguar","Audi","Porsche","Ford","BMW","Toyota"};
			String mo[] = {"benz","coupe","Royce","L30","Litle Bastard","A7","coupe", "Fordlane","grand legacy","corolla"};
			int a[] = {1980,1956,1924,1963,1967,2019,1956,1927,1974,1986};
			String ma []= {"ETK", "SDDF","WERT","ZORRO","qASY","SJKLF","SDDF","YXCH","DEAN","SPPÜ"}; 
			
			
			
			for (int i=0; i<m.length; i++) {
				arrayComarcaCotxes = new ComarcaCotxes (m[i] + mo[i] + a[i]+ ma[i]);
			}
				
			/*
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
			*/
			
			dataCotxe.writeObject(arrayComarcaCotxes);
			
		
		
			
			dataCotxe.close();
		
		
			
			System.out.println("los coches son: ");
			arrayComarcaCotxes(arrayComarcaCotxes);
			System.out.println(" ");
		
		
		//	try {
				//while (true)
					//arrayComarcaCotxes1 =  ComarcaCotxes dataCotxe.reset();
					//System.out.println(" Cotxe " + ComarcaCotxe.get);
			
		}	
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
 	
	
 		


	