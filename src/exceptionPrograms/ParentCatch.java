package exceptionPrograms;

public class ParentCatch {
	public static void main(String[] args) {
		ParentCatch p= new ParentCatch();
		p.name();
	}
	public void name() {
		try {
			String s="";
			System.out.println(45+89);
			System.out.println(s.charAt(20));
			
			
		}
		catch(ArithmeticException a){//Child
			// we have to declare Child catch before parent catch
			System.out.println("child");
			a.printStackTrace();
		}
		catch(Exception e) {//Parent
			e.printStackTrace();
			System.out.println("parent");
		}
		finally {
			System.out.println("Program Executed");
		}
	
	}
}
