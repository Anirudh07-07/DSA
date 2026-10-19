
import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;

        for (int num : nums) {
            if (num < target) {
                count++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (num == target) {
                ans.add(count);
                count++;
            }
        }

        return ans;
    }
}
