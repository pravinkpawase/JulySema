package stringProgram;

public class StringMethod {
	public static void main(String[] args) {
		StringMethod p= new StringMethod();
		p.name();
	}
	public void name() {
	int p=50;
	int q=50;
	String a="Automation";
	String b="Automation";
	String x="autoMation";
	String c=new String("Automation");
	String d= new String("Automation");
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(c==d);
	System.out.println(a==d);
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(c.equals(d));
	System.out.println(a.equals(c));
	System.out.println(p==q);
	System.out.println(a.equals("Automation"));
	System.out.println(a==("Automation"));
	System.out.println(x.equals(d));
	System.out.println(a.equalsIgnoreCase(d));
	}
}
