package m3.uf5ExamenActividadPOOAdvance;

public class Items {
	
	protected String nombre;
	protected int peso;
	protected int valor;
	
	public Items(String nam, int wei, int value) {
		
		this.nombre = nam;
		this.peso = wei;
		this.valor = value;
		
	}

	@Override
	public String toString() {
		return "Items [nombre=" + nombre + ", peso=" + peso + ", valor=" + valor + "]";
	}
	
	
	
}
