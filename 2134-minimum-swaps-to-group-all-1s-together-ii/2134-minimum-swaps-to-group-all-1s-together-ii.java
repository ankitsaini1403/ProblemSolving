class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int k = 0;

        for (int num : nums) {
            if (num == 1)
                k++;
        }

        if (k == 0 || k == n)
            return 0;

        int count = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for (int end = 0; end < n + k - 1; end++) {
            if (nums[end % n] == 0)
                count++;

            if (end - start + 1 > k) {
                if (nums[start % n] == 0)
                    count--;
                start++;
            }

            if (end - start + 1 == k) {
                min = Math.min(min, count);
            }
        }

        return min;
    }
}
