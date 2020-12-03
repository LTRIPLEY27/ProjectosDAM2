package m3.uf5Actividad1;

public class SumaElements {

	private int suma;
	
	
	// método void para sumar los elementos del array
	public void AdicionElements () {
		
		int [] arrayNumbers = {0,1,2,3};
		
		int x = 0;
		
		for (int i=0; i < arrayNumbers.length; i++) {
			x = x + i;
		}
		
		System.out.println(x);
		
		this.suma = x;
	}
	
	// método return del valor de la suma
	public int dameSuma () {
		return this.suma;	
	}
}
