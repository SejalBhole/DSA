import java.util.*;
public class InsertionSort {
    public static void insertionSort(int [] arr){
        
        for(int i=1; i<arr.length; i++)        //consider 1st element as already sorted
        {
            int key = arr[i];                   //current element to be inserted
            int J = i-1;                        //left element of current element for comparison

            while(J >= 0 && arr[J] > key )    //loop until j is greater than 0 and left element is greater than curr element
            {
               arr[J+1] = arr[J];                   //shift greater element to right
               J--;                                 //decrement j first 
            }

            arr[J+1] = key;                 //then by incrementing, insert curr element
        }
}

    public static void printArray(int [] arr)
    {
        for(int val : arr)
        {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert in array :");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Insert elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        insertionSort(arr);
        System.out.println("Sorted array :");
        printArray(arr);

    }
}
