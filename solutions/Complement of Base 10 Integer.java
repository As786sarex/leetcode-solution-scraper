class Solution {
    public int bitwiseComplement(int N) {
        int lg=(int)(Math.log(N)/Math.log(2));
        lg=31-lg;
        int x=0;
        x=~x;
        x=x>>>lg;
        N=N^x;
        N=N&x;
        return N;
    }
}
