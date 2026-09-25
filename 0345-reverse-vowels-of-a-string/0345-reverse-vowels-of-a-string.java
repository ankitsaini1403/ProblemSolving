class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1 ;

        while(left<right){
            if(!isVowel(arr[left])) left++;
            else if(!isVowel(arr[right]))right--;
            else {
                 char temp = arr[left];
                 arr[left] = arr[right];
                 arr[right]= temp ;
                 left++;
                 right--;
            }
        }
      
        return new String(arr);

    }
      public boolean isVowel(char ch){
         return (ch== 'a' || ch=='e' ||ch=='o' || ch=='u'|| ch=='i'|| ch=='A' || ch=='E'|| ch=='O'|| ch=='U'||ch=='I') ;
      }
}