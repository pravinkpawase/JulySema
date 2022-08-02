package arrayPrograms;

import java.util.Arrays;

public class SimpleArray {
	public static void main(String[] args) {
		SimpleArray p= new SimpleArray();
		p.name();
	}
	public void name() {
	String name[];
	name= new String[6];
	name[0]="Pratik";
	name[1]="Amol";
	name[2]="Nivrutti";
	name[3]="Rahul";
	name[4]="Akshay";
	name[5]="Babaji";
	System.out.println("-----------Print------------");
	for(int i=0;i<=5;i++) {
		System.out.println(name[i]);
	}
	System.out.println("-----------Reverse Print------------");
	for(int i=5;i>=0;i--) {
		System.out.println(name[i]);
	}
	Arrays.sort(name);
	System.out.println("-----------Ascending Print------------");
	for(int i=0;i<=5;i++) {
		System.out.println(name[i]);
	}
	System.out.println("-----------Dscending Print------------");
	for(int i=5;i>=0;i--) {
		System.out.println(name[i]);
	}
	
	}
}
