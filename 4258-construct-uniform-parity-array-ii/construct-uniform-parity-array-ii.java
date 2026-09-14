class Solution {
    public boolean uniformArray(int[] nums1) {
        int sm = nums1[0];


        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < sm) {
                sm = nums1[i];
            }
        }
    

        if (sm % 2 == 1) {
            return true;
        }
        for(int num : nums1){
            if(num%2==1){
                return false ;
            }
           
        }

 return true;

    }
    }