/**
 * 
 */
package io.github.angelcaordev.diary.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author angel
 *
 */
public class Conexion {
	
	public static Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			
			
			
			String url = "jdbc:sqlite:diary.db";
			
			try {
				con = DriverManager.getConnection(url);
				if(con!=null) {
					System.out.println("Conectado");
					Statement st = con.createStatement();
					
					try {
						//st.executeUpdate("DROP TABLE IF EXISTS nota");
						st.executeUpdate("CREATE TABLE IF NOT EXISTS nota(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, description TEXT, level INTEGER, dateN TEXT, dateR TEXT)");
					}catch(SQLException e) {
						System.out.println("Error al crear la tabla: "+ e.getMessage());
					}finally {
						
						st.close();
					}
					
					
					
				}else {
					System.out.println("No se ha podido realizar la conexión");
				}
				
				
			}catch(SQLException e) {
				System.out.println("Error en la conexión: "+ e.getMessage());
				
			}
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("Error en la carga de la classe Class.ForName: " + e.getMessage());
		}
		
		
		return con;
		
	}

}
