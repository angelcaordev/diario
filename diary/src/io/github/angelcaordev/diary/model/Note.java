package io.github.angelcaordev.diary.model;

import java.util.Date;

public class Note {
	
	
	String title, description, fechaN, fechaR;
	Date dateN, dateR;
	int id, level;
	

	/**
	 * @param title
	 * @param description
	 * @param dateN
	 * @param dateR
	 * @param id
	 * @param level
	 */
	public Note(String title, String description, Date dateN, Date dateR, int id, int level) {
		super();
		this.title = title;
		this.description = description;
		this.dateN = dateN;
		this.dateR = dateR;
		this.id = id;
		this.level = level;
	}
	
	public Note() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param title
	 * @param description
	 * @param fechaN
	 * @param fechaR
	 * @param level
	 */
	public Note(String title, String description, int level, String fechaN, String fechaR) {
		super();
		this.title = title;
		this.description = description;
		this.fechaN = fechaN;
		this.fechaR = fechaR;
		this.level = level;
	}

	public String getFechaN() {
		return fechaN;
	}

	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}

	public String getFechaR() {
		return fechaR;
	}

	public void setFechaR(String fechaR) {
		this.fechaR = fechaR;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateN() {
		return dateN;
	}

	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	public Date getDateR() {
		return dateR;
	}

	public void setDateR(Date dateR) {
		this.dateR = dateR;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return this.id + " => " + this.title + " - " + this.description + " - " + this.level + " - "  + this.fechaN + " - "  + this.fechaR; 
		
	}

}
