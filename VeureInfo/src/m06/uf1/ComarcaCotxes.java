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
		// TODO Auto-generated constructor stub
	

//implements java.io.Serializable//
							// la interfaz "seriarizable" indica que la clase hara uso de flujos de ent0rada y salida
	
	public static void main(String[] args) throws IOException {	

	Scanner teclat = new Scanner (System.in);
	
	ComarcaCotxes cotxe;

	File cotxes = new File ("e:\\cotxesComarca.txt");
	FileOutputStream salida = new FileOutputStream (cotxes);
	
	ObjectOutputStream imprime = new ObjectOutputStream(salida);
	//DataOutputStream imprime = new DataOutputStream (salida);
 	//FileWriter cotxes1 = new FileWriter ("cotxes");
 	//PrintWriter cotxes2 =  new PrintWriter ("cotxes");
 	int n;
 	//String [] cotxe;
 	String [] marca;
 	String [] modelo;
 	int [] any;
 	String  [] matricula;
 	
 	System.out.println("Cuántos coches desea almacenar?");
 	n= teclat.nextInt();
 	
 	//cotxe = new String [n];
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
 		
 		
 		
 		//cotxe = new ComarcaCotxes (marca[i], modelo[i]); 
 		
 		imprime.writeUTF(marca[i]);
 		
 		imprime.writeUTF(modelo[i]);
 		imprime.writeInt(any[i]);
 		imprime.writeUTF(matricula[i]);
 		
 	}
 	
 	imprime.close();
 	
 	
	
 		}
}

	