package m09.uf1;

import java.util.Scanner;

public class CifradoCesarActividad01 {

	static void 
	public static void main(String[] args) {
/*
 * Activitat 1

Has de codificar un programa que permeti codificar missatges de text tal i com ho feia Juli Cesar, i un segon programa que us ha de permetre descodificar-los.

En concret, cada programa ha de demanar un nombre (que serà el desplaçament que aplicarà l’algoritme) i el text que es vulgui codificar o descodificar.

Per reduir la complexitat de tots dos algoritmes, aquests només poden xifrar/desxifrar lletres de l’alfabet en minúscula (del caràcter “a” fins al “z” i l’espai en blanc
 que va en ordre darrere la “z”). No contempleu nombres ni vocals accentuades ni els caràcters “ç” i “ñ”.

Cada programa ha de mostrar el text codificat (el primer programa) i el text descodificat (en el cas del segon programa).


AMPLIACIÓ (Obligat per als noDuals).
Feu un tercer programa que descodifiqui entrades utilitzant la «força bruta». El programa només permetrà introduir un text, que teòricament està codificat, i ha de mostrar tots els
 possibles resultats de descodificar-lo amb tots els possibles desplaçaments.
 */
		Scanner teclat = new Scanner (System.in);
		
		int numero;
		String [] alfabeto;
		
		System.out.println("ingrese la letra a cifrar  ");
		numero = teclat.nextInt();
		
		
		
		alfabeto [] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y","z"} ;
		//llenadoMatriz
		
	}

}
