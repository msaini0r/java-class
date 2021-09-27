package sortingQuestions;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

    }
    public int heightChecker(int[] heights) {
    int expected[]=heights.clone();// copying the values from heights to expected array
        Arrays.sort(expected);//sort the array
    int ans=0;
        for(int i=0;i<heights.length;i++){
        if(expected[i]==heights[i]) continue; // if its true then it won't execute the next line of code
        ans++;// only executes when expected[i] !=heights[i];
    }
        return ans;
}
}
