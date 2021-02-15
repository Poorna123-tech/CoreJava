package assignment;
import java.util.*;
public class Unique{
    public static void main(String args[]) {
        Unique u=new Unique();
        u.findUnique("AMSTERDAM");

        u.findUnique("COSMOS");
        
        u.findUnique("EPIDEMICPANDEMIC");
        
        u.findUnique("ILLIIONOS");
        
    }
    
    public void findUnique(String s) {
        boolean flag;
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<s.length();i++){
            flag = false;
            for(int j = 0; j<list.size() && flag == false ;j++){
                String s1 = s.charAt(i)+"";
                if(s1.equals(list.get(j)))
                {
                    flag = true;
                }
            }
            if(flag == false) {
                list.add(s.charAt(i)+"");
                System.out.print(s.charAt(i));   
            }    
        }
        System.out.println();
    }
}