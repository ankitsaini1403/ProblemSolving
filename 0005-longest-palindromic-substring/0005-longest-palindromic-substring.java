class Solution {
    public String longestPalindrome(String s) {
        int n= s.length();
        int start =0 ;
        int end =0 ;
        int maxLength = Integer.MIN_VALUE;


       for(int i =0 ; i<n ; i++){
          int oddLength = expand(s, i ,i);
          int evenLength = expand(s, i , i+1);
          int len =  Math.max(oddLength, evenLength);

          if(len>maxLength){
            maxLength = len ;
              start = i- (len-1)/2;
              end= i + len/2 ;
          }
       }


       return s.substring(start , end+1);

    }

 private int expand(String s , int left , int right){
      while(left>=0  &&  right<s.length()  && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
      }

      return right -left -1 ;
 }

}