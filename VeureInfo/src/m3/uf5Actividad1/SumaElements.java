package m3.uf5Actividad1;

import java.util.Arrays;
public class SumaElements {

	private int suma;
	
	
	// m�todo void para sumar los elementos del array
	public void AdicionElements () {
		
		int [] arrayNumbers = {0,1,2,3};
		
		int x = 0;
		
	for (int i=0; i < arrayNumbers.length; i++) {
			x = x + i;
		}
		this.suma = x;
	}
	
	// m�todo return del valor de la suma
	public int dameSuma () {
		return this.suma;	
	}
}
