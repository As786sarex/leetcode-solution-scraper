import static java.lang.Integer.max;
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][2];
        for (int[] arr : dp)
            Arrays.fill(arr, 1);
        int maxElement = 1;
        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    int current = max(dp[j][0] + 1, dp[i][0]);
                    if (current > dp[i][0]) {
                        maxElement = max(current,maxElement);
                        dp[i][0] = current;
                        dp[i][1] = dp[j][1];
                    } else if ((dp[j][0] + 1) == dp[i][0]) {
                        dp[i][1] += dp[j][1];
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i][0] == maxElement)
                result += dp[i][1];
        }
        return result;
    }
}
