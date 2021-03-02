package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;



public class Sampl{
	public static void main(String[] args) throws FileNotFoundException{
FileInputStream fin=new FileInputStream("C:\\Users\\Tech\\Downloads");    
FileInputStream fin2=new FileInputStream("D:\\Users.\\b.txt");    
FileInputStream fin3=new FileInputStream("D:\\c.txt");    
FileInputStream fin4=new FileInputStream("D:\\d.txt");    
//creating Vector object to all the stream    
Vector<FileInputStream> v=new Vector<FileInputStream>();    
v.add(fin);    
v.add(fin2);    
v.add(fin3);    
v.add(fin4);              
//creating enumeration object by calling the elements method    
Enumeration<FileInputStream> e=v.elements();      
//passing the enumeration object in the constructor    
SequenceInputStream bin=new SequenceInputStream(e);    
int i=0;      
try {
	while((i=bin.read())!=-1){    
	System.out.print((char)i);    
	}
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}     
try {
	bin.close();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}    
try {
	fin.close();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}    
try {
	fin2.close();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}    
}    

}
