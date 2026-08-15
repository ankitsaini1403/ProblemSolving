class Solution {
    public int maximumLengthSubstring(String s) {
        
        int count[] = new int[26];
        int low = 0 ;
        int maxLen = Integer.MIN_VALUE ;
        for(int high = 0 ; high<s.length() ; high++){
                  char ch = s.charAt(high);
                    count[ch-'a']++ ;
                   while(count[ch-'a']>2){
                         count[s.charAt(low)-'a']--;
                        low++;
                   }

                   maxLen = Math.max(maxLen , high-low +1);
        }


        return maxLen ;
    }
}