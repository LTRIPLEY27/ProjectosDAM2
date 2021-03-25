package m05Refactoring;

import m05EntornosdeDesarrolloActividadTest.Operar;

/**
 * 
 * @author Isabel Calzadilla;
 * @see Cuenta1Test;
 * 
 *
 */

public class Cuenta1 {
	private int  amount;  // condicional dispuesto en el enunciado
	
	public Cuenta1() {
		this.amount = 0;  // saldo inicial 
	}
	
	public int getSaldoInicial() {  // return del saldo en cero
		return this.amount;
	}
	
	/**
	 * Primer metodo que recibe el valor para actualizar y verificar cada una de las condiciones implicitas en el enunciado
	 * al ser un if anidado con valor boolean verificara cada condicion para saber si el parametro es aceptable y proceder a actualizar el saldo, caso contrario lo obviara
	 * @param x el parametro que se recibe en la clase tester para actualizar el saldo
	 * @return retorno del valor con el parametro actualizado
	 */
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
	
	/**
	 * Recoge el valor retornado en el boolean anterior y de ser true no se actualiza el saldo
	 * caso contrario actualiza el saldo la cantidad indicada en el parametro
	 * @param x
	 */
	public void actualizaSaldo(int x) {   // metodo anidado del getSaldoTester, reduce el codigo a validar las 3 condiciones esenciales
		if(getSaldoTester(x) != true) {
			this.amount += x;
		}
	}
	
	/**
	 * Metodo que recoge el valor luego de verificadas las condiciones 
	 * @return
	 */
	public int getActualizaSaldo() {
		return this.amount;
	}
	
	//////////////////////// RETIRO ////////////////////
	
	/**
	 * Boolean que condiciona el parametro a indicar para verificar si aplica o no al metodo de retiro
	 * si los condicionales arrojan el valor de "false" el condicional es aplicable en el metodo y se procedera a restar el saldo
	 * @param x  valor a verificar y actualizar
	 * @return valor boolean, si es true no es valido y por ende se rompera el ciclo y no se procedera a restar el saldo, si es false se procedera a restar el saldo
	 */
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
	
	/**
	 * Recibe la verificacion del boolean y actualiza o no el saldo segun aplique (true or false)
	 * @param x
	 */
	public void setActualizaSaldoRetirada(int x) {
		if(setSaldoTesterRetiro(x) == false) {
			this.amount -= x;   // resta x a saldo
		}
	}
	
	/**
	 * Metodo boolean que verifica multiples valores de multiples objetos y retorna la respuesta a aplicar o no en el saldo a actualizar
	 * al ser un boolean que recibe multiples parametros de distintos objetos, verifica las mismas condiciones en cada uno.
	 * @param x el  valor que le indicamos del objeto cuenta primaria
	 * @param y el valor que le indicamos a la cuenta secundaria
	 * @param z el valor que le adicionamos o restamos (segun aplique) a cada cuenta.
	 * @return ejecuta los condicionales para cada valor y en caso de ser false actualiza los saldos de cada objeto
	 */
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
	
	/**
	 * actualiza segun los condicionales del boolean los valores en las cuentas
	 * @param x
	 * @param y
	 * @param z
	 */
	public void setActualizaTransferenciaSaldo(int x, int y, int z) {
		
		if(setTransfiereEntreCuentas(x, y, z) == false) {
			this.amount = y + z;
		}
	}
	
	/*
	public int retornaTransfer(Cuenta1 cuenta2, int z) {
		
		int aux = 0;
		if(sumaCantidad(z) == true) {
			aux = cuenta2.getActualizaSaldo() + z; 
			if(aux > 3000) {
				this.amount = cuenta2.getActualizaSaldo();
			} else {
				this.amount = cuenta2.getActualizaSaldo() + z;
			}
			
		}
		return this.amount;
		
	}
	*/
	
	/**
	 * Ejecuta el metodo "setActualizaSaldoRetirada" al objeto de tipo cuenta indicado
	 * le indicamos como parametro el objeto tipo cuenta
	 * @param cuenta el objeto a actualizar segun el metodo 
	 * @param z parametro que ha de actulizar.
	 */
	public void setPrueba(Cuenta1 cuenta, int z) {	
		cuenta.setActualizaSaldoRetirada(z);	 // llamado al metodo para que reconozca el saldo de la cuenta 1
	}
	
	/**
	 * Retorno del metodo void "setPrueba" que devuelve la actualizacion del saldo
	 * @return
	 */
	public int getPreba1() {
		return this.amount;
	}
	
	public boolean sumaCantidad(int z) {
		int count = 0;
		
		if(z < 3000) {
			count++;
			return true;
		} if(count >= 1) {   
			return true;
		} 
		
		
	return false;
	
	}
}
