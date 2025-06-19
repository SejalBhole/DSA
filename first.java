import java.util.*;

class Firstprog{
    public static void main(String []args)
    {
        System.out.println("Enter first and second number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();                        
                                                 //next() prints only first word of sentence

        if(a==b)
        {
            System.out.println("a and b both are equal");
        }
        else if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("a is smaller than b");
        }  

    }
        }

    
