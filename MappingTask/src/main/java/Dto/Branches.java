package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Branches {
    @Id
	private int branchid;
	private String branchname;
	
	
	
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public String toString() {
		return "Branches [branchid=" + branchid + ", branchname=" + branchname + "]";
	}
	
	@ManyToOne
	private Qspiders q;
	
	@ManyToOne
	private Jspiders j;
}
