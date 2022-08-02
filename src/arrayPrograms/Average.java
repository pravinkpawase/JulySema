package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
public static void main (String[] args) {
	Average p= new Average();
	p.name();
	
}
public void name() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the length of numbers whose Average You Want ?");
	int a=sc.nextInt();
	System.out.println("Enter The Numbers");
	int b[]=new int[a];
	for(int i=0;i<a;i++) {
		b[i]=sc.nextInt();
	}
	sc.close();
	Arrays.sort(b);
	System.out.println("Entered Numbers in asending order");
	int x =0 ;
	
	for(int i=0;i<a;i++) {
		System.out.println(b[i]);
		x=x+b[i];
		
	}
	double z=x/a;
	System.out.println("Average of Total Numbers is "+z);
	
	
}
}
