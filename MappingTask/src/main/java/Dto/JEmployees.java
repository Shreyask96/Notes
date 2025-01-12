package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JEmployees {
	@Id
	private int id;
	private String name;
	private String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "JEmployees [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
	

}
