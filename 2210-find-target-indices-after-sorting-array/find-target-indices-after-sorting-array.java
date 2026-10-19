
import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num < target) {
                count++;
            } else if (num == target) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = count; i < count + count2; i++) {
            ans.add(i);
        }

        return ans;
    }
}
