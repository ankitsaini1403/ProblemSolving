class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer>ans = new ArrayList<>();

         int freq[] = new int[26];

         for(int i=0 ; i<p.length(); i++){
              freq[p.charAt(i)-'a']++;
         }


         int count = p.length();

         int start =0 ;

         for(int end =0 ; end<s.length(); end++){

            if(freq[s.charAt(end)-'a']>0)count--;
            freq[s.charAt(end)-'a']--;

            while(end- start +1 > p.length()){
                  char ch = s.charAt(start);
                  freq[ch-'a']++;
                  if(freq[ch-'a']>0) count++;
                  start++;
            }

            if(count==0) ans.add(start);
         }



    return ans ;
    }
}
