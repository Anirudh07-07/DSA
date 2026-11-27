class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j= 0;
        int n = nums.length;
        int sum =0 ;
        int winsize = Integer.MAX_VALUE;
;



        while(j<n){
            sum = sum + nums[j];
              while (sum >=target){

                sum = sum-nums[i];
               winsize = Math.min(winsize, j - i + 1);
                i++;
              }
              j++;
        }
        return winsize == Integer.MAX_VALUE ? 0 : winsize;
    }
}