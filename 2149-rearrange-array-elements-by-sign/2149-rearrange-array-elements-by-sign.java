class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        
        for (int k = 0; k < n; k++) {
            if (nums[k] > 0) {
                result[posIndex] = nums[k];
                posIndex += 2;
            } else {
                result[negIndex] = nums[k];
                negIndex += 2;
            }
        }
        return result;
    }
}
