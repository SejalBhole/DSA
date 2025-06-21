import java.util.*;

public class BubbleSort {

   
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int a = 0; a < n - 1; a++) {              //we have to compare two elements therefore going till n-2   
            for (int b = 0; b < n - 1 - a; b++) {       //at each pass last element will be at its correct position so no need to go till that b to n-1, b to n-2...and so on 
                if (arr[b] > arr[b + 1]) {
                    // swap
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }

   
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to add in the array?");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr); 
        System.out.println("Sorted array:");
        printArray(arr); // print the sorted array
    }
}
