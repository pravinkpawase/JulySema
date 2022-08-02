package arrayPrograms;

import java.util.Scanner;

public class ScannerAr {
public static void main(String [] args) {
	ScannerAr p= new ScannerAr();
	p.name();
}
public void name() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Length of Array");
	int a=sc.nextInt();
	System.out.println("Enter Numbers");
	int x[] =new  int[a];
	for(int i=0;i<a;i++) {
	x[i]=sc.nextInt();
	}
	sc.close();
	System.out.println("Entered Numbers");
	for(int j=0;j<a;j++) {
		System.out.println(x[j]);
	}
	}
}
