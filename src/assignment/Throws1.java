package assignment;

import java.io.*;
class Throws1 {
  public static void findFile() throws NullPointerException, IOException, IndexOutOfBoundsException, ArithmeticException {
    
    
  }

  public static void main(String[] args) {
    try{
      findFile();
    } catch(IOException e1){
      System.out.println("IOException Occurs");
    }
    	catch(IndexOutOfBoundsException e2){
      System.out.println("IndexOutOfBoundsException occurs");
    }
        catch(NullPointerException e3){
        	System.out.print("NullPointerException occurs");
        }
         catch(ArithmeticException e4){
        	 System.out.println("ArithmeticException occurs");
         }
  }
}
