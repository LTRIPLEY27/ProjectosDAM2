package m05EntornosdeDesarrolloActividad1SegonaParte;

import java.util.Scanner;

public class MainProvaCaixas {

	/*
	 * 3. Estudiamos una aplicaci�n bancaria, donde el usuario puede conectarse al banco a trav�s de
	 *  internet y realizar una serie de operaciones bancarias. Una vez se ha accedido al banco con
	 *   las debidas medidas de seguridad, se pueden realizar estas operaciones. La operaci�n que se
	 *    ha de gestionar requiere la siguiente entrada:
- C�digo del banco: puede estar en blanco o puede ser un n�mero de 3 d�gitos. 
En este caso el primero de ellos debe ser mayor de 1.
- C�digo de sucursal: n�mero de 4 d�gitos. El primero de ellos mayor de 0.
- N�mero de cuenta: n�mero de 5 d�gitos
- Clave personal: valor alfanum�rico de 5 posiciones
- Orden: puede estar en blanco o ser uno de los siguientes valores: "talonario" o "movimientos"
El programa responde de la siguiente manera:
- Si Orden tiene el valor "Talonario", el usuario recibe un talonario de cheques.
- Si Orden tiene el valor "Movimientos", el usuario recibe los movimientos del mes en curso.
- Si Orden est� en blanco, el usuario recibe los dos documentos.
- Si ocurre alg�n error en la entrada de datos, el programa muestra un mensaje de error sobre 
el dato implicada.
Se pide definir las clases de equivalencia, casos de prueba v�lidos y casos de prueba no v�lidos 
que cubren una sola clase no v�lida.
	 */
	public static void main(String[] args) {
		

		Scanner ask = new Scanner(System.in);
		String name;
		int codeDNI;
		int opcion;
		
		while (ask.hasNext()) {
			System.out.println("indique el apellido del cliente");
			name = ask.next();
			
			System.out.println("indique el DNI del cliente");
			codeDNI = ask.nextInt();
		}
		
		
		
		
		//ProvaCaixas cliente = new ProvaCaixas ();
		
		
	}

}
