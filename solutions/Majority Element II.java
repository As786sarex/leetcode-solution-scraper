class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null)
            return result;
        int len = nums.length;
        if (len == 0)
            return result;
        int num1 = 0, num2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i : nums) {
            if (cnt1 == 0&& i!=num2) {
                num1 = i;
                ++cnt1;
            } else if (cnt2 == 0&& i!=num1) {
                num2 = i;
                ++cnt2;
            } else if (num1 == i) {
                ++cnt1;
            } else if (num2 == i) {
                ++cnt2;
            } else {
                --cnt1;
                --cnt2;
            }
        }
        int elem1freq = 0, elem2freq = 0;
        for (int num : nums) {
            if (num == num1)
                ++elem1freq;
            if (num == num2)
                ++elem2freq;
        }
        int majorityConstrain = len / 3;
        if (elem1freq > majorityConstrain)
            result.add(num1);
        if (elem2freq > majorityConstrain && num1 != num2)
            result.add(num2);
        result.sort(Comparator.naturalOrder());
        return result;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null)
            return result;
        int len = nums.length;
        if (len == 0)
            return result;
        int num1 = 0, num2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i : nums) {
            if (cnt1 == 0&& i!=num2) {
                num1 = i;
                ++cnt1;
            } else if (cnt2 == 0&& i!=num1) {
                num2 = i;
                ++cnt2;
            } else if (num1 == i) {
                ++cnt1;
            } else if (num2 == i) {
                ++cnt2;
            } else {
                --cnt1;
                --cnt2;
            }
        }
        int elem1freq = 0, elem2freq = 0;
        for (int num : nums) {
            if (num == num1)
                ++elem1freq;
            if (num == num2)
                ++elem2freq;
        }
        int majorityConstrain = len / 3;
        if (elem1freq > majorityConstrain)
            result.add(num1);
        if (elem2freq > majorityConstrain && num1 != num2)
            result.add(num2);
        result.sort(Comparator.naturalOrder());
        return result;
    }
}
