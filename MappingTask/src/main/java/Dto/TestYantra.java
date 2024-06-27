package Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TestYantra {
	@Id
	private String Gst;
	private String Cname;
	
	@OneToMany
	private List<Branches> b;
	
	
	
	public String getGst() {
		return Gst;
	}
	public void setGst(String gst) {
		Gst = gst;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "TestYantra [Gst=" + Gst + ", Cname=" + Cname + "]";
	}
}
