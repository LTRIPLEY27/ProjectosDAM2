package m3.uf5ExamenActividadPOOAdvance;

public class Magos extends Personajes {

	private int puntosMagia;
	private int conocimiento;

public Magos(String name, int age, int force, int points, boolean equipment, int weigth, int magic, int knowledge)
	{
	this.nom = name;
	this.edad = age;
	this.forca = force;
	this.puntosdeVida = points;
	this.equip = equipment;
	this.puntosMagia = magic;
	this.conocimiento = knowledge;
	}

public String toString() 
{
	return super.toString() + " puntos de mágia " + puntosMagia + " conocimiento " + conocimiento;
}

}