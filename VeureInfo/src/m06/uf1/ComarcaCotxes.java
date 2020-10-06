package m06.uf1;

public class ComarcaCotxes {
	
	private String marca;  // los atributos se han de definir en la clase al momento siguiente
	private String modelo;
	private int any;
	private int matricula;

	//public static void main(String[] args) {
	/*Exercici 2 bis

Fes un programa que agafant com a model Comarca, EscriureFitxerObject i LlegirFitxerObject:

    Es creen objectes tipus Cotxes: marca, model, any i matricula.
    Pugui guardar i recuperar objectes tipus Cotxe com un bloc.
    Pugui guardar objectes tipus Cotxe d'un en un.
    Pugui recuperar objectes tipus Cotxe segons un camp.

S'ha d'entregar PDF amb el següent contingut:

    Enllaç al repositori al núvol.
    Els fonts remarcant-ne el que s'ha modificat respecte dels codis d'exemple subministrats.
    Bolcats de pantalla amb DIFERENTS execucions (no només una) del programa.
	 * 
	 */

				
		// primer objeto de la clase cotxes
			
	public String getMarca() { // método para mostrar el valor de un atributo
			return marca;
			}
	public void setNombre (String marca) {
		this.marca = marca; // método set (indica la modificacion potencial de un atributo)
	}
		
	public String getModelo() {
			return modelo;
	}
	public void setModelo (String modelo) { // es imperativo declarar el parametroa modificar dentro del método para que compile
		this.modelo = modelo;
	}
	
	public int getAny() {
		return any;
	}
	public void setAny( int any) {
		this.any = any;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula (int matricula) {
		this.matricula = matricula;
	}
	
	

}

