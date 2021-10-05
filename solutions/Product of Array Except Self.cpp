class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> vec(nums.size());
        vec[nums.size()-1]=nums[nums.size()-1];
        for(int i=nums.size()-2;i>=0;i--){
            vec[i]=nums[i]*vec[i+1];
        }
        for(int i=1;i<nums.size();i++){
            nums[i]=nums[i]*nums[i-1];
        }
        for(int i=0;i<nums.size();i++){
            int left=(i==0)?1:nums[i-1];
            int right=(i==(nums.size()-1))?1:vec[i+1];
            vec[i]=left*right;
        }
        return vec;
        
    }
};
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> vec(nums.size());
        vec[nums.size()-1]=nums[nums.size()-1];
        for(int i=nums.size()-2;i>=0;i--){
            vec[i]=nums[i]*vec[i+1];
        }
        for(int i=1;i<nums.size();i++){
            nums[i]=nums[i]*nums[i-1];
        }
        for(int i=0;i<nums.size();i++){
            int left=(i==0)?1:nums[i-1];
            int right=(i==(nums.size()-1))?1:vec[i+1];
            vec[i]=left*right;
        }
        return vec;
        
    }
};
