import java.util.*;

public class Functions {

   /*  public static void  addNum(int a, int b)
    {
        int result =a+b;
        System.out.println("Addition of two numbers is " +result);
        return;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ::");
        int x = sc.nextInt();
        int y = sc.nextInt();

        addNum(x, y);        */


        public static void printFactorial(int num)
        {   
            int factorial = 1;
            for(int i=num;i>=1;i--)
               factorial = factorial*i;

            System.out.println("Factorial of Number is "+factorial);
            return;
        }

        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number whose factorial you want:");
            int num = sc.nextInt();

            printFactorial(num);
        }

    }
