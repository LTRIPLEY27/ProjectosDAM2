package m05EntornosdeDesarrolloActividadTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class Operar {

	private double saldo;
	//private double y;
	
	public Operar() {
		this.saldo = 0.0;  // saldo inicial 
	}
	
	public double getSaldoInicial() {  // return del saldo en cero
		return this.saldo;
	}
	
	
	public boolean getSaldoTester(double x) {  // ********metodo anidado a verificar en el saldo a actualizar *********
		if(x < 0) {
			return true;       // boolean que verifica que la cantidad cumpla 3 condiciones: 1) sea numero positivo(x>0). 2) sea menor o igual a 6000. 3) sea un numero de dos decimales 
		} if(x > 6000) {
			return true;
		} if(Math.round(x * 100) != x * 100) { // condicioneal a verificar = si lleva dos decimales comparando con el mismo parametro 
			return true;		
		} 
		return false;  // condicional: no es menor a 0, no es mayor a 6000 y no tiene mas de 2 decimales
	}
	
	public void actualizaSaldo(double x) {   // metodo anidado del getSaldoTester, reduce el codigo a validar las 3 condiciones esenciales
		if(getSaldoTester(x) != true) {
			this.saldo += x;
		}
	}
	
	public double getActualizaSaldo() {
		return this.saldo;
	}
	
	//////////////////////// RETIRO ////////////////////
	
	public boolean setSaldoTesterRetiro(double x) {
		if(x > this.saldo) {       // x es menor al saldo
			return true;
		} if(x < 0) {
			return true;   // x es mayor a cero o numero positivo
		} if(Math.round(x * 100) != x * 100) {   // x debe de tener 2 decimales
			return true;
		} if(x > 6000) {   // x debe de ser menos a 6000
			return true;
		}
		
		return false;
	}
	
	public void setActualizaSaldoRetirada(double x) {
		if(setSaldoTesterRetiro(x) == false) {
			this.saldo -= x;   // resta x a saldo
		}
	}
	
	public boolean setTransfiereEntreCuentas(double x, double y, double z) {
		
		int count = 0;
		
		
		if(y > x) {
			return true;
		} if((y < 0) || (x < 0) || (z < 0)) {
			count++;
			return true;
		} if((Math.round(y * 100) != y * 100) || (Math.round(y * 100) != y * 100) || ((Math.round(z * 100) != z * 100))) {	
			return true;
		} if(count > 0) {
			z += z;
			return true;
		} if(z > 3000) {
			return true;
		} 
		
		return false;
	}
	
	
	public void setActualizaTransferenciaSaldo(double x, double y, double z) {
		
		if(setTransfiereEntreCuentas(x, y, z) == false) {
			this.saldo = y + z;
		}
	}
	
	
	public void setPrueba(Operar cuenta, double z) {	
	
		cuenta.setActualizaSaldoRetirada(z);;		 // llamado al metodo para que reconozca el saldo de la cuenta 1
	}
	
	public double getPreba1() {
		return this.saldo;
	}
	
}

