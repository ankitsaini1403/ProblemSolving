class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        int j = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);

            if (ch != ' ') {
                word.append(ch);
            } 
            else if (word.length() > 0) {
                sb.append(word.reverse());
                sb.append(' ');
                word.setLength(0);
            }

            j++;
        }

        if (word.length() > 0) {
            sb.append(word.reverse());
        }

        return sb.toString();
    }
}
