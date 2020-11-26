package m06.uf2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.GregorianCalendar;

public class MySQLFirts {
	
	Connection conect = null;
	PreparedStatement prova = null;
	
	private String nombre;
	private String dni;
	private int fecha;
	private String postalDireccion;
	private String sexo;
	private int postalCode;
	private String poblacion;
	


	public MySQLFirts (String name, String ident, int agno, String direct, String sex, int postal, String pobla) {
		
		nombre = name;
		dni = ident;
		fecha = agno;
		postalDireccion = direct;
		sexo = sex;
		postalCode = postal;
		poblacion = pobla;
		
	}
	




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
	
	public void conected () {
		
		try {
			
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnes", "alumne", "alumne");
			
			String sentencia = "INSERT INTO ALUMNE (NOM, DNI, NACIMIENTO, POSTAL_DIRECTION, SEX, POSTAL_CODE, POBLACION) VALUES (?,?,?,?,?,?,?)";
			
			prova = conect.prepareStatement(sentencia);
			
			prova.setString(1, this.nombre);
			prova.setString(2, this.dni);
			prova.setInt(3, this.fecha);
			prova.setString(4, this.postalDireccion);
			prova.setString(5, this.sexo);
			prova.setInt(6, this.postalCode);
			prova.setString(7, this.poblacion);
			
			prova.executeUpdate();
			
			
			System.out.println(" CONEXION REALIZADA !!!");
			
			
		} catch (Exception e) {
			System.out.println(" NO REALIZADA");
		}
	}
	
}