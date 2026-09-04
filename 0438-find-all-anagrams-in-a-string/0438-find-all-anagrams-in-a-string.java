class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) return ans;

        int[] freq = new int[26];

        
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = p.length();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            
            if (freq[s.charAt(right) - 'a'] > 0) {
                count--;
            }
            freq[s.charAt(right) - 'a']--;

          
            if (right - left + 1 > p.length()) {
                char ch = s.charAt(left);

                freq[ch - 'a']++;

                if (freq[ch - 'a'] > 0) {
                    count++;
                }

                left++;
            }

            
            if (count == 0) {
                ans.add(left);
            }
        }

        return ans;
    }
}
