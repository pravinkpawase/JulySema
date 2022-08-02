package exceptionPrograms;

public class ExceptionFinally {
public static void main(String[] args) {
	ExceptionFinally p= new ExceptionFinally();
	p.name();
}
public void name() {
	try {
		System.out.println( 42);
		System.out.println(78/0);
	}
	finally {
		System.out.println("We can use try finally block "
				+ "also but exception will not Handled");
	}
	System.out.println("Program Executed and Exception Handled");//not Executed
}
}
