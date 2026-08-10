class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
       int i = 0 ;
       int j = nums.length -1 ;
       int maxsum = Integer.MIN_VALUE ;
        while(i<j){
            int pair = nums[i] + nums[j] ;
             maxsum = Math.max(maxsum , pair) ;
            i++ ;
            j-- ;
     
        } 

        return maxsum ;
    }
}