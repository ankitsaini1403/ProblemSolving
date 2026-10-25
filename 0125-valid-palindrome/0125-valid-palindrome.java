class Solution {
    public boolean isPalindrome(String s) {
   int left  =0 ;
   int right = s.length()-1;

   while(left < right){
       
       if(!isAlphaNumric(s.charAt(left)))left++;
       else if(!isAlphaNumric(s.charAt(right)))right--;
       else {
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))) return false ;
            left++;
            right--;
       }


   }

   return true ;
}

 public boolean isAlphaNumric(char ch){
     return ((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')|| (ch>= '0' && ch<='9'));
 }
}