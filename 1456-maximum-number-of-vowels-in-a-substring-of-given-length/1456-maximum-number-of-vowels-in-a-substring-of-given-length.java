class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max  = 0 ;

        int start =0 ;

        int end = 0 ;

        while(end<s.length()){
           char  ch = s.charAt(end);
             if("aeiou".indexOf(ch)!= -1) count++;
              if(end- start +1<k){
                 end++;
              }
              else if(end- start+1 ==k){
                   max= Math.max(max, count);
                 if("aeiou".indexOf(s.charAt(start))!= -1) count--;
                 start++;
                 end++;
              }
        }

        return max ;

    }
}