// Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
/*Example :
            Input:N = 153   Output:True  */
                

import java.util.*;

public class Armstrong {

    public static boolean armstrong(int n){
        int temp = n;
        int sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum = (rem*rem*rem)+sum;
            n = n/10;
        }

        if(sum == temp)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check is its armstrong or not :");
        int num = sc.nextInt();

         boolean result = armstrong(num);

        if (result)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
