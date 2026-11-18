class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer , Integer>map = new HashMap<>();
         

         int start =0 ;
         int max =  0 ;

         for(int end =0 ; end<fruits.length ; end++){
                
                map.put(fruits[end]  , map.getOrDefault(fruits[end] ,0) +1);

                if(map.size()>2){
                  int left = fruits[start]; 
                   map.put(left, map.get(left)-1);
                    if(map.get(left)==0) {
                           map.remove(left);
                    }
                    start++ ;

                }

                max = Math.max(max, end-start+1);
               
         }

         return max ;




    }
}