class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one =0 ;
        int maxCount = 0;
        for(int i =0 ; i<nums.length ; i++){

            if(nums[i] == 1){
                  one++;
                 maxCount = Math.max(maxCount , one) ;
            }
            else {
                  
                   one = 0 ;
            }
        }

        return maxCount ;
    }
}