package m3.uf5ExamenActividadPOOAdvance;

public class Armas extends Items {

	private int puntosdeAtaque;
	private String tipo;
	
	public Armas(String nam, int wei, int value, int atack, String kind) 
	{
		super (nam, wei, value);  // invocación al constructor padre

		this.puntosdeAtaque = atack; // parametros propios de armas
		this.tipo = kind;
	}
	
	public String toString()
	{
		return super.toString() + " puntos de ataque" + puntosdeAtaque + " tipo" + tipo;
	}
}
