import java.util.*;

public class SelectionSort {
    
    public static void selectionSort(int [] arr){

        int n = arr.length;
        for(int i=0;i<n-1; i++)
        {
            int minIndex = i;

           // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(int [] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to insert:");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter elements one by one :");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        selectionSort(arr);
        System.out.println("sorted elements are:");
        printArray(arr);
    }
}
