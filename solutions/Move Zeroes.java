class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        if (size < 2)
            return;
        int i = 0, j = 1;
        while (i < size && j < size) {
            if (nums[i] == 0) {
                j = i + 1;
                while (j < size && nums[j] == 0) {
                    j++;
                }
                if (j < size) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
            i++;
        }
    }
}
