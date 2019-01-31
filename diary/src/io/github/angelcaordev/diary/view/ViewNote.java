package io.github.angelcaordev.diary.view;

import java.util.List;

import io.github.angelcaordev.diary.model.Note;

public class ViewNote {
	
	public void verNota(Note nota) {
		System.out.println("NOTA: "+ nota);
	}
	
	public void verTodo(List<Note> lista) {
		for(Note note : lista) {
			System.out.println("NOTA : " + note);
		}
			
	}

}
