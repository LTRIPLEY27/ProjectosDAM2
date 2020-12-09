package m3.uf5Actividad3;

public class CoffeTester {

	// atributos de la clase
	private double valor;
	private double[] arrayCoffe;
	private int longitud;

	// constructor 
	public CoffeTester(int num) {
		
		// carga del array mediante el constructor con los par�metros del main 
		this.arrayCoffe = new double[num];
		
		// atributo longitud con el par�metro del num como extensi�n
		this.longitud = num;
	}
	
	// m�todo set
	public void setValor (double num) {
		this.valor = num;
	}
	
	// m�todo Get
	public double getValor () {
		
		return this.valor;
	}

	public int getLongitud () {
		
		return this.longitud;
	}
	
	
	@Override
	public String toString() {
		return "CoffeTester [valor=" + valor + "]";
	}
	
	// m�todo findMax para hallar el valor mayor del array recorrido
	public double findMax () {
		
		
		double max = this.arrayCoffe[0]; 
		for ( int i = 0; i < this.arrayCoffe.length; i ++ ) {
			if (this.arrayCoffe[i] > max )
				max = this.arrayCoffe[i];
	
		}
		return max;
	}

	
	// m�todo para adherir el valor en la posici�n espec�fica del array
	public void add(int i, double num) {
		
		this.arrayCoffe[i] = num;	
	}
}
