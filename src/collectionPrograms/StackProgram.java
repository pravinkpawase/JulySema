package collectionPrograms;

import java.util.Stack;

public class StackProgram {
public static void main(String[] args) {
	Stack p=new Stack();//Last in First Out
	//add in same order
	p.push("Stack");
	p.push(56);
	p.push(22.36);
	p.push('P');//add -> Push method
	System.out.println(p);
	p.pop();
	System.out.println(p);
}
}
