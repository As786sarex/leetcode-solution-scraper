class Solution {
public:
vector<vector<int>> generate(int numRows) {
    vector<vector<int>> res(numRows, vector<int>());
    if (numRows == 0)
        return res;
    res[0] = {1};
    if (numRows == 1)
        return res;
    res[1] = {1, 1};
    if (numRows == 2)
        return res;
    int prev = 2;
    for (int i = prev; i < numRows; ++i) {
        vector<int> temp(prev + 1);
        temp[0] = 1;
        temp[prev] = 1;
        for (int j = 1; j < prev; ++j) {
            temp[j] = res[prev - 1][j - 1] + res[prev - 1][j];
        }
        res[prev] = temp;
        ++prev;
    }
    return res;
}
};
