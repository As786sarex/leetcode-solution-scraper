class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> hash;
        for(int a:nums){
            hash.insert(a);
        }
        int ans=0;
        for(int a:nums){
            int current=1;
            if(hash.find(a-1)==hash.end()){
                a++;
                while(hash.find(a)!=hash.end()){
                    a++;
                    current++;
                }
                ans=max(current,ans);
            }
        }
        return ans;
    }
};
