class Solution {
public:
double myPow(double x, int n) {
    bool isNegetive = false;
    long long nl=n;
    if (nl < 0) {
        isNegetive = true;
        nl = nl * -1;
    }
    double one = 1;
    if (nl == 1) {
        if (isNegetive)
            return one / x;
        return x;
    }
    double res = one;
    while (nl > 0) {
        if (nl & 1L)
            res = res * x;
        nl = nl >> 1;
        x = x * x;
    }
    if (isNegetive)
        return one / res;
    else
        return res;
}
};
class Solution {
public:
double myPow(double x, int n) {
    bool isNegetive = false;
    long long nl=n;
    if (nl < 0) {
        isNegetive = true;
        nl = nl * -1;
    }
    double one = 1;
    if (nl == 1) {
        if (isNegetive)
            return one / x;
        return x;
    }
    double res = one;
    while (nl > 0) {
        if (nl & 1L)
            res = res * x;
        nl = nl >> 1;
        x = x * x;
    }
    if (isNegetive)
        return one / res;
    else
        return res;
}
};
