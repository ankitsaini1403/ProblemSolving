class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) != ' ') {
                sb.append(sentence.charAt(i));
            } else {
                
                if (sb.toString().startsWith(searchWord)) {
                    return count;
                }

                sb.setLength(0);
                count++;
            }

        }
          if (sb.toString().startsWith(searchWord)) {
                    return count;
                }

        return -1;
    }
}

       