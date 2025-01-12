package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JStudents {
	@Id
	private int id;
	private String name;
	private String course;
	
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "JStudents [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
