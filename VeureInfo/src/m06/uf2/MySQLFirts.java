package m06.uf2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MySQLFirts {
	
	
	// LOS OBJETOS DE LAS CLASES MYSQL SE PUEDEN DECLARAR SIN NECESIDAD DE SER PUBLICOS, PROVADOS Y ETC
	private Connection conect = null;
	private PreparedStatement prova = null;
	private ResultSet tables = null;  // interfaz para verificar la tabla
	private Statement table = null;   // Statement de la tabla
	
	private String nombre;   // atributos de la tabla
	private String dni;
	private String fecha;
	private String postalDireccion;
	private String sexo;
	private String postalCode;
	//private String poblacion;
	

// constructor
	public MySQLFirts (String name, String ident, String agno, String direct, String sex, String postal) {
		
		nombre = name;
		dni = ident;
		fecha = agno;
		postalDireccion = direct;
		sexo = sex;
		postalCode = postal;
		//poblacion = pobla;
		
	}
	



// getters y setters del objeto
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String name) {
		this.nombre = name;
	}
	
	public String getDni() {
		return dni;
	}


	public void setDni(String ident) {
		this.dni = ident;
	}
	
	public void setFecha (String agno) {
				
		this.fecha = agno;
		
	}
	
	public String getFecha () {
		return fecha;
	}
	
	public String getPostalDireccion () {
		return postalDireccion;
	}
	
	public void setPostalDireccion (String direct) {
		this.postalDireccion = direct;
	}
	
	public String getSex () {
		return sexo;
	}
	
	public void setSex (String sex) {
		this.sexo = sex;
	}
	
	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postal) {
		this.postalCode = postal;
	}

	
	//public String getPoblacion() {
		//return poblacion;
	//}



	//public void setPoblacion(String pobla) {
		//this.poblacion = pobla;
	//}
	
	
	// método insertar en la tabla
	public void metodoInsertar() {
		
		try {
			
			// clase mysql para controlar la base de datos
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			// variable a usar en la clase connection con la sentencia que se desee agregar					//, POBLACION  (SE ELIMINO POBLACION)
			String sentencia = "INSERT INTO ALUMNE (NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE) VALUES (?,?,?,?,?,?)";
			// instancia de la clase PreparedStatement para dinamizar la tabla de la base de datos (IMPERATIVO SI SE VA A EDITAR O AGREGAR VALORES A LA MISMA)
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, this.nombre);  // edición de la tabla mediante los métodos del PreparedStatment
			prova.setString(2, this.dni);
			prova.setString(3, this.fecha);
			prova.setString(4, this.postalDireccion);
			prova.setString(5, this.sexo);
			prova.setString(6, this.postalCode);
			//prova.setString(7, this.poblacion);
			
			prova.executeUpdate();  // sentencia para modificar a la tabla luego de todos los valores pertinentes
			
			
			System.out.println(" CONEXION REALIZADA !!!");
			
			conect.close();
			
		} catch (Exception e) {
			System.out.println(" NO REALIZADA");
		}
	}
	
	// método para mostrar la tabla sobre la que estamos trabajando
	public void mostrarTabla () {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			String sentencia = ("SELECT * FROM ALUMNE");
			
			// instanciamos el Statement para acceder a los datos
			table = conect.createStatement();   // se inicializa el Statement a ejecutar en el ResultSet
			
			// instanciamos el ResultSet para obtener e imprimir los datos que se demandan en el Statetment
			tables = table.executeQuery(sentencia);
			
			// bucle con el método (next) de la clase Resultset de condicional
			while (tables.next()) {  // es imperativo el bucle y el método next para indicar siga la impresion de los valores mientras los haya.
				
				// imprimimos los valores del objeto, indicando cada uno y el indice en la tabla
				System.out.print(" NOMBRE : " + tables.getString(1));
				System.out.print(" DNI : " + tables.getString(2));
				System.out.print(" NACIMIENTO : " + tables.getString(3));
				System.out.print(" DIRECCION POSTAL : " + tables.getString(4));
				System.out.print(" SEXO : " + tables.getString(5));
				System.out.print(" CODIGO POSTAL : " + tables.getInt(6));
				//System.out.print(" POBLACION : " + tables.getString(7));
				
				System.out.println(" ");
			}
			
			conect.close();
			
		} catch (Exception e) {
			
			System.out.println(" error en la tabla a mostrar");
		}
	}
	
	
	// método para modificar datos en lab tabla
	
	public void metodoModificar(String eleccion, String nuevoValor) {
		
		try {
			
				conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
				
			//if (col.equalsIgnoreCase("NOMBRE")) {
			
			
			// PREGUNTAR PORQUÉ NO ACEPTA MAS DE 2 VALORES A EVALUAR PARA LA EDICION
				//String columna = "NOM";
				String sentencia = "UPDATE ALUMNE SET NOM = ? WHERE NACIMIENTO = ?;";
										// 1er parámetro (nuevoValor)			// segundo parámetro (eleccion)
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, nuevoValor); // HAY QUE LLEVAR LA CORRELACION EXACTA DE LOS PARÁMETROS o da error
				//prova.setString(2, nuevoValor);
				prova.setString(2, eleccion);
				
				
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
				
			//}
		
		} catch (Exception e) {
			System.out.println(" no se ha logrado modificar la tabla");
		}
	}
	

// metodo borrar
public void metodoBorrar (String elemento, String column) {
	
	try {
		
		conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
		
		//String sentencia = "DELETE FROM ALUMNE WHERE ? = ?;";
		
		//this.nombre = elemento;
		
	//	prova = conect.prepareStatement(sentencia);
		if (column.equalsIgnoreCase("nombre")) {
			String sentencia = "DELETE FROM ALUMNE WHERE NOM = ?;";
			prova = conect.prepareStatement(sentencia);
			this.nombre = elemento;
			prova.setString(1, this.nombre);
			prova.executeUpdate();
			System.out.println(" elemento eliminado");
			
		} else if (column.equalsIgnoreCase("dni")) {
				String sentencia = "DELETE FROM ALUMNE WHERE DNI = ?;";
				prova = conect.prepareStatement(sentencia);
				this.dni = elemento;
				prova.setString(2, this.dni);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			} 
			else if (column.equalsIgnoreCase("nacimiento")) {
				String sentencia = "DELETE FROM ALUMNE WHERE NACIMIENTO = ?;";
				prova = conect.prepareStatement(sentencia);
				this.fecha = elemento;
				prova.setString(3, this.fecha);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			} 
			else if (column.equalsIgnoreCase("direccion")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POSTAL_DIRECTION = ?;";
				prova = conect.prepareStatement(sentencia);
				this.postalDireccion = elemento;
				prova.setString(4, this.postalDireccion);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			else if (column.equalsIgnoreCase("sexo")) {
				String sentencia = "DELETE FROM ALUMNE WHERE SEX = ?;";
				prova = conect.prepareStatement(sentencia);
				this.sexo = elemento;
				prova.setString(5, this.sexo);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			else if (column.equalsIgnoreCase("postal")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POSTAL_CODE = ?;";
				prova = conect.prepareStatement(sentencia);
				this.postalCode = elemento;
				prova.setString(6, this.postalCode);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			/*else if (column.equalsIgnoreCase("poblacion")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POBLATION = ?;";
				prova = conect.prepareStatement(sentencia);
				this.poblacion = elemento;
				prova.setString(7, this.poblacion);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
				*/
		 else {
			System.out.println(" elemento no eliminado o inexistente, vuelva a intentarlo");
		}
		
			conect.close();
	
	} catch (Exception e) {
	
		System.out.println(" no se ha podido eliminar el elmento");
		
		}
	}



public void metodoVerificaElemento (String elem, String elem1) {
	
	try {
		
		conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
									// no ejecuta mas de un parámetro
		
		
		if (elem.equalsIgnoreCase("nombre")) {
		
		String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE NOM = ?";
		
		prova = conect.prepareStatement(sentencia);
		
		prova.setString(1, elem1);
		//prova.setString(2, elem2);
		//prova.setString(3, elem);
		
		tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
		
		while (tables.next()) {  //  
			
			System.out.println(tables.getString(1));
			System.out.println(tables.getString(2));
			System.out.println(tables.getString(3));
			System.out.println(tables.getString(4));
			System.out.println(tables.getString(5));
			System.out.println(tables.getString(6));
			System.out.println(tables.getString(7));
			}
		}
		else if (elem.equalsIgnoreCase("dni")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE DNI = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			//prova.setString(2, elem2);
			//prova.setString(3, elem);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
				
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}
		}
		if (elem.equalsIgnoreCase("nacimiento")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE NACIMIENTO = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			//prova.setString(2, elem2);
			//prova.setString(3, elem);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
				
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}
		} if (elem.equalsIgnoreCase("direccion")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE POSTAL_DIRECTION = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			//prova.setString(2, elem2);
			//prova.setString(3, elem);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
				
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}
		} if (elem.equalsIgnoreCase("sexo")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE SEX = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			//prova.setString(2, elem2);
			//prova.setString(3, elem);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
				
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}	
		}if (elem.equalsIgnoreCase("CODIGO")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE POSTAL_CODE = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			//prova.setString(2, elem2);
			//prova.setString(3, elem);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
				
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}
		}if (elem.equalsIgnoreCase("POBLACION")) {
			
			String sentencia = "SELECT NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION  FROM ALUMNE WHERE POBLACION = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, elem1);
			
			tables = prova.executeQuery();  // EJECUTA LA CONSULTA PREPARADA EN EL PREPARESTATEMENT
			
			while (tables.next()) {  //  
									// CON EL ResultSet se obiene unoa a uno las columnas 
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
				System.out.println(tables.getString(3));
				System.out.println(tables.getString(4));
				System.out.println(tables.getString(5));
				System.out.println(tables.getString(6));
				System.out.println(tables.getString(7));
			}
		} else {
			System.out.println("elemento o columna inválida, verifique");
		}
		
		
		conect.close();
		
	} catch (Exception e) {
		//System.out.println("consulta no realizada");
		}
	}

	public void crearPoblacion(String code, String pobl) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");

			String sentencia = " INSERT INTO POBLACION (POSTAL_CODE, POBLACION) VALUES ( ?, ?);";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, code);
			prova.setString(2, pobl);
			
			prova.executeUpdate();
			
			System.out.println(" EXITOSAMENTE CREADA");
			
			conect.close();
			
		} catch (Exception e) {
			
			System.out.println(" no creada");
		}
	}
	
	public void mostrarPoblacion () {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");

			String sentencia = ("SELECT * FROM POBLACION");
			
			prova = conect.prepareStatement(sentencia);
			
			tables = prova.executeQuery();
			
			while (tables.next()) {
				
				System.out.println(" Código postal : " + tables.getString(1));
				System.out.println(" Población : " + tables.getString(2));
				System.out.println();
			}
			
			conect.close();  // cierre del flujo
			
		} catch (Exception e) {
			
			System.out.println("no se puede mostrar la tabla, revise los errores");
		}
	}
	
	
	// método consulta de la poblacion
	public void consultaPoblacion () {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");

			String sentencia = "SELECT A.NOM, A.POSTAL_DIRECTION FROM alumne A JOIN poblacion P ON (A.POSTAL_CODE = P.POSTAL_CODE) ";
			
			prova = conect.prepareStatement(sentencia);
			
			// prova
			
			tables = prova.executeQuery();
			
			while (tables.next()) {
				System.out.println(tables.getString(1));
				System.out.println(tables.getString(2));
			}
			
			conect.close();
			
		} catch (Exception e) {
			System.out.println(" no se puede consultar la tabla");
		}
	}
	
	
	// método para eliminar a la poblacion
	
	public void eliminaPoblacion (String eli) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			Scanner ask = new Scanner (System.in);
			
			String respuesta;
			
			String sentencia = " DELETE FROM POBLACION WHERE POSTAL_CODE = ?";
			
			prova = conect.prepareStatement(sentencia);
			
			//if (verificaCodigo(eli)) {
				
				//System.out.println(" el código a eliminar lo dispone un alumno, si lo elimina, eliminará al alumno, desea continuar, marque 'y' para (sí) o 'n' para no ?");
				
				//respuesta = ask.next();
				
				//if (respuesta.equalsIgnoreCase("y") && verificaCodigo(eli)) {
					
					prova.setString(1, eli);
					
					prova.executeUpdate();
					
					//System.out.println("alumno eliminado");
				//}
				
				//System.out.println("ELIMINADA");
			//} else {
				
				System.out.println("ELIMINADA");
			//}
			
			
		} catch (Exception e) {
			
			System.out.println("no se ha podido eliminar");
		}
	}
	
	public boolean verificaCodigo (String eli) {
		
		try {
		conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");

		//boolean concuerda = true;
		
		
		String sentencia = " SELECT A.POSTAL_CODE FROM ALUMNE A JOIN POBLACION P ON (A.POSTAL_CODE = P.POSTAL_CODE)";
		
		prova = conect.prepareStatement(sentencia);
		
		tables = prova.executeQuery();
		
		while (tables.next()) {
			System.out.println(tables.getString(1));
			return true;
			
			}
		
		} catch (Exception e) {
			
		}
		return false;
	}
	
	
}	
