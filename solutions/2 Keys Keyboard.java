class Solution {
    public int minSteps(int n) {
        int[] dp=new int[n+1];
        for (int i = 2; i <dp.length ; i++) {
            int div=isPrime(i);
            if(div==Integer.MAX_VALUE)
                dp[i]=i;
            else
                dp[i]=dp[i/div]+dp[div];
        }
        //System.out.println(Arrays.toString(dp));
        return dp[n];
    }
    int isPrime(int i){
        if (i==2||i==3) {
        }
        else {
            for (int j = 2; j*j <=i ; j++) {
                if (i%j==0)
                    return j;
            }
        }
        return Integer.MAX_VALUE;
    }
}
