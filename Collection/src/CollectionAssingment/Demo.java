package CollectionAssingment;

public class Demo {

	long pNo;
	String name;
	String email;
	String gender;
	
	public Demo(long pNo, String name, String email, String gender) {
		super();
		this.pNo = pNo;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[Number=" + pNo + ", Name=" + name + ", Email=" + email + ", Gender=" + gender + "]" + "\n";
	}
	
	
}
