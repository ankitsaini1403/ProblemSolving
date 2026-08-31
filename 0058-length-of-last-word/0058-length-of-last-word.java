class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();

        int count =0;

        for(int i = str.length()-1 ;i>=0 ;i--){
              char ch = str.charAt(i);
              
              if(ch ==' '){
                  break ;
              }
              count++;
        }

        return count ;
    }
}