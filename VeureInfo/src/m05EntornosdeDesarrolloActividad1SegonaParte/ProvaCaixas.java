package m05EntornosdeDesarrolloActividad1SegonaParte;

public class ProvaCaixas {
	
	private int dni; // atributos del cliente  (relativas a las minimas medidas de seguridad)
	private String nom;
	
	private int codigoBanco;   // atributos necesarios segun el contexto del enunciado
	private int codigoSucursal;
	private int codigoCuenta;
	private char clavePersonal;  // comprobaremos luego lo de String
	private String orden;
	
	public ProvaCaixas(int codeDni, String name, int codeBank, int codePlace, int codeCount, char personalKey, int order) {  // constructor
		
		this.dni = codeDni;
		this.nom = name;
		this.codigoBanco = codeBank;
		this.codigoSucursal = codePlace;
		this.codigoCuenta = codeCount;
		this.clavePersonal = personalKey;
		this.orden = order;
	}
	
	
	
	
	
	
	

}
