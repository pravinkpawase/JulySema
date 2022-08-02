package arrayPrograms;

import java.util.Arrays;

public class ExampleDesc {
	int a[] =new int[5];//Declaration and Initialization
	public static void main(String[] args) {
		ExampleDesc p= new ExampleDesc();
		p.name();

	}
	public void name() {
		a[0]=12;
		a[1]=52;
		a[2]=47;
		a[3]=85;
		a[4]=89;
		Arrays.sort(a);
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
