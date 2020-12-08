package m3.uf5Actividad3;

public class CoffeTester {

	// atributo de la clase
	private double valor;
	

	// constructor 
	public CoffeTester(double num) {
		
		this.valor = num;
	}
	
	// método set
	public void setValor (double num) {
		this.valor = num;
	}
	
	// método Get
	public double getValor () {
		
		return this.valor;
	}

	@Override
	public String toString() {
		return "CoffeTester [valor=" + valor + "]";
	}
	
	public static int findMax ( int[] x) {
		
		int max = x [0]; 
		for ( int i = 0; i < x.length; i ++ ) {
			if (x [i] < max )
				max = x[i];
			
			return max;
		}
		return max;
	}
}
