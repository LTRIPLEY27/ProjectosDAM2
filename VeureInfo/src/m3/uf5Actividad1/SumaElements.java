package m3.uf5Actividad1;

import java.util.Arrays;
public class SumaElements {

	// declaramos la suma como atributo del objeto e iniciamos en 0
	private int suma = 0;
	
	
	// método void para sumar los elementos del array
	public void AdicionElements () {
		
		int [] arrayNumbers = {0,1,2,3};
		
	for (int i=0; i < arrayNumbers.length; i++) {
			this.suma = this.suma + i;
		}
	}
	
	// método return del valor de la suma
	public int dameSuma () {
		return this.suma;	
	}
}
