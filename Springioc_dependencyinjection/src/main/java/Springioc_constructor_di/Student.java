package Springioc_constructor_di;

public class Student {
	private int id;
	private String student_name;
	private String school_name;
	private String address;
	
	
	public Student(int id, String student_name, String school_name, String address) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.school_name = school_name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", student_name=" + student_name + ", school_name=" + school_name + ", address="
				+ address + "]";
	}
	
	
	

}
