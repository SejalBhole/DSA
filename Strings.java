import java.util.*;
public class Strings {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First name:");
        String fname = sc.nextLine();
        System.out.println("enter last name:");
        String lname = sc.nextLine();

        System.out.println("Your full name is: "+(fname+ " "+lname));

        System.out.println("Length of fname is: "+fname.length());

        for(int i=0;i<=fname.length();i++)
        {
            System.out.println(fname.charAt(i));
        }

    }
}