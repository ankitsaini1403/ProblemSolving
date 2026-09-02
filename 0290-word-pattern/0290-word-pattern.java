import java.util.HashMap;

class Solution { 
    public boolean wordPattern(String pattern, String s) { 
        HashMap<Character, String> map = new HashMap<>(); 
        String[] words = s.split(" "); 
        
        // Base case: If lengths don't match, the pattern can't match
        if (pattern.length() != words.length) {
            return false; 
        }
        
        for (int i = 0; i < pattern.length(); i++) { 
            char ch = pattern.charAt(i); 
            String str = words[i]; 
            
            if (map.containsKey(ch)) { 
                
                if (!map.get(ch).equals(str)) {
                    return false; 
                } 
            } else {
                if (map.containsValue(str)) {
                    return false;
                }
                map.put(ch, str); 
            }
        } 
        return true; 
    } 
}
