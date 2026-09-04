class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans = new ArrayList<>();


        int[] freq1 = new int[26];

        for(char ch : p.toCharArray()){
             freq1[ch-'a']++;
        }

        for(int i= 0 ; i<=s.length()-p.length() ; i++){
             int sCount[] = new int[26];

             for(int j=i; j<i+p.length(); j++){
                 sCount[s.charAt(j)-'a']++;
             }

             if(Arrays.equals(freq1 ,sCount)){
                  ans.add(i);
             }
        }

        return ans ;
    }
}