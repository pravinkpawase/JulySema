package collectionPrograms;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	LinkedHashSet1 p= new LinkedHashSet1();
	p.name();
}
public void name() {
	LinkedHashSet a= new LinkedHashSet();
	a.add('a');
	a.add('a');
	a.add(50);
	a.add(50);
	a.add(null);
	a.add(78.85);
	a.add(78.85);
	a.add(null);
	System.out.println(a);
}
}
