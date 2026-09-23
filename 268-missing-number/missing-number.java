class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;

        // Array ke elements ka XOR
        for (int i = 0; i < n; i++) {
            xor1 ^= nums[i];
        }

        // 0 se n tak ka XOR
        for (int i = 0; i <= n; i++) {
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }
}