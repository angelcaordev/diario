/**
 * 
 */
package io.github.angelcaordev.diary.dao;

import java.util.List;

import io.github.angelcaordev.diary.model.Note;

/**
 * @author angel
 *
 */
public interface Idao{
	List<Note> listar();
	void insertar(Note nota);
	void modificar(int id, Note nota);
	void eliminar(int id);
	
}
