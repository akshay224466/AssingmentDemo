package springcore;

public class HelloBean {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Hello() {
		System.out.println("Hello_World" +this.name);
	}
	

}
