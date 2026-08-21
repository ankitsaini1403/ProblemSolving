class Solution {
    public List<Integer> findMissingElements(int[] nums) {
           int min = nums[0] ;
           int max = nums[0] ;
           HashSet<Integer>ans  = new HashSet<>();
           List<Integer> res = new ArrayList<>();

           for(int i = 0 ; i<nums.length ; i++){
                  max = Math.max(max, nums[i]);
                  min = Math.min(min, nums[i]);
                  ans.add(nums[i]);
                  
           }


           for(int i = min ; i<=max  ;i++){
                if(!ans.contains(i)){
                      res.add(i);
                }

           }

           return res ;

    }
}