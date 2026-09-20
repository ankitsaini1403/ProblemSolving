class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int  alreadyhappyCustomers = 0 ;

        for(int i= 0 ; i<customers.length;i++){
             if(grumpy[i]==0) alreadyhappyCustomers+=customers[i];
        }

        int sum =0;
        int max = 0 ;
        int start =0 ;
        int end =0 ;

        while(end<customers.length){
              if(grumpy[end]==1)sum+=customers[end];
              if(end-start+1<minutes){
                   end++;
              }
              else if(end-start+1 ==minutes){
                 max = Math.max(max, sum);
                 if(grumpy[start]==1){
                 sum -= customers[start];}
                 start++;
                 end++;
              }
        }

        return alreadyhappyCustomers +max ;





    }
}