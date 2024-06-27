package Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jspiders {
	@Id
	private int id;
	private String bname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Jspiders [id=" + id + ", bname=" + bname + "]";
	}
	
	
	@OneToMany
	private List<JTrainers> t;
	
	@OneToMany
	private List<JEmployees> e;
	
	@OneToMany
	private List<JStudents> s;

}
