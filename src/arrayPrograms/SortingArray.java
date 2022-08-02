package arrayPrograms;

import java.util.Arrays;

public class SortingArray {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=56;
	a[1]=45;
	a[2]=86;
	a[3]=96;
	a[4]=65;
	System.out.println("Before Sorting");
	System.out.println("Same Order");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Reverse Order");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	System.out.println("After Sorting");
	Arrays.sort(a);
	System.out.println("Ascending order");
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Descending Order");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}
}
