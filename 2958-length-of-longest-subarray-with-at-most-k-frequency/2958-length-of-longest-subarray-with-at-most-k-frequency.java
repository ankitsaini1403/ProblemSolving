class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        HashMap<Integer, Integer > freq = new HashMap<>();

        int  low = 0 ;
         int maxLen = Integer.MIN_VALUE ;
       for(int high = 0 ; high<arr.length ;high++){
            freq.put(arr[high],freq.getOrDefault(arr[high] , 0)+1);
              
               while(freq.get(arr[high])>k){
                    freq.put(arr[low] , freq.get(arr[low])-1);
                    low++ ;
               }

             maxLen = Math.max(maxLen , high-low +1);


       }

       return  maxLen ;
    }
}