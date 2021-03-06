package m05EntornosdeDesarrolloActividad2;


public class Operar {

	private double saldo;
	private double y;
	
	public Operar() {
		this.saldo = 0.0;  // saldo inicial 
	}
	
	public double getSaldoInicial() {  // return del saldo en cero
		return this.saldo;
	}
	
	public boolean getSaldoTester(double x) {
		if(x < 0) {
			return false;       // boolean que verifica que la cantidad cumpla 3 condiciones: 1) sea numero positivo(x>0). 2) sea menor o igual a 6000. 3) sea un numero de dos decimales 
		} if(x > 6000) {
			return false;
		} if(Math.round(x * 100.0)/100.0 == x * 100.0) { // condicioneal a verificar = si lleva dos decimales comparando con el mismo parametro 
			return false;
		}
		
		return true;
	}
	
	public void actualizaSaldo(double x) {
		if(getSaldoTester(x)== true) {
			y += x;
		}
	}
	
	public double getActualizaSaldo() {
		return y;
	}
	
}
