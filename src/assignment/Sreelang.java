package assignment;
    interface Language {
    	void getName(String name);
    	
    }

    class Pp implements Language{
       
    	public void getName(String name) {
    	
    		System.out.println("Pp:" + name);
      }
    }
    
    class Sreelang{
    	public static void main(String args[]){
    	
    	Pp p = new Pp();
    	p.getName("OOPS");
    	}
    }
    