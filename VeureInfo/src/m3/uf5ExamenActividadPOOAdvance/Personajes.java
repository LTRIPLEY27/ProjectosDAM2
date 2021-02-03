package m3.uf5ExamenActividadPOOAdvance;

public abstract class Personajes {   // definicion de la clase abstracta con el indicativo de la palabra reserada "abstract"

	protected String nom;  // declaracion de los atributos de forma "protected2 para adecuar el acceso de las subclases
	protected int edad;
	protected int forca;
	protected int PuntosdeVida;
	protected String equip;
	
	
	public Personajes (String n, int e, int f, int p, String eq) {
		
		this.nom = n;
		this.edad = e;
		this.forca = p;
		this.equip = eq;
		
	}

    public abstract int atacar();  // los métodos abstractos no deben de llevar llaves (cuerpo)
    
    
    
	
}
