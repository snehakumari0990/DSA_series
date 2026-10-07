class Solution {
    int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length][2001];

        for(int[] row : dp){
            java.util.Arrays.fill(row, -1);

        }

        return solve(nums, 0, target);
    }

    int solve(int[] nums, int index, int target){
        if(index == nums.length){
            return target == 0 ? 1 : 0;
        }
        if(target < -1000 || target > 1000){
            return 0;
        }

        if(dp[index][target+1000] != -1){
            return dp[index][target+1000];
        }

        int add = solve(nums, index + 1,  target - nums[index]);
        int subtract = solve(nums, index+1, target + nums[index]);

        return dp[index][target+1000] = add + subtract;
    }
}