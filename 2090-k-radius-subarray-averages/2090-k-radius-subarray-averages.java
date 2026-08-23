class Solution {
    public int[] getAverages(int[] nums, int k) {

        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        int windowSize = 2 * k + 1;
        long sum = 0;

        int low = 0;
        int high = 0;
        int index = k;

        while (high < nums.length) {

            sum += nums[high];

            if (high - low + 1 < windowSize) {
                high++;
            } 
            else {
                ans[index++] = (int)(sum / windowSize);

                sum -= nums[low];
                low++;
                high++;
            }
        }

        return ans;
    }
}
