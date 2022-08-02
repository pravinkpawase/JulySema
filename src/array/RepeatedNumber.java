package array;

public class RepeatedNumber {
public static void main(String[] args) {
	RepeatedNumber p= new RepeatedNumber();
	p.name();
}

public void name() {
	int a[]= {10,23,17,10,19};
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				System.out.println(a[j]);
			} 
		}
	}
	
}
}
