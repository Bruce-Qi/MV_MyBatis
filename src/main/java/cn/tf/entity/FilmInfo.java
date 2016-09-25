package cn.tf.entity;

import java.io.Serializable;
import java.util.List;

public class FilmInfo implements Serializable{
	
	private Integer fileid;

	//private Integer typeID;
	
    private List<FilmType> filmType;

    private String filemname;

    private String actor;

    private String director;

    private double ticketprice;

	public Integer getFileid() {
		return fileid;
	}
	
	public Integer getFileids() {
		return fileid;
	}

	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}

	public List<FilmType> getFilmType() {
		return filmType;
	}

	public void setFilmType(List<FilmType> filmType) {
		this.filmType = filmType;
	}

	public String getFilemname() {
		return filemname;
	}

	public void setFilemname(String filemname) {
		this.filemname = filemname;
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

	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}

	public FilmInfo(Integer fileid, List<FilmType> filmType, String filemname,
			String actor, String director, double ticketprice) {
		super();
		this.fileid = fileid;
		this.filmType = filmType;
		this.filemname = filemname;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}

	public FilmInfo() {
		super();
	}

	@Override
	public String toString() {
		return "FilmInfo [fileid:" + fileid + ", filmType:" + filmType
				+ ", filemname:" + filemname + ", actor:" + actor
				+ ", director:" + director + ", ticketprice:" + ticketprice
				+ "]";
	}

	


}
