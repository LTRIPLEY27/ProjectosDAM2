package m05EntornosdeDesarrolloActividad2;
import java.io.*;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesterJunit {
	
	private int saldo;
	private boolean creaCuenta;
	
	
	public TesterJunit() {
		
		this.saldo = 0;
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
	public void ingresos(int salde) {
		if (salde < 0) {
			creaCuenta = true;
		}
		
		if (creaCuenta == false) {
			this.saldo = salde + this.saldo;
		} else {
			this.saldo = this.saldo;
		}
	}
	
	public int dameSaldo() {
		return this.saldo;
	}
	

	



	public static void main(String[] args) {
	
	Scanner ask = new Scanner(System.in);	
	
	//TesterJunit ingreso = new TesterJunit();
	
	int salde;
	
	System.out.println("ingrese los valores a ingresar en la cuenta");
	salde = ask.nextInt();
	
	TesterJunit ingreso = new TesterJunit();
	
	//ingreso.iniciCuenta();
	ingreso.ingresos(salde);
	
	//System.out.println(ingreso.iniciCuenta());
	System.out.println("el saldo de la cuenta es " + ingreso.dameSaldo());
	
	
	}
}
	
