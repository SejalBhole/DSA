import java.util.*;
public class twoDarrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows =sc.nextInt();
        System.out.println("enter number of columns");
        int cols =sc.nextInt();

         int [][] arr = new int[rows][cols];
        
         //input
         System.out.println("Enter the numberss:");
         for(int i=0;i<rows;i++){
            for(int j =0; j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" ");

        //output
        System.out.println("enter the key to search::");
        int x = sc.nextInt();
        System.out.println("entered Elements are:");
        for(int i=0;i<rows;i++){
        for(int j =0; j<cols;j++){

            if(arr[i][j]==x)
            {
                System.out.println("Index of "+x +" is "+i +","+j);
            }
            
        }
        
    
    }

    }
    
}


