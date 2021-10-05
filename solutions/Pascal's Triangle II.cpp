class Solution {
public:
    vector<int> getRow(int numRows) {
    numRows=numRows+1;
    vector<int> v(numRows);
    if (numRows == 0)
        return v;
    v[0] = 1;
    if (numRows == 1)
        return v;
    v[1] = 1;
    for (int i = 2; i < numRows; ++i) {
        int buffer = 1, temp = 1;
        int j;
        for (j = 1; j < i; ++j) {
            temp = v[j - 1];
            v[j - 1] = buffer;
            buffer = temp + v[j];
        }
        v[j-1] = buffer;
        v[i] = 1;
    }
    return v;
    }
};
class Solution {
public:
    vector<int> getRow(int numRows) {
    numRows=numRows+1;
    vector<int> v(numRows);
    if (numRows == 0)
        return v;
    v[0] = 1;
    if (numRows == 1)
        return v;
    v[1] = 1;
    for (int i = 2; i < numRows; ++i) {
        int buffer = 1, temp = 1;
        int j;
        for (j = 1; j < i; ++j) {
            temp = v[j - 1];
            v[j - 1] = buffer;
            buffer = temp + v[j];
        }
        v[j-1] = buffer;
        v[i] = 1;
    }
    return v;
    }
};
