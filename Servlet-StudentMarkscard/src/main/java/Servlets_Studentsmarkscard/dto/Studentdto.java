package Servlets_Studentsmarkscard.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentdto {
	@Id
	private int Usn;
	private Long Password;
	public int getUsn() {
		return Usn;
	}
	public void setUsn(int usn) {
		Usn = usn;
	}
	public Long getPassword() {
		return Password;
	}
	public void setPassword(Long password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Studentdto [Usn=" + Usn + ", Password=" + Password + "]";
	}
	
	
	

}
