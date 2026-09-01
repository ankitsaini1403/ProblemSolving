class Solution {
    public int lengthOfLongestSubstring(String s) {

        List<Character> list = new ArrayList<>();
        int start = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            while (list.contains(ch)) {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

            list.add(ch);
            max = Math.max(max, list.size());
        }

        return max;
    }
}

