package arrayPrograms;

public class ArrayString {
public static void main(String[] args) {
	ArrayString p= new ArrayString();
	p.name();
}
public void name() {
	String car[];
	car=new String[8];
	car[0]="Alto";
	car[1]="Wagnor";
	car[2]="Altroz";
	car[3]="Breeza";
	car[4]="Creta";
	System.out.println(car[2]);
	for(int i=0;i<8;i++) {
		System.out.println(car[i]);
	}
	
	
	
}
}
