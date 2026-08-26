class Solution {

    public boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return s1.length() < s2.length();
        }
        return s1.compareTo(s2) < 0;
    }

    public String shortestBeautifulSubstring(String s, int k) {

        int totalOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        if (totalOnes < k) {
            return "";
        }

        int ones = 0;
        int start = 0;
        String ans = s;

        for (int end = 0; end < s.length(); end++) {

            if (s.charAt(end) == '1') {
                ones++;
            }

            while (ones >= k) {

                String current = s.substring(start, end + 1);

                if (compare(current, ans)) {
                    ans = current;
                }

                if (s.charAt(start) == '1') {
                    ones--;
                }

                start++;
            }
        }

        return ans;
    }
}
