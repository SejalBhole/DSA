import java.util.*;

//Time Complexity: O(n)
//Space Complexity: O(k) for leaders (worst-case O(n))


class Day5{
    
    public static List<Integer> findLeaders(int[]arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxright = arr[n-1];
        leaders.add(arr[n-1]);

        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] >= maxright)
            {
                maxright = arr[i];
                leaders.add(arr[i]);
            }
        }

          Collections.reverse(leaders);       // reverse to maintain original order
         return leaders;
    }
    
    public static void main(String[] args) {
       int [] arr = {16,17,4,3,5,2};
       List<Integer> result = findLeaders(arr);
       System.out.println("Leaders: "+result); 
    }

}