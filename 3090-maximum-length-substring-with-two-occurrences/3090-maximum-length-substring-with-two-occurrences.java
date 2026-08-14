class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character,Integer>map = new HashMap<>();

        int low = 0 ;
        int maxLen = Integer.MIN_VALUE ;
        for(int high = 0 ; high<s.length() ; high++){
                  char ch = s.charAt(high);
                   map.put(ch , map.getOrDefault(ch, 0)+1);
                   while(map.get(ch)>2){
                        map.put(s.charAt(low) , map.get(s.charAt(low))-1);
                        low++;
                   }

                   maxLen = Math.max(maxLen , high-low +1);
        }


        return maxLen ;
    }
}