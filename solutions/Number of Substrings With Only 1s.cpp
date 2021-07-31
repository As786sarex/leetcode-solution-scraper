class Solution {
public:
    const int md = 1e9 + 7;
    int numSub(string &s) {
        long long ans = 0, cnt = 0;
        for (const auto &item : s) {
        if (item == '1') {
            ++cnt;
        } else {
            ans += ((cnt * (cnt + 1)) / 2);
            ans = ans % md;
            cnt = 0;
        }
    }
    ans += ((cnt * (cnt + 1)) / 2);
    return ans%md;
    }
};
