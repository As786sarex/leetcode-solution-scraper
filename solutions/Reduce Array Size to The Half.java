class Solution {
    public int minSetSize(int[] arr) {
        int[] map=new int[100001];
        int sz=arr.length;
        int half=sz/2,cnt=0;
        int mx=0;
        for(int x:arr){
            map[x]=map[x]+1;
            mx=Integer.max(mx,x);
        }
        Arrays.sort(map,0,mx+1);
        for(int i=mx;i>=0;--i){
            if(map[i]>0){
                sz-=map[i];
                ++cnt;
            }
            if(sz<=half){
                break;
            }
        }
        return cnt;
    }
}
