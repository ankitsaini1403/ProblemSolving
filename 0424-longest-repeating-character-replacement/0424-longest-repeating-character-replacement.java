class Solution {

    public int characterReplacement(String s, int k) {
 
         int freq[] = new int[26];

         int maxFreq =0 ;
         int maxLength = 0 ;

         int start =0 ;

         for(int end = 0; end<s.length() ; end++){
                
                freq[s.charAt(end)-'A']++;
                maxFreq= Math.max(maxFreq,  freq[s.charAt(end)-'A']);
                int windowLength = end - start +1 ;
                int replacements  = windowLength - maxFreq ;

                while( replacements >k){
                     freq[s.charAt(start)-'A']--;
                     start++;
                     windowLength = end - start +1 ;
                     replacements = windowLength - maxFreq ;
                }

                maxLength = Math.max(maxLength , end - start +1);
         }

         return  maxLength ;

      }

       
    }

