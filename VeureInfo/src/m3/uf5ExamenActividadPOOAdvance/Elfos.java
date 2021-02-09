package m3.uf5ExamenActividadPOOAdvance;

public class Elfos extends Personajes {

	private String experiencia;
	private String tipo;
	
	public Elfos(String name, int age, int force, int points, boolean equipment, int weigth, String experience, String type )
	{
		this.nom = name;
		this.edad = age;
		this.forca = force;
		this.puntosdeVida = points;
		this.equip = equipment;
		this.experiencia = experience;
		this.tipo = type;
		
	}

	public String toString()
	{
		return super.toString() + " experiencia" + experiencia + " tipo" + tipo;
	}
	
	
}
