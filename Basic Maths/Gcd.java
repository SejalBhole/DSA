import java.util.*;

public class Gcd{
    public static int findGcd(int n1, int n2){

        for(int i = Math.min(n1,n2); i>0; i--)
        {
            if(n1%i == 0 && n2%i==0)
            {
                return i;
            }
        }
        return 1;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();

        int res = findGcd(num1,num2);
        System.out.println("GCD of " +num1 +" and "+num2+" is:  "+res);
    }
}