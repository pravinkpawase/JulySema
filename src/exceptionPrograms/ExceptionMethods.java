package exceptionPrograms;

public class ExceptionMethods {
	public static void main(String[] args) {
		ExceptionMethods p= new ExceptionMethods();
		p.name();
	}
	public void name() {

		try {
			System.out.println(45/0);
		}
		catch(Exception a) {

			a.printStackTrace();//ExceptionName Description StackTrace
			//StackTrace:packageName ClassName MethodName line
			System.out.println("----------------------"
					+ "--------------------------------");
			System.out.println(a);//ExceptionName Description
			System.out.println("--------------------------"
					+ "----------------------------");
			System.out.println(a.getMessage());//ExceptionName
			System.out.println("--------------------------"
					+ "---------------------------");

		}
		finally {
			System.out.println("Program Executed");
		}
		System.out.println("Exception Handled");
	}
}
