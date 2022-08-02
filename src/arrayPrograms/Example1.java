package arrayPrograms;

public class Example1 {
	int a[];
public static void main(String[] args) {
	Example1 p= new Example1();
	p.name();
}
public void name() {
	a= new int[5];
	a[0]=12;
	a[1]=52;
	a[2]=47;
	a[3]=85;
	a[4]=89;
	System.out.println(a.length);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}

}
