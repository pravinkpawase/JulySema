package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {
public static void main(String[] args) {
	ScannerArray p= new ScannerArray();
	p.name();
}
public void name() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The Size of Numbers");
	int a=sc.nextInt();
	System.out.println("Enter the Numbers ");
	int b[]=new int[a];
	for(int i=0;i<a;i++) {
		b[i]=sc.nextInt();
	}
	sc.close();
	double d=0;
	Arrays.sort(b);
	for(int i=0;i<a;i++) {
		System.out.println(b[i]);
		d=d+b[i];
	}
	System.out.println("Averrage of given Numbers is "+d/a);
}
}
