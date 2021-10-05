class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len==1)
            return s;
        int[] result= new int[3];
        for(int i=0;i<(len-1);++i){
            expand(s,i,i,result);
            expand(s,i,i+1,result);
        }
        return s.substring(result[1],result[2]+1);
    }
    
    private void expand(String s,int start,int end,int[] result){
        int len=0;
        if(start==end){
            len=1;
            --start;
            ++end;
        }
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            len+=2;
            --start;
            ++end;
        }
        if(result[0]<len){
            result[0]=len;
            result[1]=++start;
            result[2]=--end;
        }
    }
}
