package cn.tf.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class FilmType implements Serializable{
	
    private Integer typeID;

    private String typeName;


    	
    
	public Integer getTypeID() {
		return typeID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public FilmType() {
		super();
	}

	public FilmType(Integer typeID, String typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "FilmType [typeID=" + typeID + ", typeName=" + typeName + "]";
	}


}
