/**
 * 
 */
package io.github.angelcaordev.diary.controller;

import java.util.ArrayList;
import java.util.List;

import io.github.angelcaordev.diary.dao.Idao;
import io.github.angelcaordev.diary.dao.NoteDao;
import io.github.angelcaordev.diary.model.Note;
import io.github.angelcaordev.diary.view.ViewNote;

/**
 * @author angel
 *
 */
public class ControllerNote {
	
	private ViewNote vista = new ViewNote();
	
	public ControllerNote() {
		
	}
	
	public void registrar(Note nota) {
		Idao dao = new NoteDao();
		dao.insertar(nota);
	}
	
	
	public void modificar(int id ,Note nota) {
		Idao dao = new NoteDao();
		dao.modificar(id, nota);
	}
	
	public void eliminar(int i) {
		Idao dao = new NoteDao();
		dao.eliminar(i);
	}
	
	public void verNotas() {
		
		List<Note> lista = new ArrayList<Note>();
		Idao dao = new NoteDao();
		lista = dao.listar();
		vista.verTodo(lista);
		
	};
	

}
