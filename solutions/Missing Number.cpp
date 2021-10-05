class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int allSum=(n*(n+1))/2;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(allSum==sum)
            return 0;
        return allSum-sum;
    }
};
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int allSum=(n*(n+1))/2;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(allSum==sum)
            return 0;
        return allSum-sum;
    }
};
