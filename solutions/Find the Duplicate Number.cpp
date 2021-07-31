class Solution {
public:
    int findDuplicate(vector<int>& nums) {
    int number = 0;
    for (int i = 0; i < nums.size(); ++i) {
        int index = nums[i] < 0 ? nums[i] * -1 : nums[i];
        if (nums[index] < 0) {
            number = nums[i];
            break;
        }
        nums[index] *= -1;
    }
    return number < 0 ? number * -1 : number;
    }
};
