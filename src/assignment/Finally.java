package assignment;

public class Finally {

	public static void main(String args[]){
		
		try{
			String s = "Sree";
		}catch(Exception e){System.out.println(e);}
		finally { System.out.println("success");}
	}

}
