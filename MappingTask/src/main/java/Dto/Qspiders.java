package Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Qspiders {
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
		return "Qspiders [id=" + id + ", bname=" + bname + "]";
	}

	@OneToMany
	private List<QTrainers> t;
	
	@OneToMany
	private List<QEmployees> e;
	
	@OneToMany
	private List<QStudents> s;
	
	
	
	
}
