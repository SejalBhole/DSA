import java.util.*;


public class Palindrome {
    
    public static boolean checkPalindrome(int n)
    {
        int temp = n;
        int rev=0;
        while(n!=0)
        {
            int rem = n%10;
            rev =(rev*10)+rem;
            n =n/10;
        }

        if(rev == temp)
            return true;
        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check is its palindrome or not :");
        int num = sc.nextInt();

        boolean result = checkPalindrome(num);

         if(result)
            System.out.println(num + " is a palindrome.");
         else
            System.out.println(num + " is not a palindrome.");

    }
}
