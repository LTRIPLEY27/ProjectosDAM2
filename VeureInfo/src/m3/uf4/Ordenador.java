package m3.uf4;

public class Ordenador{

	private int memoria;
	private String procesador;
	
	public  Ordenador( int m, String p) // el constructor puede repetirse infinitamente siempre  que los parametros no se repitan.
	{
		System.out.println("Creant Ordenador");
		this.memoria = m ;
		this.procesador = p;
	}
	
	public int getMemoria() {
		return (this.memoria);
	}
	
	public void setMemoria( int m) {
		 this.memoria = m;
	}
	
	public String getProcesador () {
		return this.procesador;
	}
	
	public boolean equals (Ordenador o)
	{ if ((this.memoria == o.getMemoria())  && (this.procesador.equals(o.getProcesador()))){
		return true;
		}
	else return false;
	}
	
public static void main(String[] args) {
		// TODOAuto-generated method stub
		
		Ordenador o1 = new  Ordenador (256, "p4");
		Ordenador o2 = new Ordenador (512, "p5");
		System.out.println(o2.getMemoria());
		

	}

}
