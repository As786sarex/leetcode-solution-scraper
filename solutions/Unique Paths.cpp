class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m,vector<int>(n,0));
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=0;
                if(i==0&&j==0)
                    continue;
                if(i!=0)
                    temp+=dp[i-1][j];
                if(j!=0)
                    temp+=dp[i][j-1];
                cout<<temp;
                dp[i][j]=temp;
            }
        }
        return dp[m-1][n-1];
    }
};
class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m,vector<int>(n,0));
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=0;
                if(i==0&&j==0)
                    continue;
                if(i!=0)
                    temp+=dp[i-1][j];
                if(j!=0)
                    temp+=dp[i][j-1];
                cout<<temp;
                dp[i][j]=temp;
            }
        }
        return dp[m-1][n-1];
    }
};
