package m05EntornosdeDesarrolloActividadTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
/*
 * Maria Isabel Calzadilla
 * UF2 M05
 * Test TDD
 */
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperarTest {
	
	static Operar cuenta;   // lo inmediato es llamar al objeto de la clase a probar

	@Test
	public void testOperar() {
		Operar cuenta = new Operar();
		assertEquals(0, cuenta.getSaldoInicial());	
	}

	@Test  // verifica si sumas 100 al saldo lo acepta
	void testProvaSaldo100() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(100);;
		assertEquals(100, cuenta.getActualizaSaldo());
	}
	
	@Test  // verifica saldo a 3000
	void testProvaSaldo3000() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(3000);
		assertEquals(3000, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testProvasaldo3100() { // verifica saldo a 3100
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(100);
		//cuenta.actualizaSaldo(2000);
		//cuenta.actualizaSaldo(600);
		cuenta.actualizaSaldo(3000); // el valor del double x se puede ingresar multiples veces en el mismo metodo
		assertEquals(3100, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testNegativoesCero() {   // metodo para verificar el saldo negativo
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(-100);
		assertEquals(0, cuenta.getActualizaSaldo());
	}
	
	@Test  // el test equipara por aproximacion los valores
	void testCuentaDecimales() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(234.89);
		assertEquals(234.89, cuenta.getActualizaSaldo());	
	}
	
	@Test // test condicional de maxima cantidad
	void testCantidadMaximaAingresar() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(6000);
		assertEquals(6000.00, cuenta.getActualizaSaldo());
	}
///////////////////////////RETIRO///////////////////////////

	@Test 
	void testInicioRetiradas() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(500);
		cuenta.setActualizaSaldoRetirada(100);;
		assertEquals(400, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroMayorqueSaldo() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(200);
		cuenta.setActualizaSaldoRetirada(500);
		assertEquals(200, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroCantidadNegativa() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(500);
		cuenta.setActualizaSaldoRetirada(-100);
		assertEquals(500, cuenta.getActualizaSaldo());
	}
	
	@Test ///////////////////////////////CHECK
	void testRetiroMaximoDosDecimales() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(500);
		cuenta.setActualizaSaldoRetirada(100.45);
		assertEquals(399.55, cuenta.getActualizaSaldo());
	}
	
	@Test
	void testRetiroMaximoenCuenta() {
		Operar cuenta = new Operar();
		cuenta.actualizaSaldo(4000);   // por el condicionamiento de ser menor a 6000 el ingreso debo de dividir el saldo de 7000 en 2 para que cumpla la condicion 
		cuenta.actualizaSaldo(3000);
		cuenta.setActualizaSaldoRetirada(6000);
		assertEquals(1000, cuenta.getActualizaSaldo());
	}
	
	////////////////////// TRANSFERENCIAS ENTRE CUENTAS //////////////////////////////////////
	
	@Test // transferenca entre cuentas y nueva cuenta secundaria
	void testTransferenciaEntreCuentas() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
		cuenta.actualizaSaldo(500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(500, 50, 100);
		cuenta2.setActualizaTransferenciaSaldo(500, 50, 100);
		//assertEquals(400, cuenta.getActualizaSaldo());
		assertEquals(150, cuenta2.getActualizaSaldo());
	}
	
	@Test   // transferencias condicionadas al saldo, negativo o no y disponibilidad del mismo
	void testTransferenciaSaldosNegativos() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
		cuenta.actualizaSaldo(500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(500, 50, -100);
		cuenta2.setActualizaTransferenciaSaldo(500, 50, -100);;
		assertEquals(500, cuenta.getActualizaSaldo());
		assertEquals(50, cuenta2.getActualizaSaldo());
	}
	
	@Test // transferencia limite diario
	void  testTransferenciaLimites() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
		cuenta.actualizaSaldo(3500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(3500, 50, 3000);
		//assertEquals(500, cuenta.getActualizaSaldo());
		cuenta2.setActualizaTransferenciaSaldo(3500, 3000, 50);
		assertEquals(3050, cuenta2.getActualizaSaldo());
	}
	
	@Test
	void testLimiteMaximoTransferenciasinDecimales() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
		cuenta.actualizaSaldo(3500);
		cuenta2.actualizaSaldo(50);
		cuenta.setActualizaTransferenciaSaldo(3500, 50, 3000.01);
		assertEquals(3500, cuenta.getActualizaSaldo());
		cuenta2.setActualizaTransferenciaSaldo(3500, 50, 3000.01);
		assertEquals(50, cuenta2.getActualizaSaldo());
	}
	
	@Test
	void testLimiteMaximoVariasTransferencias() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
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
	
	/*@Test
	void testProva1() {
		Operar cuenta = new Operar();
		Operar cuenta2 = new Operar();
		cuenta.actualizaSaldo(3500);
		//cuenta2.actualizaSaldo(50);
		//cuenta2.setActualizaTransferenciaSaldo(3500, 50, 2000);
		//assertEquals(2050, cuenta2.getActualizaSaldo());
		cuenta.setPrueba(cuenta, 3500, 2000);
		assertEquals(1500, cuenta.getPreba1());
	}*/
}

