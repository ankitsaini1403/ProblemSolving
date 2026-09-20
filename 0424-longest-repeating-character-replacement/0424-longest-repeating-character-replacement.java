class Solution {
    public int maxCount(int arr[]){
         int count = Integer.MIN_VALUE ;

         for(int i =0 ; i<arr.length ; i++){
             if(count<arr[i]){
                 count = arr[i];
             }

         }
         return count ;
    }

    public int characterReplacement(String s, int k) {
           int  max = Integer.MIN_VALUE ;
           int  freq[] = new int[256];
           int start =0 ;
           for(int end =0 ; end<s.length() ;end++){
                  freq[s.charAt(end)]++;
                  int len = end- start +1 ;
                   int maxOccur  = maxCount(freq);
                   int diff = len - maxOccur ;
                   while(diff>k){
                       freq[s.charAt(start)]--;
                        start++;
                        maxOccur = maxCount(freq);
                        len = end -start +1 ;
                        diff = len - maxOccur;
                   }
                max = Math.max(max, end-start+1);
                
           }

           return max ;
    }
}