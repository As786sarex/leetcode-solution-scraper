class Solution {
    public int monotoneIncreasingDigits(int n) {
        if(n<10)
            return n;
        char[] x = String.valueOf(n).toCharArray();

        int mark = x.length;
        for(int i = x.length-1;i>0;i--){
            if(x[i]<x[i-1]){
                mark = i-1;
                x[i-1]--;
            }
        }
        for(int i = mark+1;i<x.length;i++){
            x[i] = '9';
        }
        return Integer.parseInt(new String(x));
    }
}
