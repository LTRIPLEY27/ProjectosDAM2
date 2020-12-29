package m06.uf2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	private String apellido;
	private String dni;
	private String fecha;
	private String postalDireccion;
	private String sexo;
	private String postalCode;
	//private String poblacion;
	private String comprob;
	private boolean comproba;
	private int contador = 0;

// constructor
	public MySQLFirts (String name, String lastname, String ident, String agno, String direct, String sex, String postal) {
		
		this.nombre = name;
		this.apellido = lastname;
		this.dni = ident;
		this.fecha = agno;
		this.postalDireccion = direct;
		this.sexo = sex;
		this.postalCode = postal;
		//poblacion = pobla;
		
	}
	



// getters y setters del objeto
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String name) {
		this.nombre = name;
	}
	
	public String getApellido () {
		return this.apellido;
	}
	
	public void setApellido (String lastname) {
		this.apellido = lastname;
	}
	
	public String getDni() {
		return this.dni;
	}

	public void setDni(String ident) {
		this.dni = ident;
	}
	
	public void setFecha (String agno) {		
		this.fecha = agno;
	}
	
	public String getFecha () {
		return this.fecha;
	}
	
	public String getPostalDireccion () {
		return this.postalDireccion;
	}
	
	public void setPostalDireccion (String direct) {
		this.postalDireccion = direct;
	}
	
	public String getSex () {
		return this.sexo;
	}
	
	public void setSex (String sex) {
		this.sexo = sex;
	}
	
	public String getPostalCode() {
		return this.postalCode;
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
			String sentencia = "INSERT INTO ALUMNE (NOMBRE, APELLIDO, DNI, NACIMIENTO, DIRECCION_POSTAL, SEXO, POSTAL_CODE) VALUES (?,?,?,?,?,?,?)";
			// instancia de la clase PreparedStatement para dinamizar la tabla de la base de datos (IMPERATIVO SI SE VA A EDITAR O AGREGAR VALORES A LA MISMA)
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, this.nombre);  // edición de la tabla mediante los métodos del PreparedStatment
			prova.setString(2, this.apellido);
			prova.setString(3, this.dni);
			prova.setString(4, this.fecha);
			prova.setString(5, this.postalDireccion);
			prova.setString(6, this.sexo);
			prova.setString(7, this.postalCode);
			//prova.setString(8, this.poblacion);
			
			prova.executeUpdate();  // sentencia para modificar a la tabla luego de todos los valores pertinentes
			
			
			System.out.println(" CONEXION REALIZADA !!!");
			
			conect.close();
			
		} catch (Exception e) {
			System.out.println(" NO REALIZADA, por favor verífique el código postal ya que es probable no sea válido");
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
				System.out.print(" APELLIDO : " + tables.getString(2));
				System.out.print(" DNI : " + tables.getString(3));
				System.out.print(" NACIMIENTO : " + tables.getString(4));
				System.out.print(" DIRECCION POSTAL : " + tables.getString(5));
				System.out.print(" SEXO : " + tables.getString(6));
				System.out.print(" CODIGO POSTAL : " + tables.getInt(7));
				//System.out.print(" POBLACION : " + tables.getString(8));
				
				System.out.println(" ");
			}
			
			conect.close();
			
		} catch (Exception e) {
			
			System.out.println(" error en la tabla a mostrar");
		}
	}
	
	
	// método para modificar datos en la tabla
	//, String igual    
	public void metodoModificar(String col, String eleccion, String nuevoValor) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
				
			if (col.equalsIgnoreCase("NOMBRE")) {
			
			
			// PREGUNTAR PORQUÉ NO ACEPTA MAS DE 2 VALORES A EVALUAR PARA LA EDICION
								
				String sentencia = "UPDATE ALUMNE SET NOMBRE = ? WHERE DNI = ?;";
										// 1er parámetro (nuevoValor)			// segundo parámetro (eleccion)
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				//prova.setString(3, donde);
				//prova.setString(4, igual); // HAY QUE LLEVAR LA CORRELACION EXACTA DE LOS PARÁMETROS o da error
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
				
			}
			else if (col.equalsIgnoreCase("APELLIDO")) {
				
				
				String sentencia = "UPDATE ALUMNE SET APELLIDO = ? WHERE DNI = ?;";
				
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
		
			} 
			
			else if (col.equalsIgnoreCase("DNI")) {
				
			
				String sentencia = "UPDATE ALUMNE SET DNI = ? WHERE DNI = ?;";
				
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
		
			} 	else if (col.equalsIgnoreCase("NACIMIENTO")) {
				
			
				String sentencia = "UPDATE ALUMNE SET NACIMIENTO = ? WHERE DNI = ?;";
				
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
			
			} 	else if (col.equalsIgnoreCase("DIRECCION")) {
				
			
				String sentencia = "UPDATE ALUMNE SET DIRECCION_POSTAL = ? WHERE DNI = ?;";
				
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close(); 
			} 	else if (col.equalsIgnoreCase("SEXO")) {
				
			
				String sentencia = "UPDATE ALUMNE SET SEXO = ? WHERE DNI = ?;";
				
				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eleccion);
				prova.setString(2, nuevoValor);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
				
				conect.close();
				
			} else if (col.equalsIgnoreCase("POSTAL")) {
				System.out.println(" la direccion Postal solo se puede modificar desde la tabla de POBLACION");
			
			} else {
				System.out.println(" NO HA INDICADO BIEN LOS PARÁMETROS A MODIFICAR");
			}
			
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
			String sentencia = "DELETE FROM ALUMNE WHERE NOMBRE = ?;";
			prova = conect.prepareStatement(sentencia);
			this.nombre = elemento;
			prova.setString(1, this.nombre);
			prova.executeUpdate();
			System.out.println(" elemento eliminado");
			
		} 
		else if (column.equalsIgnoreCase("apellido")) {
			String sentencia = "DELETE FROM ALUMNE WHERE APELLIDO = ?;";
			prova = conect.prepareStatement(sentencia);
			this.dni = elemento;
			prova.setString(2, this.apellido);
			prova.executeUpdate();
			System.out.println(" elemento eliminado");
		} 
		else if (column.equalsIgnoreCase("dni")) {
				String sentencia = "DELETE FROM ALUMNE WHERE DNI = ?;";
				prova = conect.prepareStatement(sentencia);
				this.dni = elemento;
				prova.setString(3, this.dni);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			} 
			else if (column.equalsIgnoreCase("nacimiento")) {
				String sentencia = "DELETE FROM ALUMNE WHERE NACIMIENTO = ?;";
				prova = conect.prepareStatement(sentencia);
				this.fecha = elemento;
				prova.setString(4, this.fecha);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			} 
			else if (column.equalsIgnoreCase("direccion")) {
				String sentencia = "DELETE FROM ALUMNE WHERE DIRECCION_POSTAL = ?;";
				prova = conect.prepareStatement(sentencia);
				this.postalDireccion = elemento;
				prova.setString(5, this.postalDireccion);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			else if (column.equalsIgnoreCase("sexo")) {
				String sentencia = "DELETE FROM ALUMNE WHERE SEXO = ?;";
				prova = conect.prepareStatement(sentencia);
				this.sexo = elemento;
				prova.setString(6, this.sexo);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			else if (column.equalsIgnoreCase("codigo")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POSTAL_CODE = ?;";
				prova = conect.prepareStatement(sentencia);
				this.postalCode = elemento;
				prova.setString(7, this.postalCode);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
			}
			/*else if (column.equalsIgnoreCase("poblacion")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POBLATION = ?;";
				prova = conect.prepareStatement(sentencia);
				this.poblacion = elemento;
				prova.setString(8, this.poblacion);
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


// método consulta sobre una columna específica de la tabla
public void metodoConsultaSobreunElemento (String sen1) {
	
	try {
		
		conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
		
		if (sen1.equalsIgnoreCase("NOMBRE")) {
			
			String sentencia = "SELECT NOMBRE FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los nombres almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {
				System.out.println(tables.getString(1));
				
			}
		}
		
		else if (sen1.equalsIgnoreCase("APELLIDO")) {
			
			String sentencia = "SELECT APELLIDO FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los apellidos almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {

				System.out.println(tables.getString(1));
		
			}
		}
		
		else if (sen1.equalsIgnoreCase("DNI")) {
			
			String sentencia = "SELECT DNI FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los dni almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {

				System.out.println(tables.getString(1));
		
			}
		}
		
		else if (sen1.equalsIgnoreCase("NACIMIENTO")) {
			
			String sentencia = "SELECT NACIMIENTO FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los anys de nacimiento almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {

				System.out.println(tables.getString(1));
				
			}
		}
		
		else if (sen1.equalsIgnoreCase("DIRECCION")) {
			
			String sentencia = "SELECT DIRECCION_POSTAL FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("las direcciones almacenadas en la tabla alumne son los que siguen: ");

			while (tables.next()) {

				System.out.println(tables.getString(1));
				
			}
		}
		else if (sen1.equalsIgnoreCase("SEXO")) {

			String sentencia = "SELECT SEXO FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los géneros almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {
				
				System.out.println(tables.getString(1));
				
			}
		}
		
		else if (sen1.equalsIgnoreCase("CODIGO")) {
			
			String sentencia = "SELECT POSTAL_CODE FROM ALUMNE";
			
			table = conect.createStatement();
			
			tables = table.executeQuery(sentencia);
			
			System.out.println("los códigos postales almacenados en la tabla alumne son los que siguen: ");

			while (tables.next()) {
				System.out.println(tables.getString(1));
			
			}
		} else {
			System.out.println("PARÁMETRO INEXISTENTE EN LA TABLA");
		}
		conect.close();
		
	} catch (Exception e) {
		
		System.out.println("consulta no realizada");
		
	}
}


// método de insercion de tabla poblacion
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
	
	// método de muestra de la tabla poblacion
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
	
	// método modifica población
	
	public void modificaPoblacion (String poblatName, String neu, String clau) {

		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			if (poblatName.equalsIgnoreCase("poblacion")) {
				String sentencia = " UPDATE POBLACION SET POBLACION = ? WHERE POSTAL_CODE = ? ";
			
				prova = conect.prepareStatement(sentencia);
			
				prova.setString(1, neu);
			
				prova.setString(2, clau);
			
				prova.executeUpdate();
			
				System.out.println("realizada");
			
				conect.close();
		} else {
				String sentencia = " UPDATE POBLACION SET POSTAL_CODE = ? WHERE POBLACION = ? ";
			
				prova = conect.prepareStatement(sentencia);
		
				prova.setString(1, clau);
		
				prova.setString(2, neu);
		
				prova.executeUpdate();
		
				System.out.println("realizada");
		
				conect.close();
		}
			} catch (Exception e) {
				System.out.println("no realizada");
			}

		}
	
	
	// método consulta columna de poblacion
	
	public void metodoConsultaPoblacion (String x) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			if ( x.equalsIgnoreCase("POBLACION")) {
				String sentencia = "SELECT POBLACION FROM POBLACION";
				
				table = conect.createStatement();
				
				tables = table.executeQuery(sentencia);
				
				while (tables.next()) {
					System.out.println(tables.getString(1));
				}
			} else if (x.equalsIgnoreCase("CODIGO")){
				
				String sentencia = "SELECT POSTAL_CODE FROM POBLACION";
				
				table = conect.createStatement();
				
				tables = table.executeQuery(sentencia);
				
				while (tables.next()) {
					System.out.println(tables.getString(1));
				}
			} else {
				
				System.out.println("valores no existentes en la tabla, verifique e intente nuevamente");
				
			}
				conect.close();
			
			
		} catch (Exception e) {
			System.out.println("no ha sido posible");
		}
	}
	
	// método para eliminar a la poblacion
	
	public void eliminaPoblacion (String eli, boolean resp) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			//String sentencia = " DELETE FROM POBLACION WHERE POSTAL_CODE = ?";
			
			//prova = conect.prepareStatement(sentencia);
			
			if ((this.comproba == true) && (resp == true)) {
				
				//if (respuesta.equalsIgnoreCase("y")) {
					String sentencia = " DELETE FROM POBLACION WHERE POSTAL_CODE = ?";

					prova = conect.prepareStatement(sentencia);
					
					prova.setString(1, eli);
					
					prova.executeUpdate();
					
					System.out.println("alumno eliminado");
					
			} else if (this.comproba == false)  {
				String sentencia = " DELETE FROM POBLACION WHERE POSTAL_CODE = ?";

				prova = conect.prepareStatement(sentencia);
				
				prova.setString(1, eli);
				
				prova.executeUpdate();
				
				System.out.println("alumno NO eliminado");
			} else {
				System.out.println("IMPOSIBLE ");
			}
			
		    conect.close();
		     
			
			} catch (Exception e) {
			
			System.out.println("no se ha podido eliminar");
		}
	}
								
	public void verificaCodigo (String eli) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
		
			String sentencia = " SELECT A.POSTAL_CODE FROM ALUMNE A JOIN POBLACION P ON (A.POSTAL_CODE = P.POSTAL_CODE)";
		
			table = conect.createStatement();
		
			tables = table.executeQuery(sentencia);
			
			while (tables.next()) {
			
				this.contador ++;
				
				System.out.println(tables.getString(1));
				
				//if (cont != 0) {
				this.comprob = tables.getString(1);
				if (this.comprob.equalsIgnoreCase(eli) && this.contador != 0) {
					this.comproba = true;
				} else  {
					this.comproba = false;
				//}
				}
			}
			conect.close();
			
		} catch (Exception e) {
			
		}

	}
	
	public int getContador () {
		return this.contador;
	}
	public String getVerificaCodigo () {
		return this.comprob;
	}

	public boolean getCodigoVerificado () {
		return this.comproba;
		
	}
	
}	
