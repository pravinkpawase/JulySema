package arrayPrograms;

import java.util.TreeSet;

public class ArrayHash {
public static void main(String[] args) {
	
	int a[]= {1,25,1,25,78,89,45,63,12,74,45,56};
	TreeSet p= new TreeSet();
	for(int i=0;i<a.length;i++) {
		p.add(a[i]);
	}
	System.out.println(p);
}
}

