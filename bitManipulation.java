import java.util.*;

public class bitManipulation{
    public static void main(String args[])
    {
       /*  int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;

        if((n & bitmask) == 0)                                           //Get Operation 
        {
            System.out.println("Bit you wanted to get is zero");
        }
        else{
            System.out.println("Bit you wanted to get is 1");
        }   */



      /*   int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newno = (n | bitmask);                                       //Set Operation
        System.out.println("Result after setting bit is "+newno);

        */


       /*  int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int notopern = (~(bitmask));                                    //Clear Bit Operation

        int result = (notopern & n);
        System.out.println("Resultant number after performing clear operation is "+result);    */



        Scanner sc = new Scanner(System.in);              //update operation
        System.out.println("enter 0 or 1");
        int opern = sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        if(opern == 1){

        int newno = bitmask | n;
        System.out.println("after Updation :"+newno);
        }
        else{
            int notopern = (~(bitmask));
            int result = notopern & n;
            System.out.println("after updation "+result);
        }

    

    }
}