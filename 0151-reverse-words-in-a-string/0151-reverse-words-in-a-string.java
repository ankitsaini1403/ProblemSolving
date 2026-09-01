class Solution {
    public String reverseWords(String s) {

        StringBuilder word = new StringBuilder();
        StringBuilder sentence = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } 
            else if (word.length() > 0) {
                sentence.append(word.reverse());
                sentence.append(" ");
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            sentence.append(word.reverse());
        }

        return sentence.toString().trim();
    }
}
