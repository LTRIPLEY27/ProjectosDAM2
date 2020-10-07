package m06.uf1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComarcaCotxes implements java.io.Serializable{ // la interfaz "seriarizable" indica que la clase hara uso de flujos de entrada y salida
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String marca;  // los atributos se han de definir en la clase al momento siguiente
	private String modelo; // modelo de cada objeto cotxe
	private int any;
	private int matricula;
	private String datosCotxes;

	//public static void main(String[] args) {
	/*Exercici 2 bis

Fes un programa que agafant com a model Comarca, EscriureFitxerObject i LlegirFitxerObject:

    Es creen objectes tipus Cotxes: marca, model, any i matricula.
    Pugui guardar i recuperar objectes tipus Cotxe com un bloc.
    Pugui guardar objectes tipus Cotxe d'un en un.
    Pugui recuperar objectes tipus Cotxe segons un camp.

S'ha d'entregar PDF amb el següent contingut:

    Enllaç al repositori al núvol.
    Els fonts remarcant-ne el que s'ha modificat respecte dels codis d'exemple subministrats.
    Bolcats de pantalla amb DIFERENTS execucions (no només una) del programa.
	 * 
	 */

				
		// primer constructor de la clase coches
						// definicion de los parametros a utilizar en el constructor, definidos en los atributos
	public ComarcaCotxes (String marca, String modelo, int any, int matricula) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.any = any;
		this.matricula = matricula;
		this.datosCotxes = datosCotxes;
	
	//public ComarcaCotxes(String marca2, String modelo2, String string, String string2) {
		// TODO Auto-generated constructor stub
	//}
	}
	
	 public String getMarca() { // método para obtener el valor de un atributo
			return this.marca;
			}
	//public void setNombre (String marca) {
		//this.marca = marca; // método set (indica la modificacion potencial de un atributo)
	//}
		
	public String getModelo() {
			return this.modelo;
	}
	//public void setModelo (String modelo) { // es imperativo declarar el parametroa modificar dentro del método para que compile
		//this.modelo = modelo;
	//}
	
	public int getAny() {
		return this.any;
	}
	//public void setAny( int any) {
		//this.any = any;
	//}
	
	public int getMatricula() {
		return this.matricula;
	}
	//public void setMatricula (int matricula) {
		//this.matricula = matricula;
	//}
	
	public String getDatosCotxes () {
		return this.getMarca() + " " + this.getModelo() + " " + this.getAny() + " " + this.getMatricula();
		
	}
	


 	//File cotxes = new File ("myData.txt");
 	Scanner sc= new Scanner ( System.in );
	
 	
 	String marca1 = sc.nextLine();
 	
 	System.out.println("marca: "+ marca1);
 		
	

}
 	
	/*public Constructor () {
		File cotxes = new File ("cotxescomarca.txt");
		Scanner scan = new Scanner ( cotxes );
		
		close()
	}*/
	
	/*
	String cotxesFichero = "e:\\Objetos.dat"; {
	try {
		FileOutputStream ficheroExit = new FileOutputStream(cotxesFichero);
		ObjectOutputStream objetoExit = new ObjectOutputStream(ficheroExit);
		objetoExit.writeObject(new ComarcaCotxes ("ford" , "focus", "2016", "56879"));
		objetoExit.close();
	} catch (FileNotFoundException e) {
		System.out.println("no encontrado ");
	}  catch (IOException e) {
		System.out.println(e.getMessage());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	};

	try {
		FileInputStream ficheroIn = new FileInputStream (cotxesFichero);
		ObjectInputStream objetoIn = new ObjectInputStream (ficheroIn);
		
		ComarcaCotxes c1 = (ComarcaCotxes) objetoIn.readObject();
		
		objetoIn.close();
		
		System.out.println("Marca");
		System.out.println(c1.getMarca());
	}
		catch (FileNotFoundException e) {
			System.out.println(" el fichero no existe ");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		};*/
}


