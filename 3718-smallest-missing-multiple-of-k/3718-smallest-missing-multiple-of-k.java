class Solution {
    public int missingMultiple(int[] nums, int k) {
      boolean freq[] = new boolean[101];

      for(int num : nums){
           freq[num] = true ;
      }
       int num = k;
       while(num<101){
          if(!freq[num]){
             return num ;
          }

          num+=k ;
       }

       return num ;


    }
}