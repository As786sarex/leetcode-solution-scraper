class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx=0;
        for(int[] a:accounts){
            int temp=0;
            for(int x:a){
                temp+=x;
            }
            mx=Integer.max(temp,mx);
        }
        return mx;
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx=0;
        for(int[] a:accounts){
            int temp=0;
            for(int x:a){
                temp+=x;
            }
            mx=Integer.max(temp,mx);
        }
        return mx;
    }
}
