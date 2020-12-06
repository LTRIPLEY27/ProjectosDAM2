package m3.uf5Actividad2Tester;

// importacion de la biblioteca de arrays
import java.util.Arrays;

public class ReversiveNumbers{

	// atributos
	private String number;
	private String reversive = "";
	private int suma;
	//private char [] ver;
	
	public ReversiveNumbers (String num) {
		
		this.number = num;
		
		//this.number.toCharArray();
		
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
		//String y = "";
		
		for (int i= this.number.length()-1; i >= 0; i--) {
			this.reversive = this.reversive + this.number.charAt(i);	
		}		
		//this.reversive = y;
		//this.reversive.toCharArray();
	}
	
	public String getReversive () {
		return this.reversive;
		
	}
 	
	// método para convertir los Strings en integers mediante la clase parseInt
	//PREGUNTAR SI APLICA DE ESTA MANERA O SEPARANDO CARACTER A CARÁCTER
	public void convertReversive () {
		
		int x = Integer.parseInt(this.number);
		int y = Integer.parseInt(this.reversive);
		
		this.suma = x + y;
		
	}
	
	public int getSuma () {
		return this.suma;
		
	}
	
	public void setVerfi() {
		
		char 
		//this.ver = (char[])this.suma;
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
	
	
	//método para comprobar si es verificable o no el numero
	public void compruebaNumero () {
		
		boolean reversible = false;
		boolean sumaImpar = false;
		int x = 0;
		
		if (this.suma / 2 != 0) {
			sumaImpar = true;
		}
	
}
