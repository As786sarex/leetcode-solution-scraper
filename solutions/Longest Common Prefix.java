class Solution {
    public String longestCommonPrefix(String[] strs) {
        int result=Integer.MAX_VALUE;
        if(strs.length==1)
            return strs[0];
        for(int i=1;i<strs.length;i++){
            int cur=Integer.min(strs[i-1].length(),strs[i].length());
            if(cur==0)
                return "";
            int x=0;
            for(int j=0;j<cur;j++){
                if(strs[i-1].charAt(j)==strs[i].charAt(j)){
                    ++x;
                } else {
                    break;
                }
            }
            result=Integer.min(result,x);
            if(result==0)
                return "";
        }
        return strs[0].substring(0,result);
        
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int result=Integer.MAX_VALUE;
        if(strs.length==1)
            return strs[0];
        for(int i=1;i<strs.length;i++){
            int cur=Integer.min(strs[i-1].length(),strs[i].length());
            if(cur==0)
                return "";
            int x=0;
            for(int j=0;j<cur;j++){
                if(strs[i-1].charAt(j)==strs[i].charAt(j)){
                    ++x;
                } else {
                    break;
                }
            }
            result=Integer.min(result,x);
            if(result==0)
                return "";
        }
        return strs[0].substring(0,result);
        
    }
}
