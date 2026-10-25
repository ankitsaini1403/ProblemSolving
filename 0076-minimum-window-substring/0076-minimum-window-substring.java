class Solution {
    public String minWindow(String s, String t) {
          if (t.length() > s.length()) return "";
        int freq1[]= new int[256];

        for(int i =0 ; i<t.length() ; i++){
             freq1[t.charAt(i)]++;
        }

        int freq2[] = new int[256];

        int minLength = Integer.MAX_VALUE ;

        int start =0 ;
        int minStart =0 ;

        for(int end =0 ; end<s.length() ; end++){
               freq2[s.charAt(end)]++;
               
               while(isValid(freq1 , freq2)){
                 int length = end - start + 1;

                if (length < minLength) {
                    minLength = length;
                    minStart = start;
                }

                freq2[s.charAt(start)]--;
                start++;
               }

        }
           if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(minStart , minStart  +minLength);
    }


    public boolean  isValid(int arr1[] , int arr2[]){
          
          for(int i= 0 ; i<256 ; i++){
             if(arr2[i]<arr1[i]) return false ;
          }

          return true ;
    }
}