package arrayPrograms;

public class Example2 {
	public static void main(String[] args) {
		Example2 p= new Example2();
		p.name();

	}
	public void name() {
		int a[]=new int[5];
		a[0]=15;
		a[1]=56;
		a[2]=48;
		a[3]=54;
		a[4]=86;
		
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
