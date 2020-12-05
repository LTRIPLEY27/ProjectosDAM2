package m3.uf5Actividad2Tester;

// importacion de la biblioteca de arrays
import java.util.Arrays;

public class ReversiveNumbers{

	// atributos
	private String number;
	private String reversive = "";
	private int suma;
	
	public ReversiveNumbers (String num) {
		
		this.number = num;
		
		this.number.toCharArray();
		
	}
	
	// método GETTER
	public String getNumber () {
		return this.number;
	}
	
	// método SETTER
	public void setNumber (String num) {
		this.number = num;
	}
	
	
	// método para revertir el número
	public void revierteNumero () {
		
		
		String y = "";
		
		for (int i= this.number.length()-1; i >= 0; i--) {
			y = y + this.number.charAt(i);	
		}		
		this.reversive = y;
		this.reversive.toCharArray();
	}
	
	public String getReversive () {
		return this.reversive;
		
	}
 	
	public void convertReversive () {
		
		int x = 0;
		
		for (int i = 0; i < this.reversive.length(); i++) {
			x = this.reversive.charAt(i);
		}
		
		System.out.println(x);
	}
	/*public void sumaNumero() {
		
		char a;
		char b;
		int x =0;
		int y = 0;
		for (int i = 0; i < this.number.length(); i++) {
			
			
			//this.suma[i] = this.number[i] + this.reversive[i];	
			x = this.number.charAt(i);
			//x = Character.getNumericValue(a);
			
			y = this.reversive.charAt(i);
			//y = Character.getNumericValue(b);
			
			this.suma = x + y;
			
			System.out.println("la suma es " + this.suma);
		}
	}
	
	public int getSuma () {
		return this.suma;
		
	}*/
	
	
	//método para comrpbar si es verificable o no el numero
	/*public void compruebaNumero () {
		
		boolean reversible = false;
		boolean sumaImpar = false;
		int x = 0;
		
		//x = this.number + this.number;
		
		if (x/2 !=0 ) {
			sumaImpar = true;
		}
		if ()
		
	}*/
	
	
}
