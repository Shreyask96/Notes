package Springioc_constructor_di;

public class Doctor {
	
	
	private String doc_name;
	private String hosp_name;
	private String address;
	private Long ph_no;
	
	
	
	
	public Doctor(String doc_name, String hosp_name, String address, Long ph_no) {
		System.out.println("object is created");
		this.doc_name = doc_name;
		this.hosp_name = hosp_name;
		this.address = address;
		this.ph_no = ph_no;
	}




	@Override
	public String toString() {
		return "Doctor [doc_name=" + doc_name + ", hosp_name=" + hosp_name + ", address=" + address + ", ph_no=" + ph_no
				+ "]";
	}
	
	

}
