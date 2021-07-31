class Solution {
    static bool comp(pair<char, int> a, pair<char, int> b) {
    return a.second >= b.second;
}
public:
    
    
    string frequencySort(string s) {
        unordered_map<char, int> mp;
    for (auto a:s) {
        mp[a]++;
    }
    vector<pair<char, int>> occur;
    for (auto a:mp) {
        occur.emplace_back(make_pair(a.first, a.second));
    }
    sort(occur.begin(), occur.end(), comp);
        string res;
    for (auto a:occur) {
        for (int i = 0; i < a.second; ++i) {
            res+=a.first;
        }
    }
        return res;
        
    }
};
