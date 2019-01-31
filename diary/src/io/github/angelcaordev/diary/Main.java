package io.github.angelcaordev.diary;

import io.github.angelcaordev.diary.controller.ControllerNote;
import io.github.angelcaordev.diary.model.Note;


/**
 * @author angelcaordev
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Everything was OK");
		
		//Creamos varios objetos Note
		Note notaUno = new Note("titulo1", "descripcion1",9,"31/01/19","31/01/19");
		Note notaDos = new Note("titulo2", "descripcion2",9,"31/01/19","31/01/19");
		Note notaTres = new Note("titulo13","descripcion13",10,"13/03/1985", "31/01/19");
		
		//Creamos un objeto Controlador
		ControllerNote controller = new ControllerNote();
		
		//Guardamos los objetos creados en la base de datos
		//controller.registrar(notaUno);
		//controller.registrar(notaDos);
		
		//Modificamos uno de los objetos 
		controller.modificar(5, notaTres);
		
		//Eliminamos las notas deseadas
		controller.eliminar(10);
		
		//Visualizamos todas las notas 		
		controller.verNotas();

	}

}
