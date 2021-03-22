package m05Refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import m05EntornosdeDesarrolloActividadTest.Operar;

class Cuenta1Test {

	static Cuenta1 cuenta;   // lo inmediato es llamar al objeto de la clase a probar

	@Test
	public void testOperar() {
		Operar cuenta = new Operar();
		assertEquals(0, cuenta.getSaldoInicial());	
	}

	@Test  // verifica si sumas 100 al saldo lo acepta
	void testProvaSaldo100() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(100);;
		assertEquals(100, cuenta.getActualizaSaldo());
	}
	
	@Test  // verifica saldo a 3000
	void testProvaSaldo3000() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(3000);
		assertEquals(3000, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testProvasaldo3100() { // verifica saldo a 3100
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(100);
		//cuenta.actualizaSaldo(2000);
		//cuenta.actualizaSaldo(600);
		cuenta.actualizaSaldo(3000); // el valor del double x se puede ingresar multiples veces en el mismo metodo
		assertEquals(3100, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testNegativoesCero() {   // metodo para verificar el saldo negativo
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(-100);
		assertEquals(0, cuenta.getActualizaSaldo());
	}
	
	
	@Test // test condicional de maxima cantidad
	void testCantidadMaximaAingresar6000() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(6000);
		assertEquals(6000, cuenta.getActualizaSaldo());
	}
	
	@Test // test condicional de maxima cantidad
	void testCantidadMaximaAingresar() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(6001);
		assertEquals(0, cuenta.getActualizaSaldo());
	}
///////////////////////////RETIRO///////////////////////////

	@Test 
	void testInicioRetiradas() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(500);
		cuenta.setActualizaSaldoRetirada(100);
		assertEquals(400, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroMayorqueSaldo200() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(200);
		cuenta.setActualizaSaldoRetirada(500);
		assertEquals(200, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroCantidadNegativa() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(500);
		cuenta.setActualizaSaldoRetirada(-100);
		assertEquals(500, cuenta.getActualizaSaldo());
	}
	
	
	@Test
	void testRetiroMaximoenCuentade6000() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(4000);   // por el condicionamiento de ser menor a 6000 el ingreso debo de dividir el saldo de 7000 en 2 para que cumpla la condicion 
		cuenta.actualizaSaldo(3000);
		cuenta.setActualizaSaldoRetirada(6000);
		assertEquals(1000, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroMaximoenCuenta() {
		Cuenta1 cuenta = new Cuenta1();
		cuenta.actualizaSaldo(4000);   // por el condicionamiento de ser menor a 6000 el ingreso debo de dividir el saldo de 7000 en 2 para que cumpla la condicion 
		cuenta.actualizaSaldo(3000);
		cuenta.setActualizaSaldoRetirada(6001);
		assertEquals(7000, cuenta.getActualizaSaldo());
	}
	
	////////////////////// TRANSFERENCIAS ENTRE CUENTAS //////////////////////////////////////
	
	@Test // transferenca entre cuentas y nueva cuenta secundaria
	void testTransferenciaEntreCuentas() {
		Cuenta1 cuenta = new Cuenta1();
		Cuenta1 cuenta2 = new Cuenta1();
		cuenta.actualizaSaldo(500);
		cuenta2.actualizaSaldo(50);
		cuenta.setPrueba(cuenta, 100);
		assertEquals(400, cuenta.getPreba1());  // primera cuenta se le resta 100 y han de quedar 400
		cuenta2.setActualizaTransferenciaSaldo(500, 50, 100);
		assertEquals(150, cuenta2.getActualizaSaldo()); //segunda cuenta ha de disponer de 150 de saldo
	}
	
	@Test   // transferencias condicionadas al saldo, negativo o no y disponibilidad del mismo
	void testTransferenciaSaldosNegativos() {
		Cuenta1 cuenta = new Cuenta1();
		Cuenta1 cuenta2 = new Cuenta1();
		cuenta.actualizaSaldo(500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(500, 50, -100);
		cuenta2.setActualizaTransferenciaSaldo(500, 50, -100);;
		assertEquals(500, cuenta.getActualizaSaldo());
		assertEquals(50, cuenta2.getActualizaSaldo());
	}
	
	@Test // transferencia limite diario
	void  testTransferenciaLimites() {
		Cuenta1 cuenta = new Cuenta1();;
		Cuenta1 cuenta2 = new Cuenta1();
		cuenta.actualizaSaldo(3500);
		cuenta2.actualizaSaldo(50);
		cuenta.setPrueba(cuenta, 3000);  // se han de llamar los metodos exclusivos para cada caso a aplicar en las cuentas
		assertEquals(500, cuenta.getPreba1());
		cuenta2.setActualizaTransferenciaSaldo(3500, 3000, 50);
		assertEquals(3050, cuenta2.getActualizaSaldo());
	}
	
	@Test
	void testLimiteMaximoTransferenciasinDecimales() {
		Cuenta1 cuenta = new Cuenta1();
		Cuenta1 cuenta2 = new Cuenta1();
		cuenta.actualizaSaldo(3500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(3500, 50, 3001);
		assertEquals(3500, cuenta.getActualizaSaldo());
		cuenta2.setActualizaTransferenciaSaldo(3500, 50, 3001);
		assertEquals(50, cuenta2.getActualizaSaldo());
	}
	
	@Test
	void testLimiteMaximoVariasTransferencias() {
		Cuenta1 cuenta = new Cuenta1();
		Cuenta1 cuenta2 = new Cuenta1();
		cuenta.actualizaSaldo(3500);
		cuenta2.actualizaSaldo(50);
		cuenta2.setActualizaTransferenciaSaldo(3500, 50, 2000);
		assertEquals(2050, cuenta2.getActualizaSaldo());
		cuenta.setPrueba(cuenta, 2000);  // se pasa como parametro el objeto cuenta de la clase Operar para poder hacer uso de los metodos
		assertEquals(1500, cuenta.getPreba1());
		cuenta.setActualizaTransferenciaSaldo(3500, 50, 1200);
		assertEquals(2050, cuenta2.getActualizaSaldo());
		
		cuenta2.setActualizaTransferenciaSaldo(3500, 50, 1800);
		assertEquals(1850, cuenta2.getActualizaSaldo());
	}
	

}
