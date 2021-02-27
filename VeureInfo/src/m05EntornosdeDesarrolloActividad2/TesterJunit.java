package m05EntornosdeDesarrolloActividad2;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesterJunit {
	
	private double saldo;
	private boolean creaCuenta;
	private char counterDecimals;
	private double aux;
	
	public TesterJunit() {
		
		this.saldo = 0.0;
	}
	
	/*public boolean iniciCuenta() {
		
		Scanner ask = new Scanner(System.in);
		respuesta = false;
		char opcion;
		while (respuesta == true) {
		
			System.out.println("desea crear una cuenta, indique con un 'y' para si o 'n' para no");
			opcion = ask.next().charAt(0);
			respuesta = true;
				if (opcion == 'y' || opcion == 'Y') {
					this.saldo = 0;
					System.out.println("el saldo de la cuenta es : " + this.saldo);
				} else {
					System.out.println("gracias por visitarnos ");
					//respuesta = true;
				}
		}
		return creaCuenta;
	}
	*/
	public void ingresos(double salde) {     // verifica saldo positivo
		if(salde > 0) {
			this.saldo = salde + this.saldo;
		} else {
			this.saldo = this.saldo;
		}
	}
	
	public void saldoNegativo(double salde) {
		if(salde < 0) {
			creaCuenta = true;
		} else {
			creaCuenta = false;
		}
	}
	
	public boolean getSaldoNegativo() {
		return creaCuenta;
	}
	
	//public void validaDecimal(double salde) {  //contador de decimales
	
		//this.counterDecimals = String.valueOf(salde);
	
		//if (this.counterDecimals.lastIndexOf(this.counterDecimals.charAt(0)).)
		
	//}
	
	public void setDecimalFormat(double salde) {
		this.saldo = Math.round(salde * 100) / 100d; 
	}
	
	public double getDecimalFormta() {
		return this.saldo;
	}
	public double dameSaldo() {
		return this.saldo;
	}
	
	public void verificaDosDecimales(double salde) {
		String x = String.valueOf(salde);
		char y;
		y = (char) (x.length()-2);
		this.counterDecimals = y;
	}
	
	public char getVerifica() {
		return this.counterDecimals;
	}


	public static void main(String[] args) {
	
	Scanner ask = new Scanner(System.in);	
	
	//TesterJunit ingreso = new TesterJunit();
	
	double salde;
	
	System.out.println("ingrese los valores a ingresar en la cuenta");
	salde = ask.nextDouble();
	
	TesterJunit ingreso = new TesterJunit();
	
	//ingreso.iniciCuenta();
	ingreso.ingresos(salde);
	
	//System.out.println(ingreso.iniciCuenta());
	System.out.println("el saldo de la cuenta es " + ingreso.dameSaldo());
	
	ingreso.saldoNegativo(salde);
	System.out.print(ingreso.getSaldoNegativo());

	ingreso.setDecimalFormat(salde);
	System.out.println("aca es dos decimales" + ingreso.getDecimalFormta());
	
	ingreso.verificaDosDecimales(salde);
	
	System.out.println(ingreso.counterDecimals);
	}
	

}
	
