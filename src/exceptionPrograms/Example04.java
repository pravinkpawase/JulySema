package exceptionPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example04 {
public static void main(String[] args) throws FileNotFoundException {
	Example04 p= new Example04();
	p.name();
}
public void name() throws FileNotFoundException {
	FileInputStream pp= new FileInputStream("F:\\pasd.txt");
}
}
