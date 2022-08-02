package arrayPrograms;

import java.util.Arrays;

public class OrderString {
public static void main(String[] args) {
	OrderString p= new OrderString();
	p.name();
}
public void name() {
	String a[]= new String[2];
	a[0]="Satyamev ";
	a[1]="Jayate";
	System.out.print(a[0]);
	System.out.println(a[1]);
	
	String bike[]= {"Platina","Activa","CD Delux","Splender","Passion Pro","Shine","Unicorn","Pulsar","FZ","R15","KTM","Ninja"};
	int count =bike.length;
	System.out.println(count);
	System.out.println("=====Printing All Strings=====");
	for(String b:bike) {
		System.out.println(b);
	}
	System.out.println("=====Printing in Reverse Order=====");
	for(int i=count-1;i>=0;i--) {
		System.out.println(bike[i]);
	}
	System.out.println("=======Ascending Order=======");
	Arrays.sort(bike);
	for(int i=0;i<bike.length;i++){
		System.out.println(bike[i]);
	}
	System.out.println("=======Descending Order=======");
	for(int i=count-1;i>=0;i--) {
		System.out.println(bike[i]);
	}
}
}
