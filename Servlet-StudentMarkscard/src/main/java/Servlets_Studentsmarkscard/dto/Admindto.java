package Servlets_Studentsmarkscard.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admindto {
	@Id
	private int usn;
	private String Student_Name;
	private String Fathername;
	private String Gender;
	private int Physics;
	private int Chemistry;
	private int Mathematics;
	private int Statistics;
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getChemistry() {
		return Chemistry;
	}
	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getStatistics() {
		return Statistics;
	}
	public void setStatistics(int statistics) {
		Statistics = statistics;
	}
	@Override
	public String toString() {
		return "Admindto [usn=" + usn + ", Student_Name=" + Student_Name + ", Fathername=" + Fathername + ", Gender="
				+ Gender + ", Physics=" + Physics + ", Chemistry=" + Chemistry + ", Mathematics=" + Mathematics
				+ ", Statistics=" + Statistics + "]";
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	
	

}
