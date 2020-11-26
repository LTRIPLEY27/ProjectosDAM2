package m06.uf2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

/*
 * 
 */
public class MySQLFirts {  // construccion en objetos
	
	private Connection con = null;
	private java.sql.Statement stament = null;
	private ResultSet result = null;   // Interfaz para verificar datos sql, adem#as de proveer multitud de m�todos para la consulta de las tablas
	private String respuesta;
	private String name;
	private String dni;
	private Date nacimiento;
	private String postalAdress;
	private String sex;
	private int postalCode;
	private String poblation;

	
	// m�todo con excepcion para lograr la conexion de la base de datos.
	//public static void main(String[] args) {	//Connection con = null; // objeto
	
	
	public void  connected (String nom, String dni, String adresa, int postal, String pob) {	  // m�todo para conectar el atributo con con la base de datos
		// se crea la conexion
		
		try {
			
			//String consulta = "INSERT INTO ALUMNE (NOM, DNI, DATA_NAIXEMEN, ADRESA_POSTAL, SEXE, CODI_POSTAL, POBLACION)" + "VALUES ('GEOFREY', '456678J', '1989-11-11', 'CATALUNYA', 'DONNA', 43204, 'TARRAGONA')";
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			stament = con.createStatement();
			
			stament.execute("INSERT INTO ALUMNE (NOM, DNI, DATA_NAIXEMEN, ADRESA_POSTAL, SEXE, CODI_POSTAL, POBLACION)" + "VALUES ( nom + dni + nacimiento + adresa  + postal + pob )"); 
			
			System.out.println("EXITOSA");
			
		
		} catch (SQLException e) {
			System.out.println(" NO EXITOSA");
			e.printStackTrace();
		}
		
	}
	
	// m�todo para editar la tabla
	public void edita() {
	
		try {
			
			//String consulta = "INSERT INTO ALUMNE (NOM, DNI, DATA_NAIXEMEN, ADRESA_POSTAL, SEXE, CODI_POSTAL, POBLACION)" + "VALUES ('GEOFREY', '456678J', '1989-11-11', 'CATALUNYA', 'DONNA', 43204, 'TARRAGONA')";
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			stament = con.createStatement();
			
			stament.execute("UPDATE ALUMNE SET NOM = 'hugh' where ADRESA_POSTAL = 'CATALUNYA'");
			
			System.out.println("EXITOSA");
			
		
		} catch (SQLException e) {
			System.out.println(" NO EXITOSA");
			e.printStackTrace();
		}
	}	
	
	
	public void elimina() {
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			stament = con.createStatement();
			
			stament.execute("DELETE FROM ALUMNE " );
			
			
		} catch (SQLException e) {
			System.out.println( " No exitosa");
			e.printStackTrace();
		}
	}
	
	
	public void creaTabla() {
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
		
			stament = con.createStatement();
			
			stament.execute(" CREATE TABLE ");
			
			
		} catch (SQLException e) {
			System.out.println("no exitosa");
		}
	}
	
	public void getDate (int any, int mes, int dia) {   // adhiero la subclase Gregorian calendar con sus 3 parametros necesarios para obtener la fecha en el formato correcto de la tabla
		
		GregorianCalendar fecha = new GregorianCalendar (any, mes, dia);
		
		nacimiento = fecha.getTime();
		
	}
	
	public Date getNacimiento () {
		return nacimiento;
		
	}
	
	
	//public 
		
		//java.sql.Statement inserta = null;  // objeto de la clase Statement
		// no me permite instanciar Statement sin esa declinacion de java. previa
		
		//java.sql.Statement modifica = null;
		
		//java.sql.Statement elimina = null;
		
		
		
		
						// paquete de la clase Driver
		//String url = "jdbc:mysql://localhost:3306/alumnes"; // imprescindible REALIZAR BIEN EL DIRECCIONAMIENTO
		
		//String user = "root";  // variable para usuario root
		//String password = "";
		
		//System.out.println("provaDeConnexio()");
		
/*public void  connected () {
	
		
		try {  // 
			
			Driver driver = DriverManager.getDriver(url);  // instanciacion del objeto tipo Driver, la url de la String se le adjunta
			// driver siempre se ha de importar desde Properties
			Properties properties = new Properties();  // instanciacion del objeto properties, del tipo Properties
			properties.setProperty("user", user);  // setter de la instancia properties con dos par�metros (user creado en la variable String)
			properties.setProperty("password", password);  // setter de la variable password
			 
			con = driver.connect(url, properties);  // instanciacion del Objeto Connection (definida fuera de la excepcion) con el m�todo de la clase driver (url y properties)
			System.out.println("conexion realizada mediante DriverConection");
			
			/*boolean eleccion = false;
			int opcion;
			String nom,dni,postal, sex, poblation ;
			//Date date;
			int postalcode;
			
			Scanner ask = new Scanner (System.in);
			
			System.out.println("ingrese la opcion de su preferencia: " + '\n' + 
					"desea insertar alumno (1)" + '\n' + " desea modificar alumno " + '\n' +
					"desea eliminar alumno  (3)" + '\n' + "modificar poblacion (4)");
			opcion = ask.nextInt();
			
			//while (eleccion) {
				
				
				switch (opcion) {
				case 1:
					inserta = con.createStatement(); 
					System.out.println("Desea insertar algun alumno, por favor indique los par�metros en orden a insertar " );
					System.out.println("Nombre");
					nom = ask.next();
					inserta.execute("INSERT INTO ALUMNE (NOM,)" + "VALUES (nom)");
					System.out.println("DNI");
					dni = ask.next();
					System.out.println("Fecha de Nacimiento");
					//date = ask.next();
					//System.out.println("Direccion Postal");
					//postal = ask.next();
					System.out.println("Sexo");
					sex = ask.next();
					System.out.println("Poblacion");
					poblation = ask.next();
					System.out.println("Codigo Postal");
					postalcode = ask.nextInt();
					
					// m�todo de la clase objeto CONECTION para crear una insercion en la base de datos
					   //
					//inserta.execute("INSERT INTO ALUMNE (NOM, DNI, DATA_NAIXEMEN, ADRESA_POSTAL, SEXE, CODI_POSTAL, POBLACION)" + "VALUES ('nom', dni, '1989-11-11', 'zaragoza', sex, postalcode, poblation)");
					
					break;
				}

			*/
			
			//}
			// m�todo de la clase objeto CONECTION para crear una insercion en la base de datos
			//inserta = con.createStatement();    //
			//inserta.execute("INSERT INTO ALUMNE (NOM, DNI, DATA_NAIXEMEN, ADRESA_POSTAL, SEXE, CODI_POSTAL, POBLACION)" + "VALUES ('GEOFREY', '456678J', '1989-11-11', 'CATALUNYA', 'DONNA', 43204, 'TARRAGONA')");
			
			//modifica = con.createStatement();
			//modifica.execute("UPDATE ALUMNE SET NOM = 'hugh' where ADRESA_POSTAL = 'CATALUNYA'" );
			
			//elimina = con.createStatement();
			//elimina.execute("DELETE FROM ALUMNE WHERE NOM = 'GEOFREY'");
			//con.close();  // cierre del flujo 
		//}
		//catch (SQLException ex) {
			//System.out.println("Error " + ex.getMessage());
	//	}
		
	}
	


/*System.out.println(" MySQL JDBC ");

try {//"com.mysql.sj.jdbc.Driver"
	Class.forName("com.mysql.jdbc.Driver");
}
catch (ClassNotFoundException e) {
	System.out.println("No se ha encontrado controlador ALUMNES ");
	return;
}

System.out.println("MySQL JDBC Driver registered");
Connection connection = null;

try {	// metodo get conection hay que pasarle 3 parametros (nombre base de datos, usuario	y clave de la base de datos creada)															// se inserta directamente la base de datos de alumnes, junto a un nuevo usuario creado		
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
	System.out.println("Conexion realizada mediante DriverManager");
	
	}
catch (SQLException ex) {
	System.out.println("Error " + ex.getMessage());
	return;
} finally {
	try
	{
		if (connection != null)
			connection.close();
		System.out.println("conexion cerrada");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}

}*/