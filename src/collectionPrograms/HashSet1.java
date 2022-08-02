package collectionPrograms;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet1 p= new HashSet1();
	p.name();
	
}
public void name() {
	HashSet a= new HashSet();
	a.add(10);
	a.add(null);
	a.add(78);
	a.add(45.56);
	a.add(null);
	System.out.println(a);
}
}
