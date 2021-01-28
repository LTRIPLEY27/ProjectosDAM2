package m3.uf5Inheritance;

public class Goods {

	//  todos los métodos u atributos en una interface deben de ser PUBLICOS (public)!!!!
	
	// atributos
	
	int pes;
	String nom;
	
	// constructor
	
	
	// métodos
	
	@Override
	public int compareTo (Object t) { // método compareTo (buscar diferencias y relaciones con el toString ****
		int retorn = 0;
		Programa alte = (Programa) t;  // parámetro de un objeto del tipo programa
		
	}
	
	
	public static void main (String [] args) {
		
		Programa p1 = new Programa (100, "geo");
		
		Programa p2 = new Programa (200, "analize");
		
		System.out.println(p1.compareTo(p2));
		}
	}
}



// ejercicio 16 debe de implementar 2 interficies la compareTo y la validate

