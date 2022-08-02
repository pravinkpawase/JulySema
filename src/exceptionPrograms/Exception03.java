package exceptionPrograms;

import java.io.FileInputStream;


public class Exception03 {
public static void main(String[] args) {
	Exception03 p= new Exception03();
	p.name();
}
public void name()  {
	try {
		FileInputStream pp=new FileInputStream("C:\\a.txt");
	}
	catch(Exception a){
		a.printStackTrace();
	
	}
	System.out.println("Exception Handled");
	 
}
}
