class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=1,max=1;
        Set<Character> set=new HashSet<>();
        int sz=s.length();
        if(sz==0)
            return 0;
        set.add(s.charAt(0));
        while(left<sz&&right<sz){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(set.contains(r)&&left!=right){
                ++left;
                set.remove(l);
            } else{
                ++right;
                set.add(r);
            }
            
            if(set.size()==(right-left)&&max<set.size())
                max=set.size();
        }
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=1,max=1;
        Set<Character> set=new HashSet<>();
        int sz=s.length();
        if(sz==0)
            return 0;
        set.add(s.charAt(0));
        while(left<sz&&right<sz){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(set.contains(r)&&left!=right){
                ++left;
                set.remove(l);
            } else{
                ++right;
                set.add(r);
            }
            
            if(set.size()==(right-left)&&max<set.size())
                max=set.size();
        }
        return max;
    }
}
