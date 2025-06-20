import java.util.*;

public class Pattern {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        /*  System.out.println("Enter how many rows you want to print in rectangle box:");
        int row = sc.nextInt(); */



        //code for SOLID RECTANGLE 

       /*  for(int i=1;i<=4;i++)                   //for 4 rows                 
        {
            for(int j=1;j<=row;j++)                //for 5 cols
            {
                System.out.print("*");
            }
          System.out.println();
        } */


        //CODE FOR HOLLOW RECTANGLE

        /*for(int i =1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if (i==1 || i==4 || j==1 || j==5) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  */

     //CODE FOR HALF PYRAMID

     /*for(int i =1;i<=4;i++)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     } */


     //CODE FOR INVERTED  HALF PYRAMID


    /*  for(int i =4;i>=1;i--)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     }  */


//CODE FOR INVERTED  HALF PYRAMID by 180 degree

  /*  for(int i =1;i<=4;i++)
   {
     for(int j=1;j<=4-i;j++)     //for printing space
    {
      System.out.print(" ");
    }
         for(int j =1;j<=i;j++)     //for printing star
           {
            System.out.print("*");
           }

              System.out.println(" ");

   }   */
   


      //HALF PYRAMID  WITH NUMBERS

      /*for(int i=1;i<=5;i++)
         {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
         } */


         // INVERTED HALF PYRAMID  WITH NUMBERS

         /*for(int i=5;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print(j);
             }
             System.out.println(" ");
         } */

         //FLOYD'S TRIANGLE
         
        /*int num=1;
         for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
                
            }
            System.out.println(" ");
         }*/



        

    }
}