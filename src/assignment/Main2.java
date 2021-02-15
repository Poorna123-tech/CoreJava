package assignment;

     class ClassRoom1 {
    	 void student1(){
    		 System.out.println("Class A");
    		 
    	 }
}
     class ClassRoom2 extends ClassRoom1{
    	 void student2(){
    		 System.out.println("Toppers");
    	 }
     }
     
    class ClassRoom3 extends ClassRoom2{
    	void student3(){
    		System.out.println("Normal Students");
    	}
    }
   
    class Main2{
    	public static void main(String args[]){
    		
    		ClassRoom2 l = new ClassRoom2();
    		ClassRoom3 m = new ClassRoom3();
    		
    		l.student2();
    		m.student3();
    	}
    	    
    }
