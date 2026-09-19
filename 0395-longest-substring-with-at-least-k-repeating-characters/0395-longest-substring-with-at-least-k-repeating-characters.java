class Solution {
    public int longestSubstring(String s, int k) {

        int ans = 0;

        
        for (int unique = 1; unique <= 26; unique++) {

            int[] freq = new int[26];

            int start = 0;
            int end = 0;

            int uniqueCount = 0;
            int atLeastK = 0;

            while (end < s.length()) {

                char c = s.charAt(end);
                int index = c - 'a';

               
                if (freq[index] == 0) {
                    uniqueCount++;
                }

                freq[index]++;

                if (freq[index] == k) {
                    atLeastK++;
                }

                end++;

               
                while (uniqueCount > unique) {

                    char left = s.charAt(start);
                    int leftIndex = left - 'a';

                    if (freq[leftIndex] == k) {
                        atLeastK--;
                    }

                    freq[leftIndex]--;

                    if (freq[leftIndex] == 0) {
                        uniqueCount--;
                    }

                    start++;
                }

            
                if (uniqueCount == unique && atLeastK == unique) {
                    ans = Math.max(ans, end - start);
                }
            }
        }

        return ans;
    }
}
