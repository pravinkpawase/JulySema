package pomExecutionClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {

public void marks() throws EncryptedDocumentException, IOException {
String path="F:\\MockMarks.xlsx";
FileInputStream pp5 =new FileInputStream(path);
CellType type1=WorkbookFactory.create(pp5).getSheet("Sheet1").getRow(1).getCell(1).getCellType();
FileInputStream pp6 =new FileInputStream(path);
CellType type2=WorkbookFactory.create(pp6).getSheet("Sheet1").getRow(2).getCell(1).getCellType();
for(int i=1 ;i<=5;i++) {
for(int j=1;j<=7;j++) {

FileInputStream pp =new FileInputStream(path);
CellType type=WorkbookFactory.create(pp).getSheet("Sheet1").getRow(i).getCell(j).getCellType();
if(type.equals(type1)) {
FileInputStream pp1 =new FileInputStream(path);
String info=WorkbookFactory.create(pp1).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
System.out.print(info+"\t");
}
else if(type.equals(type2)) {
FileInputStream pp2 =new FileInputStream(path);
double ma=WorkbookFactory.create(pp2).getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue();
System.out.print(ma+"\t");
}
else {
FileInputStream pp3 =new FileInputStream(path);
double m=WorkbookFactory.create(pp3).getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue();	
System.out.print(m+"\t");
}
}

System.out.println();
}

}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Parameter pp=new Parameter();
	pp.marks();
}
}

