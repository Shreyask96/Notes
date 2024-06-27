package Springioc_setter_di;

public class Patient {
	private int pat_id;
	private String pat_name;
	@Override
	public String toString() {
		return "Patient [pat_id=" + pat_id + ", pat_name=" + pat_name + "]";
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public String getPat_name() {
		return pat_name;
	}
	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}

}
