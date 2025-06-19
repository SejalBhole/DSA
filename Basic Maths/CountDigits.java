
import java.util.*;

public class CountDigits {
    public static int countDigits(int n)
    {
        int count = 0;
    int i =0;
    while(n!=0)
    {
       int rem = n%10;
        count++;
        n = n/10;    
    }
    return count;
    }


public static void main(String [] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number : ");
 int num = sc.nextInt();

 int result = countDigits(num);
System.out.println("digits in given number are :"+result);
}

}
