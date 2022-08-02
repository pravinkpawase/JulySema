package string;

public class Pallindrome {
public static void main(String[] args) {
	String p= new String("madgam");
	StringBuilder pp= new StringBuilder(p);
	StringBuilder a= pp.reverse();
	String q=a.toString();
	if(p.equals(q)) {
		System.out.println("String is Pallindrome");
	}
	else {
		System.out.println("String is not Pallindrome");
	}
	
}
}
