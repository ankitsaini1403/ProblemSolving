class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int start = 0;
        int count = p.length();

        for (int end = 0; end < s.length(); end++) {

            
            char ch = s.charAt(end);
            int val = map.getOrDefault(ch, 0);

            if (val > 0) {
                count--;
            }

            map.put(ch, val - 1);

            
            if (end - start + 1 > p.length()) {
                char leftChar = s.charAt(start);
                int leftVal = map.getOrDefault(leftChar, 0);

                if (leftVal >= 0) {
                    count++;
                }

                map.put(leftChar, leftVal + 1);
                start++;
            }

            
            if (count == 0) {
                ans.add(start);
            }
        }

        return ans;
    }
}
