class Solution {
public:
    void sortColors(vector<int>& nums) {
        int ones=0,twos=0,zeros=0;
    for(int x:nums){
        if(x==0)
            zeros++;
        else if(x==1)
            ones++;
        else
            twos++;
    }
    for(int & num : nums){
        if(zeros>0){
            num=0;
            zeros--;
            continue;
        }
        if(ones>0){
            num=1;
            ones--;
            continue;
        }
        if(twos>0){
            num=2;
            twos--;
            continue;
        }

    }
        
    }
};
