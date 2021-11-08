package Fourth;

import java.util.ArrayList;

public class Four {
	
	public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Ram");
        students.add("Akshay");
        students.add("taman");
        students.add("Aman");
        students.add("tia");
        students.removeIf(n -> (n.charAt(0) == 't'));
  
        System.out.println("Students name Does not start with t");
        for (String str : students) {
            System.out.println(str);
        }
    }

}
