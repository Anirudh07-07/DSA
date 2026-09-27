class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count =0;
        int maj =0;
        for(int num:nums){
            if(count ==0){
                maj = num;
                count =1;
            }
            else if(maj == num){
                count ++;

            }
            else{count --;}
                
            
        }
        return maj;
    }
}