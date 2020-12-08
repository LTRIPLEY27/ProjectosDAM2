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
		
		for (int i= this.number.length()-1; i >= 0; i--) {
			this.reversive = this.reversive + this.number.charAt(i);	
		}		
	
	}
	
	public String getReversive () {
		return this.reversive;		
	}
	
	/*
	public void setSum () {
		
		char c;
		char b;
		int x;
		int y;
		
		int n;
		
		int sum = 0;
		
		for (int i = 0; i < this.number.length(); i ++ ) {
			for (int j = 0; j < this.reversive.length(); j++ ) {
				c = this.number.charAt(i);
				b = this.reversive.charAt(j);
				x = Character.getNumericValue(c);
				y = Character.getNumericValue(b);
				
				sum = x + y;
				
			}
		}
			if (sum % 2 > 0) {
				System.out.println(" impar");
					this.suma = sum;
			} else {
				System.out.println("par");
					this.suma = sum;
		}

	}
	
	public int getSuma () {
		return this.suma;
	}
 	
 	*/
	
	
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
	
	//método para comprobar si es verificable o no el numero
	
	// hago uso del método String valueOf() para convertir la int suma en String y verificar dígito a díto si es para o no
	public void compruebaNumero () {
					// se hace mencion al String como clase y no a la variable 
		String aux = String.valueOf(this.suma);   // método que conviente en String el valor de un int
		
		//StringBuffer append (this.suma);
		
		}
	


}
