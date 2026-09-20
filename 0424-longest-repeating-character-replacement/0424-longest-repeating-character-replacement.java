class Solution {

    public int characterReplacement(String s, int k) {

        int[] freq = new int[256];

        int start = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);
            freq[ch]++;

           
            maxFreq = Math.max(maxFreq, freq[ch]);

        
            int windowLength = end - start + 1;
            int replacements = windowLength - maxFreq;

           
            while (replacements > k) {
                freq[s.charAt(start)]--;
                start++;

                windowLength = end - start + 1;
                replacements = windowLength - maxFreq;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
