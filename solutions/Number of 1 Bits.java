public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
        if((n&(1<<31))!=0){
            cnt++;
            n&=~(1<<31);
        }
        while(n>0){
            n&=(n-1);
            ++cnt;
        }
        return cnt;
    }
}
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
        if((n&(1<<31))!=0){
            cnt++;
            n&=~(1<<31);
        }
        while(n>0){
            n&=(n-1);
            ++cnt;
        }
        return cnt;
    }
}
