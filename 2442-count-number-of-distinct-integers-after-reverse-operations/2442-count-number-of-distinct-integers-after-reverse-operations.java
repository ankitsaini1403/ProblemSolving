class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> ans = new  HashSet<>();

        for(int num :nums){
             ans.add(num);

             int rev =0 ;
             while(num>0){
                rev = rev*10 + num%10 ;
                num/=10 ;
             }

             ans.add(rev);
        }

        return ans.size();
    }
}