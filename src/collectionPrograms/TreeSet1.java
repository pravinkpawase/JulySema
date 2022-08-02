package collectionPrograms;

import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet1 p= new TreeSet1();
	p.name();
}
public void name() {
	TreeSet a= new TreeSet();
	a.add('a');
	a.add('A');
	a.add('j');
	a.add('u');
	a.add('p');
	a.add('P');
	a.add('5');
	a.add('5');
	a.add('@');
	a.add('K');
	System.out.println(a);
	System.out.println(a.pollFirst());
	System.out.println(a.pollLast());
}
}
