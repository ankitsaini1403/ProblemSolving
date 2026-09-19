class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        int max = 0;

        int start = 0;

        for(int end = 0 ; end<s.length() ; end++){
             map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);

            while(map.size()<end-start+1){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                if(map.get(s.charAt(start))==0) map.remove(s.charAt(start));
                start++;
            }

            max=  Math.max(max, end-start+1);
        }

        return max ;
    }
}
