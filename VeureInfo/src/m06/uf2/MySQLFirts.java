package m06.uf2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;

public class MySQLFirts {
	
	Connection conect = null;
	PreparedStatement prova = null;
	ResultSet tables = null;  // interfaz para verificar la tabla
	Statement table = null;   // Statement de la tabla
	
	private String nombre;   // atributos de la tabla
	private String dni;
	private String fecha;
	private String postalDireccion;
	private String sexo;
	private String postalCode;
	private String poblacion;
	

// constructor
	public MySQLFirts (String name, String ident, String agno, String direct, String sex, String postal, String pobla) {
		
		nombre = name;
		dni = ident;
		fecha = agno;
		postalDireccion = direct;
		sexo = sex;
		postalCode = postal;
		poblacion = pobla;
		
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

	
	public String getPoblacion() {
		return poblacion;
	}



	public void setPoblacion(String pobla) {
		this.poblacion = pobla;
	}
	
	
	// método insertar en la tabla
	public void metodoInsertar() {
		
		try {
			
			// clase mysql para controlar la base de datos
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			// variable a usar en la clase connection con la sentencia que se desee agregar
			String sentencia = "INSERT INTO ALUMNE (NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION) VALUES (?,?,?,?,?,?,?)";
			// instancia de la clase PreparedStatement para dinamizar la tabla de la base de datos (IMPERATIVO SI SE VA A EDITAR O AGREGAR VALORES A LA MISMA)
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, this.nombre);  // edición de la tabla mediante los métodos del PreparedStatment
			prova.setString(2, this.dni);
			prova.setString(3, this.fecha);
			prova.setString(4, this.postalDireccion);
			prova.setString(5, this.sexo);
			prova.setString(6, this.postalCode);
			prova.setString(7, this.poblacion);
			
			prova.executeUpdate();  // sentencia para modificar a la tabla luego de todos los valores pertinentes
			
			
			System.out.println(" CONEXION REALIZADA !!!");
			
			
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
				System.out.print(" POBLACION : " + tables.getString(7));
				
				System.out.println(" ");
			}
			
			
			
		} catch (Exception e) {
			
			System.out.println(" error en la tabla a mostrar");
		}
	}
	
	
	// método para modificar datos en lab tabla
	
	public void metodoModificar(String eleccion, String valor, String nuevoValor, String modifica) {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
				
			if (eleccion.equalsIgnoreCase("NOMBRE")) {
				//this.nombre = nuevoValor;
				//String vieja = valor;
				String sentencia = "UPDATE ALUMNE SET NOM = ? WHERE NOM = ?;";
				
				prova = conect.prepareStatement(sentencia);
				this.nombre = nuevoValor;
				
				prova.setString(1, valor);
				prova.setString(2, this.nombre);
				
				//prova.setString(3, this.nombre);
				
				prova.executeUpdate();
				
				System.out.println("SENTENCIA REALIZADA");
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
			else if (column.equalsIgnoreCase("poblacion")) {
				String sentencia = "DELETE FROM ALUMNE WHERE POBLATION = ?;";
				prova = conect.prepareStatement(sentencia);
				this.poblacion = elemento;
				prova.setString(7, this.poblacion);
				prova.executeUpdate();
				System.out.println(" elemento eliminado");
	
		} else {
			System.out.println(" elemento no eliminado o inexistente, vuelva a intentarlo");
		}
		
			conect.close();
	} catch (Exception e) {
		System.out.println(" no se ha podido eliminar el elmento");
		}
	}



public void metodoVerificaElemento (String elem) {
	
	try {
		
		conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
		
		String sentencia = "SELECT NOM FROM ALUMNE WHERE DNI = ?";
		
		prova = conect.prepareStatement(sentencia);
		
		prova.setString(1, elem);
		
		tables = prova.executeQuery();
		
		while (tables.next()) {
			
			System.out.println(tables.getString(1));
		}
		
		
	} catch (Exception e) {
		System.out.println("consulta no realizada");
		}
	}

}	
