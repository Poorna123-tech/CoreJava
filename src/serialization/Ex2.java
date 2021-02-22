package serialization;
import java.io.*;

 class Ex3 implements Serializable{  
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2997318201643823822L;
	int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 public Ex3(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  
	}  
 public class Ex2{
	 public static void main(String[] args) throws Exception {
		Ex3 ss = new Ex3(2, "sree", 18);
		 FileOutputStream file = new FileOutputStream("f");
		ObjectOutputStream out = new ObjectOutputStream(file);
	      out.writeObject(ss);
	      out.flush();
	      out.close();
	      file.close();
		System.out.println("Success");
	}
 }