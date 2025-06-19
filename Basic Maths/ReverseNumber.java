import java.util.*;


public class ReverseNumber {
  
    public static int reverseNumber(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);
        System.out.println("Reversed Number is : " +result);
    }
}
