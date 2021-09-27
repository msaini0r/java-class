package sortingQuestions;

import java.util.Arrays;

public class CanBeEqual {
    public static void main(String[] args) {

    }

    public boolean CanBeEqual(int[] target, int[] arr) {

                Arrays.sort(target);
                Arrays.sort(arr);
                for (int i=0; i<target.length; i++)
                    if (target[i] != arr[i])
                        return false;
                return true;
            }
        }
