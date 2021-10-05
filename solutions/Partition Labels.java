class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] map=new int[26];
        for(int i=0;i<s.length();++i){
            ++map[s.charAt(i)-'a'];
        }
        int curr=0,len=0;
        List<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();++i){
            int c=s.charAt(i)-'a';
            if(!visited[c]){
                curr+=map[c];
                visited[c]=true;
            }
            --curr;
            ++len;
            if(curr==0){
                res.add(len);
                len=0;
            }
        }
        return res;
    }
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] map=new int[26];
        for(int i=0;i<s.length();++i){
            ++map[s.charAt(i)-'a'];
        }
        int curr=0,len=0;
        List<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();++i){
            int c=s.charAt(i)-'a';
            if(!visited[c]){
                curr+=map[c];
                visited[c]=true;
            }
            --curr;
            ++len;
            if(curr==0){
                res.add(len);
                len=0;
            }
        }
        return res;
    }
}
