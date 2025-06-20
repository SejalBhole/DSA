import java.util.*;

public class Loops {

    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter natural number to which you want addition of numbers : ");
         int num = sc.nextInt();

       /*  for(int x=1; x<=count; x++)
        {
           System.out.println("Hellow worldd...");
           System.out.println(x);                       //printing count
        }   */


    /*int x = 1;
    while (x<count) 
    {
        System.out.println("helloww Sejal...");
        System.out.println(x);
        x++;
        
    }*/


    /*int x = 1;
    do                                                  //atleast one time the statement will be printed
    {
        System.out.println(x); 
        x++;
    }while (x<=count); */
     
    
    //Addition of natural numbers
    int sum=0;
    int i= 1;

    while (i<=num) {
        sum = sum+i;
        i++;
     }
     System.out.println("Addition of naturals numbers is:");
     System.out.println(sum);
   }


            
    }
    
