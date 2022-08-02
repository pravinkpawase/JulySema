package arrayPrograms;

import java.util.Arrays;

public class StringCars {
	public static void main(String[] args) {
		StringCars p= new StringCars();
		p.name();
	}
	public void name() {
	

		String []x[]=new String[3][3];
		x[0][0]="Baleno";
		x[0][1]="Nexon";
		x[0][2]="Altroz";
		x[1][0]="Tiago";
		x[1][1]="Desire";
		x[1][2]="Swift";
		x[2][0]="Swift";
		x[2][1]="Swift";
		x[2][2]="Swift";
		
		Arrays.sort(x);
		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}	

