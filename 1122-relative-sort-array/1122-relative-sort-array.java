
import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        // Step 1: Count frequency
        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        // Step 2: Follow arr2 order
        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        // Step 3: Remaining elements in ascending order
        for (int num = 0; num < freq.length; num++) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        return arr1;
    }
}
