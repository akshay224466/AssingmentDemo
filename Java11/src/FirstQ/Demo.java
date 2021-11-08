package FirstQ;
public class Demo {
	public static void main(String[] args) {
		var P=250000;
		var R=5;
		var T=2;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(P, R, T));
	}

}

interface CalculateSI{
	double sI(double P,double R,double T);
}

