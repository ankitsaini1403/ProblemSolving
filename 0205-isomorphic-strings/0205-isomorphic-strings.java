class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

       


       for(int i = 0 ; i<s.length() ;i++){
           
           char mappedCharacter = s.charAt(i);
           char replacementCharacter = t.charAt(i);

           if(!map.containsKey(mappedCharacter)){
             if(!map.containsValue(replacementCharacter)){
                  map.put(mappedCharacter, replacementCharacter);
             }
             else {
                 return false ;
             }
            
             }
              else {
                    char orginial =  map.get(mappedCharacter);
                    if(orginial != replacementCharacter) return false ;
                  
           }
       }

       return true ;
        
         
    }
}