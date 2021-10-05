class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0, emp = Integer.MAX_VALUE;
        int n = nums.length;
        if (n == 3)
            return Arrays.stream(nums).sum();
        Arrays.sort(nums);

        for (int i = 0; i < (n - 2); i++) {
            for (int j = i + 1; j < (n - 1); j++) {
                int sum = target - (nums[i] + nums[j]);

                int index = Arrays.binarySearch(nums, j + 1, n, sum);
                index = index < 0 ? (-(index) - 1) : index;
                int curr;
                if (index >= n) {
                    index = n - 1;
                }
                curr = Math.abs(sum - nums[index]);
                if (emp > curr) {
                    emp = curr;
                    result = nums[i]+nums[j]+nums[index];
                }

                curr = Math.abs(sum - nums[index - 1]);
                if (j < (index - 1) && emp > curr) {
                    emp = curr;
                    result = nums[i]+nums[j]+nums[index-1];
                }
            }
        }
        return result;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0, emp = Integer.MAX_VALUE;
        int n = nums.length;
        if (n == 3)
            return Arrays.stream(nums).sum();
        Arrays.sort(nums);

        for (int i = 0; i < (n - 2); i++) {
            for (int j = i + 1; j < (n - 1); j++) {
                int sum = target - (nums[i] + nums[j]);

                int index = Arrays.binarySearch(nums, j + 1, n, sum);
                index = index < 0 ? (-(index) - 1) : index;
                int curr;
                if (index >= n) {
                    index = n - 1;
                }
                curr = Math.abs(sum - nums[index]);
                if (emp > curr) {
                    emp = curr;
                    result = nums[i]+nums[j]+nums[index];
                }

                curr = Math.abs(sum - nums[index - 1]);
                if (j < (index - 1) && emp > curr) {
                    emp = curr;
                    result = nums[i]+nums[j]+nums[index-1];
                }
            }
        }
        return result;
    }
}
