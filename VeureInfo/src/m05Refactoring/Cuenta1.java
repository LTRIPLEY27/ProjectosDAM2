package m05Refactoring;

import m05EntornosdeDesarrolloActividadTest.Operar;

public class Cuenta1 {
	private int  amount;  // condicional dispuesto en el enunciado
	
	public Cuenta1() {
		this.amount = 0;  // saldo inicial 
	}
	
	public int getSaldoInicial() {  // return del saldo en cero
		return this.amount;
	}
	
	
	public boolean getSaldoTester(int x) {  // ********metodo anidado a verificar en el saldo a actualizar *********
		if(x < 0) {
			return true;       // boolean que verifica que la cantidad cumpla 3 condiciones: 1) sea numero positivo(x>0). 2) sea menor o igual a 6000. 3) sea un numero de dos decimales 
		} if(x > 6000) {
			return true;
		} if(Math.round(x * 100) != x * 100) { // condicioneal a verificar = si lleva dos decimales comparando con el mismo parametro 
			return true;		
		} 
		return false;  // condicional: no es menor a 0, no es mayor a 6000 y no tiene mas de 2 decimales
	}
	
	public void actualizaSaldo(int x) {   // metodo anidado del getSaldoTester, reduce el codigo a validar las 3 condiciones esenciales
		if(getSaldoTester(x) != true) {
			this.amount += x;
		}
	}
	
	public int getActualizaSaldo() {
		return this.amount;
	}
	
	//////////////////////// RETIRO ////////////////////
	
	public boolean setSaldoTesterRetiro(int x) {
		if(x > this.amount) {       // x es menor al saldo
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
	
	public void setActualizaSaldoRetirada(int x) {
		if(setSaldoTesterRetiro(x) == false) {
			this.amount -= x;   // resta x a saldo
		}
	}
	
	public boolean setTransfiereEntreCuentas(int x, int y, int z) {
		
		if(y > x) {
			return true;
		} if((y < 0) || (x < 0) || (z < 0)) {
			//count++;
			return true;
		} if((Math.round(y * 100) != y * 100) || (Math.round(y * 100) != y * 100) || ((Math.round(z * 100) != z * 100))) {	
			return true;
		//} if(count > 0) {
			//z += z;
			//return true;
		} if(z > 3000) {
			return true;
		} 
		
		return false;
	}
	
	
	public void setActualizaTransferenciaSaldo(int x, int y, int z) {
		
		if(setTransfiereEntreCuentas(x, y, z) == false) {
			this.amount = y + z;
		}
	}
	
	
	
	public void setPrueba(Cuenta1 cuenta, int z) {	
	
		cuenta.setActualizaSaldoRetirada(z);	 // llamado al metodo para que reconozca el saldo de la cuenta 1
	}
	
	public int getPreba1() {
		return this.amount;
	}
	
	public boolean sumaCantidad(int z) {
		int count = 0;
		
		if(z < 3000) {
			count++;
			return true;
		} if(count > 1) {   // no debe de llevar deimales ya que es 
			z += z;
			return true;
		} if(z <= 3000) {
			return true;
		}
		
	return false;
	
	}
}
