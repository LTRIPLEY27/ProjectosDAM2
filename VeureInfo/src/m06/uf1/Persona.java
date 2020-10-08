package m06.uf1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Persona {
	
	public static void main(String[] args) throws IOException {
		Scanner teclat = new Scanner (System.in);
		File fichero = new File ("e:\\ramdomfitxer"); // se puede crear un fichero sin definicion especifica
		
		// la clase RandomAccessFile funciona para acceder a un fichero de forma aleatoria
		RandomAccessFile ficheroaleatorio = new RandomAccessFile (fichero, "rw"); // para el constructor clase Random se ha de necesitar 2 paramétros (la ruta y el modo de acceso: "r" (solo lectura) y "rw" modo lectura y escritura)
		int p;
		
		System.out.println(" cuántas personas desea almacenar ");
		p = teclat.nextInt();
		String [] nombre;
		String [] apellido;
		int [] dni;
		int [] telefono;
		String [] direccion;
		
		nombre = new String [p];
		apellido = new String [p];
		dni = new int [p];
		telefono = new int [p];
		direccion = new String [p];
		
		StringBuffer buffer = null; // se debe declarar la memoria que ocupará
		
		for (int i=0; i<p; i++) {
			System.out.println(" ingrese el nombre: ");
			nombre[i] = teclat.next(); // la indicacion de la posicion equivale a 4 bytes
			ficheroaleatorio.writeInt(i+1); // se le indica que habrá de ocupar el primer lugar del array
			buffer = new StringBuffer (nombre[i]); // almacena en la memorioa el nombre
			buffer.setLength(20);  // se debe de definir los bytes a ocupar para futura accion del apuntador !!IMPORTANTE!!
			ficheroaleatorio.writeChars(buffer.toString()); // construye en la memoria los chars a String
			// 20 caracteres * 2 bytes = 40
			
			System.out.println(" ingrese el apellido: ");
			apellido[i] = teclat.next();
			buffer = new StringBuffer (apellido[i]);
			buffer.setLength(20); // 40 bytes
			ficheroaleatorio.writeChars(buffer.toString());
		
			System.out.println(" ingrese el dni: ");
			dni[i] = teclat.nextInt(); //4 bytes
			ficheroaleatorio.writeInt(dni[i]);
		
			System.out.println(" ingrese el telefono: ");
			telefono[i] = teclat.nextInt();
			ficheroaleatorio.writeInt(telefono[i]); // 1 integer ocupa 4 bytes
		
			System.out.println(" ingrese la direccion : ");
			direccion[i] = teclat.next();
			buffer = new StringBuffer (direccion[i]);
			buffer.setLength(20); //20*2 = 40 bytes
			ficheroaleatorio.writeChars(buffer.toString()); // 132 bytes
	}
		ficheroaleatorio.close();
		
		RandomAccessFile ficheroaleatorio1 = new RandomAccessFile (fichero, "r"); // le indicamos el parametro "r" para leer
		
		int apuntador = 0, dni1, telefono1;
		char nombre1 [] = new char [20], apellido1 [] = new char [20], direccion1 [] = new char [20];

		for (;;) {
			ficheroaleatorio.seek(apuntador);
			// se podría indicar directamente el paámetro a consultar y comparar con el fichero en el apuntador
			dni1 = ficheroaleatorio.readInt();
			
			for (int i= 0; i<p; i++) {
				
			}
		}
		
		/*Exercici 3 No-Aval

Exercici 3

A partir dels programes:

    EscriuFitxerAleatori
    LleguirFitxerAleatori
    ConsultarFitxerAleatori

Fer un programa de Fitxes de Persones (4 o 5 camps), que faci les operacions:

    Guardar Fitxa de Persona a un fitxer (s'han d'introduir els camps per pantalla)
    Llegir un fitxer sencer (totes les Fitxa de Persona i mostrar-les per pantalla)
    Consultar mitjançant índex (posició) una Fitxa de Persona concreta.
    NO DUAL, cercar persones segons un camp.

S'ha d'entregar PDF amb el següent contingut:

    Enllaç al repositori al núvol.
    Els fonts remarcant-ne el que s'ha modificat respecte dels codis d'exemple subministrats.
    Bolcats de pantalla amb DIFERENTS execucions (no només una) del programa.
	}*/

		
}
}