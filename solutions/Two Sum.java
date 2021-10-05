class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (occurences.containsKey(target - nums[i])) {
                int previous = occurences.get(target - nums[i]);
                result[0] = previous;
                result[1] = i;
                return result;
            }
            occurences.put(nums[i], i);
        }
        return result;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (occurences.containsKey(target - nums[i])) {
                int previous = occurences.get(target - nums[i]);
                result[0] = previous;
                result[1] = i;
                return result;
            }
            occurences.put(nums[i], i);
        }
        return result;
    }
}
