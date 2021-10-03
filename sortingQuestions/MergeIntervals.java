package sortingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); //sort by start time
        int[] currentInterval = intervals[0];
        int start = currentInterval[0], end = currentInterval[1];
        List<int[]> result = new ArrayList<>();

        for(int i = 1; i < intervals.length; i++) {
            currentInterval = intervals[i];
            if(currentInterval[0] <= end) end = Math.max(end, currentInterval[1]); //merge
            else { //add last successful merge and update start and end
                result.add(new int[] {start, end});
                start = currentInterval[0];
                end = currentInterval[1];
            }
        }

        result.add(new int[] {start, end}); //don't forget the interval we were trying to merge

        return result.toArray(new int[result.size()][]);
    }
}
