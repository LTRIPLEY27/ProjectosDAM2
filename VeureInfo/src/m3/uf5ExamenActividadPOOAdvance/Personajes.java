package m3.uf5ExamenActividadPOOAdvance;

public abstract class Personajes {   // definicion de la clase abstracta con el indicativo de la palabra reserada "abstract"

	protected String nom;  // declaracion de los atributos de forma "protected2 para adecuar el acceso de las subclases
	protected int edad;
	protected int forca;
	protected int puntosdeVida;
	protected boolean equip;
	
	
	public Personajes (String name, int age, int force, int points, boolean equipment) {
		
		this.nom = name;
		this.edad = age;
		this.forca = force;
		this.puntosdeVida = points;
		this.equip = equipment;
		
	}

    public abstract void Atacar();  // los métodos abstractos no deben de llevar llaves (cuerpo)
    
    public abstract void Equipar();
    
    public abstract void Beber();
    
    public abstract void MostrarEquipaje();

	@Override
	public String toString() {
		return "Personajes [nom=" + nom + ", edad=" + edad + ", forca=" + forca + ", PuntosdeVida=" + puntosdeVida
				+ ", equip=" + equip + "]";
	}
    
    
    
    
	
}
