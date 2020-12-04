package m3.uf5Actividad2Tester;

// importacion de la biblioteca de arrays
import java.util.Arrays;

public class ReversiveNumbers{

	// atributos
	private String number;
	private String reversive = " ";
	
	public ReversiveNumbers (String num) {
		
		this.number = num;
		
		//this.reversive = this.number.toCharArray();
		
	}
	
	// método GETTER
	public String getNumber () {
		return this.number;
	}
	
	// método SETTER
	public void setNumber (String num) {
		this.number = num;
	}
	
	public void revierteNumero (String num) {
		
		char x;
		String y = "";
		
		for (int i= num.length()-1; i >= 0; i--) {
			y = y + num.charAt(i);
			
		}
		
		this.reversive = y;
	}
	
	public String getReversive () {
		return this.reversive;
		
	}
 	
	
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
