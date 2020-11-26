package m06.uf2;

import java.util.Scanner;

public class MainConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MySQLFirts aplicacion = new MySQLFirts ();  // instanciacion del objeto aplicacion, de la clase MySQL
		
		Scanner ask = new Scanner (System.in);
		
		String nom, ident, adresa, sex, pob;
		
		int data, any, dia, mes, postal, opcion;
		
		System.out.println("ingrese el nombre");
		nom = ask.next();
		
		System.out.println("dni");
		ident = ask.next();
		
		System.out.println("ingrese fecha de nacimiento, any");
		any = ask.nextInt();
		
		System.out.println("ingrese mes");
		mes = ask.nextInt();
		
		System.out.println("ingrese dia");
		dia = ask.nextInt();
		
		System.out.println("ingrese el direccion fiscal");
		adresa = ask.next();
		
		System.out.println("ingrese el sexo");
		sex = ask.next();
		
		System.out.println("código postal ");
		postal = ask.nextInt();
		
		System.out.println("ingrese la poblacion ");
		pob = ask.next();
		
		MySQLFirts aplicacion = new MySQLFirts (nom, ident, adresa, sex, postal, pob);  // instanciacion del objeto aplicacion, de la clase MySQL

		
		/*System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
				"desea insertar alumno (1)" + '\n' + " desea modificar alumno " + '\n' +
				"desea eliminar alumno  (3)" + '\n' + "modificar poblacion (4)");
		opcion = ask.nextInt();
		
		//while (eleccion) {
			
			
			switch (opcion) {
			case 1:
				System.out.println("ingrese el nombre");
				nom = ask.next();
				
				/*System.out.println("dni");
				dni = ask.next();
				
				System.out.println("ingrese fecha de nacimiento, any");
				any = ask.nextInt();
				
				System.out.println("ingrese mes");
				mes = ask.nextInt();
				
				System.out.println("ingrese dia");
				dia = ask.nextInt();
				
				System.out.println("ingrese el direccion fiscal");
				adresa = ask.next();
				
				System.out.println("ingrese el sexo");
				sex = ask.next();
				
				System.out.println("código postal ");
				postal = ask.nextInt();
				
				System.out.println("ingrese la poblacion ");
				pob = ask.next();
				*///, dni, adresa, postal, pob
				//aplicacion.connected();
				//break;
			//}

				aplicacion.connected();
		
		//aplicacion.edita();
		
		
		
	}

}

//}