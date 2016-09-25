package cn.tf.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class FilmType implements Serializable{
	
    private Integer typeid;

    private String typename;

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public FilmType(Integer typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}

	public FilmType() {
		super();
	}

	@Override
	public String toString() {
		return "filmType [typeid:" + typeid + ", typename:" + typename + "]";
	}
    
    
	

}
