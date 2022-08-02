package collectionPrograms;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector1 p=new Vector1();
		p.name();
	}
	public void name() {
	Vector l=new Vector();
	l.add(45);
	l.add(55);
	l.add("Amar");
	l.add('P');
	l.add(null);
	l.add(42.88);
	l.add(null);
	l.add(78.89);
	System.out.println(l);
	}
	
}
