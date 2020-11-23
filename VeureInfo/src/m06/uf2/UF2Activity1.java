package m06.uf2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UF2Activity1 {

	public static void main(String[] args) {
		/*Connection con = null; // objeto
		
		String url = "http://localhost/phpmyadmin/tbl_sql.php?db=alumnes";
		
		String user = "root";
		String password = "";
		
		System.out.println("provaDeConnexio()");
		
		/*try {
			
			Driver driver = DriverManager.getDriver(url);
			
			Properties properties = new Properties();
			properties.setProperty("user", user);
			properties.setProperty("password", password);
			
			con = driver.connect(url, properties);
			System.out.println("conexion realizada mediante DriverConection");
			con.close();
		}
		catch (SQLException ex) {
			System.out.println("Error " + ex.getMessage());
		}*/
		
		System.out.println(" MySQL JDBC ");
		
		try {//"com.mysql.sj.jdbc.Driver"
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado controlador ALUMNES ");
			return;
		}
		
		System.out.println("MySQL JDBC Driver registered");
		Connection connection = null;
		
		try {																	// se inserta directamente la base de datos de alumnes, junto a un nuevo usuario creado		
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

}
