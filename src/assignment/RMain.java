package assignment;

public class RMain{
    public static void main(String a[]){
        String s = "abc&123_ABC";
        boolean flag = false;
        for(int i = 0; i<s.length(); i++){
            Character s1 = s.charAt(i);
            int ascii = (int) s1;
            if(ascii>=65&&ascii<=90 || ascii>=97&&ascii<=122){
                
            }
            else 
            {
                flag = true;
            }
            
        }if (flag == true){
            System.out.print("String consists other than alphabets");
            
        }
        else {
            System.out.print("String consists only alphabets");
        }
    }
}

