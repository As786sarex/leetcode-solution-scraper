class Solution {
public:
long long titleToNumber(const string &s) {
    if (s.size() == 0)
        return 0;
    int powIndex = 0;
    long long res = 0;
    long long powRes = 1;
    for (int i = s.size() - 1; i >= 0; --i) {
        int temp = (s[i] - 'A') + 1;
        res += (powRes * temp);
        powRes *= 26;
        ++powIndex;
    }
    return res;
}

};
