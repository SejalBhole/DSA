package arrays;
import java.util.*;

public class Day3 {
    
   // method 1 brute force: : TC- O(n^2) ,  SC - O(1)
   
   
/* public static int findDuplicate(int[] arr)
   {

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,3,5};
        int duplicate = findDuplicate(arr);
        System.out.println("Dupliacte NO Is :"+ duplicate);
    }   
*/



//method 2 using hasing
//TC - O(n) but SC - O(n)
/* public static int findDuplicate(int [] arr)
    {
        HashSet <Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }else{
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int [] arr = {1,3,4,3,5};
        int duplicate = findDuplicate(arr);
        System.out.println("dupliacte number is ::: "+duplicate);
    }
*/


//method 3 using tortoise and hare 
// same approach as detecting loop in LL
//TC - O(n) , SC -O(1)

    public static int findDuplicate(int[] arr) {
         // Phase 1: Find the intersection point inside the cycle
        int slow = arr[0];
        int fast = arr[0];

        // Keep moving until both meet
        while (true) {
            slow = arr[slow];              // move slow pointer by 1 step
            fast = arr[arr[fast]];        // move fast pointer by 2 steps
            if (slow == fast) {             // if they meet, break
                break;
            }
        }

        // Phase 2: Find the entrance to the cycle (duplicate number)
        slow = arr[0];                     // reset slow pointer to start
        while (slow != fast) {              // move both at 1 step until they meet
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;  
    }
    public static void main(String[] args) 
    {
        int [] arr = {1,3,4,3,5};
        int duplicate = findDuplicate(arr);
        System.out.println("Dupliacte number is ::: "+duplicate);
    }
}   
