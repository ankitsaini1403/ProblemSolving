class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == curr) {
                i++;
                count++;
            }

            chars[index++] = curr;

            if (count > 1) {
                String str = Integer.toString(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }

        return index;
    }
}
