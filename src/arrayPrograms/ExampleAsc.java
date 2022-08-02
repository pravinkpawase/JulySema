package arrayPrograms;

import java.util.Arrays;

public class ExampleAsc {
	int a[];//Declaration
	//int[] b;
	//int [] d;
	public ExampleAsc() {
		a=new int[5];//initialization
	}

	public static void main(String[] args) {
		ExampleAsc p =new ExampleAsc();
		p.name();
	}
	public void name() {
		a[0]=12;
		a[1]=52;
		a[2]=47;
		a[3]=85;
		a[4]=89;
		Arrays.sort(a);
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
	}
}
