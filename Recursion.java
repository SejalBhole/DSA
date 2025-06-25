import java.util.*;

public class Recursion{
    public static void printRev(String str, int index){
        if(index <0)
        {
            return;
        }
        
        System.out.println(str.charAt(index));
        printRev(str, index-1);
    }

    public static void main(String[]args){
         String str = "abcd";
        System.out.println("Reversed string is :  ");
        printRev( str, str.length()-1);
    }
}