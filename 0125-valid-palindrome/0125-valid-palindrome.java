class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 ;
        int right = s.length()-1 ;

        while(left<right){
              char l = s.charAt(left);
              char r = s.charAt(right);

              if(!isAlphaNumeric(l)){
                   left++;
              }
              else if(!isAlphaNumeric(r)){
                  right-- ;
              }

              else {
                   if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                     return false ;
                   }
                   left++;
                   right--;
              }

             
        }
         return true ;


    }

    public boolean isAlphaNumeric(char ch){
           return ((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')||(ch>='0'&& ch<='9')) ;
    }
}