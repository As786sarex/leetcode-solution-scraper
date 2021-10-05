class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set=new HashSet<>();
        char[] chr=s.toCharArray();
        if(chr.length<3)
            return 0;
        int result=0;
        for(int i=0;i<chr.length-2;++i){
            set.clear();
            for(int j=i;j<i+3;++j){
                set.add(chr[j]);
            }
            if(set.size()==3)
                result++;
        }
        
        return result;
        
    }
}
class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set=new HashSet<>();
        char[] chr=s.toCharArray();
        if(chr.length<3)
            return 0;
        int result=0;
        for(int i=0;i<chr.length-2;++i){
            set.clear();
            for(int j=i;j<i+3;++j){
                set.add(chr[j]);
            }
            if(set.size()==3)
                result++;
        }
        
        return result;
        
    }
}
