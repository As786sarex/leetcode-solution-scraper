class Solution {
public:
    void setZeroes(vector<vector<int>> &matrix) {
    if (matrix.empty())
        return;
    int m = matrix.size(), n = matrix[0].size();
    bool is0thRow = false, is0thcol = false;
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            if (i == 0 && matrix[i][j] == 0)
                is0thRow = true;
            if (j == 0 && matrix[i][j] == 0)
                is0thcol = true;
            if (matrix[i][j] == 0) {
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    for (int i = 1; i < m; ++i) {
        for (int j = 1; j < n; ++j) {
            if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                matrix[i][j] = 0;
            }
        }
    }
    if (is0thRow) {
        for (int i = 0; i < n; ++i) {
            matrix[0][i] = 0;
        }
    }

    if (is0thcol) {
        for (int i = 0; i < m; ++i) {
            matrix[i][0] = 0;
        }
    }

}
};
class Solution {
public:
    void setZeroes(vector<vector<int>> &matrix) {
    if (matrix.empty())
        return;
    int m = matrix.size(), n = matrix[0].size();
    bool is0thRow = false, is0thcol = false;
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            if (i == 0 && matrix[i][j] == 0)
                is0thRow = true;
            if (j == 0 && matrix[i][j] == 0)
                is0thcol = true;
            if (matrix[i][j] == 0) {
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    for (int i = 1; i < m; ++i) {
        for (int j = 1; j < n; ++j) {
            if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                matrix[i][j] = 0;
            }
        }
    }
    if (is0thRow) {
        for (int i = 0; i < n; ++i) {
            matrix[0][i] = 0;
        }
    }

    if (is0thcol) {
        for (int i = 0; i < m; ++i) {
            matrix[i][0] = 0;
        }
    }

}
};
