package m3.uf5ExamenActividadPOOAdvance;

public class Guerreros extends Personajes{
	
	private int pesoPoder;
	
	public Guerreros (String name, int age, int force, int points, boolean equipment, int weigth)
	{
		this.nom = name;
		this.edad = age;
		this.forca = force;
		this.puntosdeVida = points;
		this.equip = equipment;
		this.pesoPoder = weigth;
		
	}
	
	public String toString()
	{
		return super.toString() + " peso que tolera : " + pesoPoder;
	}
}

