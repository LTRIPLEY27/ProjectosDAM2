package m05EntornosdeDesarrolloActividad1SegonaParte;

import java.util.Scanner;

public class MainProvaCaixas {

	/*
	 * 3. Estudiamos una aplicación bancaria, donde el usuario puede conectarse al banco a través de
	 *  internet y realizar una serie de operaciones bancarias. Una vez se ha accedido al banco con
	 *   las debidas medidas de seguridad, se pueden realizar estas operaciones. La operación que se
	 *    ha de gestionar requiere la siguiente entrada:
- Código del banco: puede estar en blanco o puede ser un número de 3 dígitos. 
En este caso el primero de ellos debe ser mayor de 1.
- Código de sucursal: número de 4 dígitos. El primero de ellos mayor de 0.
- Número de cuenta: número de 5 dígitos
- Clave personal: valor alfanumérico de 5 posiciones
- Orden: puede estar en blanco o ser uno de los siguientes valores: "talonario" o "movimientos"
El programa responde de la siguiente manera:
- Si Orden tiene el valor "Talonario", el usuario recibe un talonario de cheques.
- Si Orden tiene el valor "Movimientos", el usuario recibe los movimientos del mes en curso.
- Si Orden está en blanco, el usuario recibe los dos documentos.
- Si ocurre algún error en la entrada de datos, el programa muestra un mensaje de error sobre 
el dato implicada.
Se pide definir las clases de equivalencia, casos de prueba válidos y casos de prueba no válidos 
que cubren una sola clase no válida.
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
