package m05EntornosdeDesarrolloActividad2;

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
	@Test
	public void testGetSaldoInicial() {
		
	}

	@Test
	public void testGetSaldoTester() {
	
	}

	@Test
	public void testActualizaSaldo() {
		
	}


}
