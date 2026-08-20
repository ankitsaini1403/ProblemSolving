import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        
        
        ans1.add(nums[0]);
        ans2.add(nums[1]);
        
        
        for (int i = 2; i < nums.length; i++) {
            if (ans1.get(ans1.size() - 1) > ans2.get(ans2.size() - 1)) {
                ans1.add(nums[i]);
            } else {
                ans2.add(nums[i]);
            }
        }

       
        int[] ans = new int[nums.length];
        int index = 0;

        for (int num : ans1) {
            ans[index++] = num;
        }
        for (int num : ans2) {
            ans[index++] = num;
        }

        return ans;
    }
}
