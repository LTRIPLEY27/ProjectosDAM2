package m3.uf5ExamenActividadPOOAdvance;

public class Genericos extends Items{

	private String articulo;
	
	public Generico( String articule)
	{
		super (nam, wei, value);  // invocación al constructor padre

		this.articulo = articule; // parametros propios de armas
		
	}
	
	public String toString()
	{
		return super.toString() + " articulo: " + articulo;
	}
}
