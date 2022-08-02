package arrayPrograms;


public class MultiDiaArray {
public static void main(String[] args) {
	MultiDiaArray p= new MultiDiaArray();
	p.name();
}
public void name() {
	int a[][]= {{1,2,3,78},{2,4,6,56},{12,42,56,78}};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<=a.length	;j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
}
}
