class Solution {
public:
    int numSubarraysWithSum(vector<int>& A, int S) {
        unordered_map<int,int> hash;
        int sum=0,ans=0;
        hash[0]=1;
        for(int a:A){
            sum+=a;
            ans+=hash[sum-S];
            hash[sum]++;
        }
        return ans;
    }
};
class Solution {
public:
    int numSubarraysWithSum(vector<int>& A, int S) {
        unordered_map<int,int> hash;
        int sum=0,ans=0;
        hash[0]=1;
        for(int a:A){
            sum+=a;
            ans+=hash[sum-S];
            hash[sum]++;
        }
        return ans;
    }
};
