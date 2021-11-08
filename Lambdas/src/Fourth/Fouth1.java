package Fourth;

import java.util.ArrayList;

public class Fouth1 {
	

    public static void main(String[] args)
    {
        ArrayList<Integer> students = new ArrayList<Integer>();

        students.add(21);
        students.add(54);
        students.add(98);
        students.add(35);
        students.add(90);
        students.removeIf(n -> (n %2!=0));
        
        System.out.println("Students name with odd lengths is removed");
        for (int i: students) {
            System.out.println(i);
        }
    }

}
