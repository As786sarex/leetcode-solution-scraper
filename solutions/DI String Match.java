class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] ans=new int[len+1];
        int index=0;
        Deque<Integer> q=new ArrayDeque<>();
        q.add(0);
        for(int i=0;i<len;++i) {
            if(s.charAt(i)=='I') {
                while(!q.isEmpty()) {
                    ans[index++]=q.pollFirst();
                }
                q.add(i+1);
            } else {
                q.addFirst(i+1);
            }
        }
        while(!q.isEmpty()) {
            ans[index++]=q.pollFirst();
        }
        return ans;
    }
}
