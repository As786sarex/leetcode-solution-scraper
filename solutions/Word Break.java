class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int length=s.length();
        Set<String> words=new HashSet<>(wordDict);
        boolean[] dp=new boolean[length+1];
        dp[0]=true;
        for(int i=1;i<=length;++i){
            for(int j=0;j<i;++j){
                if(dp[j]&&words.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        
        return dp[length];
    }
}
