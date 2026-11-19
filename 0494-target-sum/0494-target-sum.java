class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return help(nums, 0, 0, target);
    }

    public int help(int[] nums, int i, int sum, int target) {

        if (i == nums.length) {
            if (sum == target) return 1;
            return 0;
        }

        int plus = help(nums, i + 1,
                        sum + nums[i], target);

        int minus = help(nums, i + 1,
                         sum - nums[i], target);

        return plus + minus;
    }
}