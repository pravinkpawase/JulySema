package collectionPrograms;

import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList1 p= new LinkedList1();
	p.name();
	
}
public void name() {
	LinkedList a=new LinkedList();
	a.add("Shubham");
	a.add(12);
	a.add(21.22);
	a.add(45);
	a.add(null);
	a.add('P');
	a.add(7894.56); 
	a.add(null);
	System.out.println(a);
	a.remove(6);

	System.out.println(a);
	
}
}

