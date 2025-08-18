import java.util.Arrays;

//O(n + m)- time and space complexity  where n is length of 1st array and m is length of 2nd array

public class Day4 {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        
        int i = 0, j = 0, k = 0;

        // Traverse both arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] merged = mergeArrays(arr1, arr2);

        // ✅ Correct printing
        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
