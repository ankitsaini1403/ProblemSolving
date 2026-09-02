class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];

      
        char ch='a' ;
        for(int i =0 ; i<t.length();i++){
             freq[t.charAt(i)-'a']++;
        }

          for(int i =0 ; i<s.length() ; i++){
            freq[s.charAt(i)-'a']--; 
        }
               for(int i =0 ; i<26 ; i++){
                  if(freq[i]==1){
                   ch = (char)(i+97);
                      break ;
                  } 
        }
        return ch;
      
    }
}