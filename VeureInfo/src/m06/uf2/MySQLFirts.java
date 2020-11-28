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
	private int fecha;
	private String postalDireccion;
	private String sexo;
	private int postalCode;
	private String poblacion;
	

// constructor
	public MySQLFirts (String name, String ident, int agno, String direct, String sex, int postal, String pobla) {
		
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
	
	public void setFecha (int agno) {
				
		this.fecha = agno;
		
	}
	
	public int getFecha () {
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
	
	public int getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(int postal) {
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
			prova.setInt(3, this.fecha);
			prova.setString(4, this.postalDireccion);
			prova.setString(5, this.sexo);
			prova.setInt(6, this.postalCode);
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
	
	
	// método para modificar datos en la tabla
	public void metodoModificar() {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			String sentencia = ("UPDATE ");
			
			prova = conect.prepareStatement(sentencia);
			
			
		
		} catch (Exception e) {
			System.out.println(" no se ha logrado modificar la tabla");
		}
	}
	
}