package bag;

public class class3 {

	public static void main(String[] args) {
		class3 lamp = new class3();
		lamp.fine();
		class3.hire();
		lamp.road();
		class3.plane();
		
	}
public String fine() {
String a = "My course name is automation.";
System.out.println(a);
return a;

}
public static String hire() {
System.out.println("Can you hire me please?");
return "Can you hire me please?";	
	
}	
public String road() {
String a = "I feel sick today from ";
System.out.println(a+"6 pm.");
return a;
}	
public static String plane() {
String a = "My value is ";
System.out.println(a+"1000.");
return a;
}	
	
}
