class Solution {
public:
    static bool compPair(vector<int> a, vector<int> b) {
    if (a[0] == b[0])
        return a[1] < b[1];
    return a[0] < b[0];
    }
    
    vector<vector<int>> merge(vector<vector<int>>& vii) {
    if(vii.size()==0)
        return {};
    sort(vii.begin(), vii.end(), compPair);
    vector<vector<int>> res;
    res.push_back(vii[0]);
    int resptr = 0;
    for (int i = 1; i < vii.size(); ++i) {
        if (res[resptr][1] >= vii[i][0]) {
            res[resptr][1] = vii[i][1]>res[resptr][1]?vii[i][1]:res[resptr][1]
                ;
        } else {
            ++resptr;
            res.push_back(vii[i]);
        }
    }
    return res;
    }
};
