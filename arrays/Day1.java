//Time Complexity - O(n)
//Space Complexity - O(1)
// Optimal Approach using Dutch National flag Algorithm

import java.util.*;

class Day1 {
    public static void sortColors(int [] nums)
    {
        int red = 0;
        int white = 0;
        int blue = nums.length-1;

        while(white <= blue)
        {
          if(nums[white]==0)
          {
            swap(nums,red,white);
            red++;
            white++;
          }else if(nums[white]==1)
          {
            white++;
          }else{
            swap(nums,white,blue);
            blue--;
          }
        }
    }

    public static void swap(int [] nums,int a, int b){
        int temp;

        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,0,1,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}