package stringProgram;

public class StringMethods {
	public static void main(String[] args) {
		StringMethods p= new StringMethods();
		p.name();
	}
	public void name() {
		String a="Manual Testing";
		String b="manual Testing";
		String c=new String("Manual Testing");	
		String d =new String("manual Testing");
		String e=new String(" Manual Testing");
		System.out.println(a.isEmpty());
		System.out.println(a.isBlank());
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(d.replace('M','A'));
		System.out.println(c.replaceAll("Manual", "Automation"));
		System.out.println(d.replace(' ', '_'));
		System.out.println(a.equals(c));
		System.out.println(a==c);
		System.out.println(a.equalsIgnoreCase(d));
		System.out.println(b.charAt(5));//Index Always Start With Zero
		System.out.println(a.indexOf('a'));
		System.out.println(b.lastIndexOf('a'));
		System.out.println(a.concat(d));
		System.out.println(b.concat(" Automation Testing"));
		System.out.println(e.trim());
		System.out.println(a.substring(4));
		System.out.println(a.substring(4,8));
		System.out.println(a.startsWith("Ma"));
		System.out.println(a.endsWith("ng"));
	}
}
