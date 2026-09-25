class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        long ans = 0;
        int MOD = 1_000_000_007;


       
        long[] pow2 = new long[nums.length];
        pow2[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                ans = (ans + pow2[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }

        return (int) ans;
    }
}
