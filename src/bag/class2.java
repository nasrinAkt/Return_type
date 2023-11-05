package bag;

public class class2 {

	public static void main(String[] args) {
		class2 tina = new class2 ();
		tina.nick();
		class2.ball();
		tina.football();
		class2.lodo();
		
	}
public double nick() {
 double a = 50.50;
 double b = 60.50;
 double c = a+b;
 System.out.println(c);
 return c;
	
}
public static double ball() {
double a = 100.99;
System.out.println(a);
return a;
}	
public double football() {
double a = 55.50;
double b = 45.50;
System.out.println(a+b);
return a+b;
}	
public static double lodo() {
double a = 45.99;
double b = 54.99;
System.out.println("This is my value " +a+b);
return a+b;
}	
	
	
}
