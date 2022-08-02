package exceptionHandling;



public class ExceptionProgram {
public static void main(String[] args) {
	System.out.println(20.56);
	System.out.println("sodif"+45+23);
	System.out.println(25+89+"sdfd");
	try{System.out.println(24/0);}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Program");
	}
	System.out.println(45);
	System.out.println(7895);
}
}