class Solution {
public:
    bool isLongPressedName(string name, string typed) {
    vector<pair<char, int>> a, b;
    int temp = 1;
    for (int i = 1; i < name.size(); i++) {
        if (name[i - 1] != name[i]) {
            a.emplace_back(name[i - 1], temp);
            temp = 1;
        } else {
            temp++;
        }
        if (i == name.size() - 1) {
            a.emplace_back(name[i], temp);
        }
    }
    temp = 1;

    for (int i = 1; i < typed.size(); i++) {
        if (typed[i - 1] != typed[i]) {
            b.emplace_back(typed[i - 1], temp);
            temp = 1;
        } else {
            temp++;
        }
        if (i == typed.size() - 1)
            b.emplace_back(typed[i], temp);
    }
    if (a.size() != b.size())
        return false;
    for (int i = 0; i < a.size(); ++i) {
        if ((a[i].first != b[i].first) || (b[i].second < a[i].second))
            return false;
    }
    return true;
    }
};
class Solution {
public:
    bool isLongPressedName(string name, string typed) {
    vector<pair<char, int>> a, b;
    int temp = 1;
    for (int i = 1; i < name.size(); i++) {
        if (name[i - 1] != name[i]) {
            a.emplace_back(name[i - 1], temp);
            temp = 1;
        } else {
            temp++;
        }
        if (i == name.size() - 1) {
            a.emplace_back(name[i], temp);
        }
    }
    temp = 1;

    for (int i = 1; i < typed.size(); i++) {
        if (typed[i - 1] != typed[i]) {
            b.emplace_back(typed[i - 1], temp);
            temp = 1;
        } else {
            temp++;
        }
        if (i == typed.size() - 1)
            b.emplace_back(typed[i], temp);
    }
    if (a.size() != b.size())
        return false;
    for (int i = 0; i < a.size(); ++i) {
        if ((a[i].first != b[i].first) || (b[i].second < a[i].second))
            return false;
    }
    return true;
    }
};
