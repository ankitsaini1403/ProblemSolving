class Solution {
    public int maxOperations(int[] nums, int k) {
        int maxOp = 0;

        Arrays.sort(nums);

        int left =0;
        int right= nums.length-1 ;

        while(left <right){
              
              if(nums[left]+nums[right]==k){
                  maxOp++;
                  left++;
                  right--;
              }
              else if(nums[left]+nums[right]<k){
                    left++;
              }
              else{
                   right--;
              }
        }

        return maxOp ;
    }
}