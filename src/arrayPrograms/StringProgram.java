package arrayPrograms;

public class StringProgram {
	public static void main(String[] args) {
		StringProgram p= new StringProgram();
		p.name();

	}
	public void name() {
		String car[][]=new String[4][4];
		car[0][0]="Rolls Royce";
		car[0][1]="Audi A8";
		car[0][2]="Mercedez Benz";
		car[0][3]="Bently";
		car[1][0]="Rolls Royce";
		car[1][1]="Audi A8";
		car[1][2]="Mercedez Benz";
		car[1][3]="Bently";
		car[2][0]="Rolls Royce";
		car[2][1]="Audi A8";
		car[2][2]="Mercedez Benz";
		car[2][3]="Bently";
		car[3][0]="Rolls Royce";
		car[3][1]="Audi A8";
		car[3][2]="Mercedez Benz";
		car[3][3]="Bently";
		for(int i=3;i>=0;i--) {
			for(int j=3;j>=0;j--) {
				System.out.println(car[i][j]);
		}
	}
}

}