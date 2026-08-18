class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int[] freq = new int[51];
        int[] count = new int[51];

        int low = 0;
        int high = 0;

        while (high < n) {

            freq[nums[high]]++;

            if (high - low + 1 < k) {
                high++;
            } 
            else if (high - low + 1 == k) {

                
                for (int i = 0; i < 51; i++) {
                    if (freq[i] > 0) {
                        count[i]++;
                    }
                }

               
                freq[nums[low]]--;
                low++;
                high++;
            }
        }

        
        for (int i = 50; i >= 0; i--) {
            if (count[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}
