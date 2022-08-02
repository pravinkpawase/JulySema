package arrayPrograms;

public class MulitiArray {
public static void main(String[] args) {
	MulitiArray p= new MulitiArray();
	p.name();
}
public void name() {
	int a[][]=new int[2][2];
	a[0][0]=45;
	a[0][1]=85;
	a[1][0]=55;
	a[1][1]=75;
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(a[i][j]);
		}
	}
}
}
