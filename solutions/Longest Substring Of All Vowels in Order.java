class Solution {
    public int longestBeautifulSubstring(String word) {
        List<Character> chr=new ArrayList<>();
        List<Integer> cnt=new ArrayList<>();
        chr.add(word.charAt(0));
        cnt.add(0);
        int index=0;
        for(int i=0;i<word.length();++i){
            cnt.set(index,cnt.get(index)+1);
            if((i+1)<word.length()&&word.charAt(i)!=word.charAt(i+1)){
                chr.add(word.charAt(i+1));
                cnt.add(0);
                ++index;
            }
        }
        int max=0;
        for(int i=0;i<=index;++i){
            if(chr.get(i)=='a'&&i+4<=index&&chr.get(i+4)=='u'){
                if(!isValid(i+1,chr))
                    continue;
                int limit=i+4;
                int local=0;
                for(int j=i;j<=limit;++j){
                    local+=cnt.get(j);
                }
                max=Integer.max(max,local);
            }
        }
        
        return max;
        
    }
    
    boolean isValid(int start,List<Character> chr){
        if(chr.get(start)=='e'&&chr.get(start+1)=='i'&&chr.get(start+2)=='o'){
            return true;
        }
        return false;
    }
}
