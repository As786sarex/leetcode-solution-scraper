class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int> mp(101, 0);
    for (const auto &item : nums) {
        mp[item] += 1;
    }
    int ans = 0;
    for (const auto &item1 : mp) {
        ans += (item1 * (item1 - 1)) / 2;
    }
    return ans;
    }
};
class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int> mp(101, 0);
    for (const auto &item : nums) {
        mp[item] += 1;
    }
    int ans = 0;
    for (const auto &item1 : mp) {
        ans += (item1 * (item1 - 1)) / 2;
    }
    return ans;
    }
};
