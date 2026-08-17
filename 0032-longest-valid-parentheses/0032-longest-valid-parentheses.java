class Solution {
    public int longestValidParentheses(String s) {
      int left = 0 ; int right = 0 ; int max = 0 ;

       for(int i = 0 ; i<s.length(); i++){
           
           if(s.charAt(i) == '('){
              left++ ;
           }else {
                 right++ ;
           }
           
           if(left == right){
              max  = Math.max( max, 2*right);
           }
           if(right>left){
             left = right = 0  ;
           }
       }
       
     left = 0 ; right = 0 ;
           
       for(int j =s.length()-1; j>=0; j--){
           
           if(s.charAt(j) == '('){
              left++ ;
           }else {
                 right++ ;
           }
           
           if(left == right){
              max  = Math.max(max, 2*right);
           }
           if(left>right){
             left = right = 0  ;
           }
           
       }
         return max ;
       }

    
    }
