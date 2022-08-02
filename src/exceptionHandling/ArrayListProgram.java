package exceptionHandling;

import java.util.ArrayList;

public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList p= new ArrayList();
	p.add(45);
	p.add(52.56);
	p.add("asds");
	p.add(null);
	p.add(null);
	System.out.println(p);
	System.out.println(p.size());
	System.out.println(p.isEmpty());
	p.set(4, "India");
	System.out.println(p);
	p.remove(4);
	System.out.println(p);
	System.out.println(p.get(0));
	p.clear();
	System.out.println(p);
}
}
