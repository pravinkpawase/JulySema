package arrayPrograms;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {
		SortingArrays p= new SortingArrays();
		p.name();
	}
	public void name() {
		int a[]= {1,5,42,56,74,89,63,524,5,78,74,85,89,85,85,74,4,54,54,5,45};
		int count = a.length;
		System.out.println("Total count is "+count);
		System.out.println("Print from 1");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("Print from 45");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("Ascending Order");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("Descending Order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}
}
