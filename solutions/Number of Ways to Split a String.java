class Solution {
    public int numWays(String s) {
        int totalOnes=0,len = s.length();
        long result = 0,mod = (long) 1e9+7;
        for(int i=0;i<len;++i) {
            if(s.charAt(i) == '1')
                ++totalOnes;
        }
        
        if((totalOnes%3)!=0)
            return 0;
        if(totalOnes==0) {
            len-=2;
            result = ((long)len*(len+1))/2;
            result%=mod;
            return (int) result;
        }
        totalOnes/=3;
        long temp= 2*totalOnes,first=0,second=0,total=0;
        
        for(int i=0;i<len;++i) {
            if(s.charAt(i) == '1')
                ++total;
            if(total==totalOnes)
                ++first;
            if(total==temp)
                ++second;
        }
        
        result =(first*second)%mod;
        return (int) result;
    }
}
