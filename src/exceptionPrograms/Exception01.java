package exceptionPrograms;

public class Exception01 {
public static void main(String[] args) {
	Exception01 p= new Exception01();
	p.name();
}
public void name() {
	String a=" ";
	System.out.println(a.length());
	System.out.println(a.charAt(0));
	System.out.println(a.replace(" ","_"));
	System.out.println(a.charAt(2));
}
}
