package m3.uf4;

public class NameEcho {
	
	private String name;
	private String surname;
	
	
	public NameEcho (String n, String m)
	{
		System.out.println(" Ingresa tu Nombre:   ");
		this.name = n;
		this.surname = m;
	}
	
	public String getName () {
		return (this.name);
	}
	
	public void setName (String n) { // es en la edicion donde se ha de pasar el par�metro a actualizar
		this.name = n;
		
	}
	
	public String getSurname () {
		return (this.surname);
	}
	
	public void setSurname (String m) {
		this.surname = m;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// la creaci�n de los objetos ha de hacerse en el void, declarando el new Object ( objeto siempre ser� en min�sculas y el m�todo o la clase va en may�sculas para ser m�s comprensible)
		
		NameEcho n1= new NameEcho ("Adolfo", "lopez");
		
		//System.out.println( n.ti(n1.getName() + n1.getSurname()));
		
	}

}
