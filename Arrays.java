import java.util.*;

public class Arrays {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int i =0;
        
        System.out.println("Enter the array elements:");
        for( i=0;i<size;i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
          int item = sc.nextInt();

          for(int i=0;i<=arr.length-1;i++)
          {
            if (arr[i]==item) {
                System.out.println("Item found at index" + i);
                
            }
            i++;
          }
          }
    }
    

