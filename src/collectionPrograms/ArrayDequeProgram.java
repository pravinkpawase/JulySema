package collectionPrograms;

import java.util.ArrayDeque;

public class ArrayDequeProgram {
public static void main(String[] args) {
	ArrayDeque p= new ArrayDeque();//First in First out
	//add in reverse order
	p.push("Pratik");
	p.push("Amol");;
	p.push(55.63);
	p.push('A');
	p.push(5896);
	System.out.println(p);
	p.pop();
	System.out.println(p);
}
}
