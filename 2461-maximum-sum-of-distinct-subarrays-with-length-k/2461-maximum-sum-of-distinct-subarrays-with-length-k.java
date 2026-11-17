class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        int start = 0;

        for (int end = 0; end < nums.length; end++) {

            sum += nums[end];

            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            
            if (end - start + 1 == k) {

                
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }

            
                int left = nums[start];

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                sum -= left;
                start++;
            }
        }

        return max;
    }
}


