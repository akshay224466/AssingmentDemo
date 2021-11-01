package Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p1=new FilePersistence();
		Persistence p2=new  DatabasePersistence();
		
		p1.persist();
		p2.persist();
	}

}
