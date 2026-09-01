class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() < end - start + 1) {

                char leftChar = s.charAt(start);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
