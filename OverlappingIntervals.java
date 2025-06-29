import java.util.*;

public class OverlappingIntervals {
    public static int[][] merge(int[][] intervals) {
        // edge case : if only 1 interval is present
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // lambda function For every interval a, extract
                                                                    // a[0] (start time) So: For {1, 3}, it returns 1 and so on.

        // creating list to store results i.e non overlapping intervlas
        List<int[]> merged = new ArrayList<>();
        int [] curr = intervals[0];

        for(int i = 1; i < intervals.length ; i++)
        {
            //if overlaps
            if(intervals[i][0] <= curr[1])
            {
                curr[1] = Math.max(curr[1],intervals[i][1]);   //merge them by updating the end to the larger one
            }else{
                merged.add(curr);       //If they don’t overlap, then the current interval is finalized and added to result.
                curr = intervals[i];        //update current to the new interval for further comparison
            }

    }
                      merged.add(curr); // Add the last one

    return merged.toArray(new int[merged.size()][]);   //Convert the List<int[]> to int[][] format and return it. 
    }

    public static void main(String[] args) {
       

        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] merged = merge(intervals);
        System.out.println("        Merged Overlapping Intervals Are: ");
        for(int [] interval : merged)
        {
            System.out.println(Arrays.toString(interval));

        }
    }
}
