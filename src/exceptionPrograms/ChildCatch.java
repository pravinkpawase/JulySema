package exceptionPrograms;

public class ChildCatch {
	public static void main(String[] args) {
		ChildCatch p= new ChildCatch();
		p.name();
	}
	public void name() {
		try {
			
			System.out.println(45+89);
			System.out.println(42/2);
			System.out.println(56/0);
		}
		catch(ArithmeticException a){//Child
			// we have to declare Child catch before parent catch
			a.printStackTrace();
			System.out.println("child");
		}
		catch(Exception e) {//Parent
			e.printStackTrace();
			System.out.println("parent");
		}
	System.out.println("Exception Handled");//Executed
	}
}
