package assignment;

public class Only{
    public static void main(String args[]){
        String s = "POORNASREE";
        System.out.println("Odd");
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                System.out.println(s.charAt(i));
            }
        }
        System.out.println("Even");
        for(int i = 0; i<s.length(); i++){
            if(i%2!=0){
                System.out.println(s.charAt(i));
            }
        }
    }
}
