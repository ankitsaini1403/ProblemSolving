class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        int start = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            start = Math.max(start, lastIndex[ch]);

            max = Math.max(max, end - start + 1);

            lastIndex[ch] = end + 1;
        }

        return max;
    }
}
