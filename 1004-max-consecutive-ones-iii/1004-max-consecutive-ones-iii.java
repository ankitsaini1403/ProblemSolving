class Solution {
    public int longestOnes(int[] nums, int k) {
          int count =0 ;
          int maxCount  =  Integer.MIN_VALUE ;

          int start =0 ;

          for(int end = 0 ; end<nums.length  ; end++){
                 
                 if(nums[end]==0) count++ ;

                 while(count>k){
                     if(nums[start]==1) start++;
                     else {
                             count--;
                             start++ ;
                     }
                 }

                 maxCount= Math.max(maxCount, end-start +1);
          }         


return maxCount ;
          
       


    }


}