/**
 * 
 */
package io.github.angelcaordev.diary.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import io.github.angelcaordev.diary.connection.Conexion;
import io.github.angelcaordev.diary.model.Note;

/**
 * @author angel
 *
 */
public class NoteDao implements Idao{

	List<Note> listaNote = new ArrayList<Note>();
	@Override
	public List listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM NOTA;";
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				Note n = new Note();
				n.setId(rs.getInt(1));
				n.setTitle(rs.getString("title"));
				n.setDescription(rs.getString(3));
				n.setLevel(rs.getInt(4));
				n.setFechaN(rs.getString(5));
				n.setFechaR(rs.getString(6));
				
				listaNote.add(n);
			}
			rs.close();
			stm.close();
			con.close();
			
		}catch(SQLException e) {
			System.out.println("Error desde el método listar de la clase NoteDao:" + e.getMessage());
		}
		
		return listaNote;
	}

	@Override
	public void insertar(Note nota) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		String sql = "INSERT INTO NOTA(title,description,level,dateN,dateR) VALUES('" + nota.getTitle() + "','" + nota.getDescription() + "','" + nota.getLevel() + "','" + nota.getFechaN() + "','" + nota.getFechaR() + "');";
		try {
			
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
			
		}catch(SQLException e) {
			System.out.println("Error al introducir los datos: " + e.getMessage());
		}
		
	}

	@Override
	public void modificar(int id, Note nota) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		String sql = "UPDATE NOTA SET title='"+ nota.getTitle() + "',description = '" + nota.getDescription() + "', level = '" + nota.getLevel() + "', dateN = '" + nota.getFechaN() + "', dateR = '" + nota.getFechaR() + "' WHERE id = '" + id + "';";
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.executeQuery(sql);
			stm.close();
			con.close();
			
		}catch(SQLException e) {
			System.out.println("Error desde el método modificat() NoteDao: " + e.getMessage());
		}
		
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stm = null;
		
		String sql= "DELETE FROM NOTA WHERE ID=" + id;
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
			
		}catch(SQLException e) {
			System.out.println("Error desde el método eliminar(); NoteDao" + e.getMessage());
		}
		
	}

}
