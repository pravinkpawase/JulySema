package collectionPrograms;

import java.util.ArrayList;

public class ArrayList1 {


	public static void main(String[] args) {
		ArrayList1 p= new ArrayList1();
		p.name();
	}
	public void name() {
		ArrayList a= new ArrayList();
		a.add(55);
		a.add("PRATIK");
		a.add(25.22);
		a.add(8546);
		a.add('P');
		a.add(null);
		a.add("List");
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(0));
		a.set(4, "Pawase");
		System.out.println(a);
		System.out.println(a.isEmpty());
		a.set(1, 5689);
		System.out.println(a);
		a.remove(7);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}
}



