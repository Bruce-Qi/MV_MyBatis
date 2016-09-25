package cn.tf.entity;

import java.io.Serializable;
import java.util.List;

public class FilmInfo implements Serializable{
	
	private Integer fileID;

	private Integer typeID;
	
    private FilmType filmType;

    private String filemName;

    private String actor;

    private String director;

    private double ticketPrice;

	public Integer getFileID() {
		return fileID;
	}

	public Integer getFileIDs() {
		return fileID;
	}
	public void setFileID(Integer fileID) {
		this.fileID = fileID;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public FilmType getFilmType() {
		return filmType;
	}

	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}

	public String getFilemName() {
		return filemName;
	}

	public void setFilemName(String filemName) {
		this.filemName = filemName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public FilmInfo(Integer fileID, Integer typeID, FilmType filmType,
			String filemName, String actor, String director, double ticketPrice) {
		super();
		this.fileID = fileID;
		this.typeID = typeID;
		this.filmType = filmType;
		this.filemName = filemName;
		this.actor = actor;
		this.director = director;
		this.ticketPrice = ticketPrice;
	}

	public FilmInfo() {
		super();
	}

	@Override
	public String toString() {
		return "FilmInfo [fileID=" + fileID + ", typeID=" + typeID
				+ ", filmType=" + filmType + ", filemName=" + filemName
				+ ", actor=" + actor + ", director=" + director
				+ ", ticketPrice=" + ticketPrice + "]";
	}


}
