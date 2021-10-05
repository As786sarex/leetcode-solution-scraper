class Solution {
    public int mincostTickets(int[] days, int[] costs) {
       int[] dp=new int[days[days.length-1]+1];
        int day_7,day_30;
        HashSet<Integer> set=new HashSet<>();
        for (Integer i:days)
            set.add(i);

        for (int i = 1; i <dp.length ; i++) {
            if (set.contains(i)) {
                if (i-7<0)
                    day_7=costs[1];
                else
                    day_7=dp[i-7]+costs[1];
                if (i-30<0)
                    day_30=costs[2];
                else
                    day_30=dp[i-30]+costs[2];
                dp[i]=min_3(dp[i-1]+costs[0],day_7,day_30);
            } else {
                dp[i]=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }

    int min_3(int a, int b, int c){
        return Integer.min(a,Integer.min(b,c));
    }
}
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
       int[] dp=new int[days[days.length-1]+1];
        int day_7,day_30;
        HashSet<Integer> set=new HashSet<>();
        for (Integer i:days)
            set.add(i);

        for (int i = 1; i <dp.length ; i++) {
            if (set.contains(i)) {
                if (i-7<0)
                    day_7=costs[1];
                else
                    day_7=dp[i-7]+costs[1];
                if (i-30<0)
                    day_30=costs[2];
                else
                    day_30=dp[i-30]+costs[2];
                dp[i]=min_3(dp[i-1]+costs[0],day_7,day_30);
            } else {
                dp[i]=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }

    int min_3(int a, int b, int c){
        return Integer.min(a,Integer.min(b,c));
    }
}
