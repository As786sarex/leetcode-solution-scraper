class Solution {
    public String getPermutation(int n, int k) {
        int[] pre=new int[10];
        pre[0]=1;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;++i){
            pre[i]=pre[i-1]*i;
            l.add(i);
        }
        int temp=0;k--;
        StringBuilder b=new StringBuilder(n);
        for(int i=1;i<=n;++i){
            temp=k/pre[n-i];
            k-=temp*pre[n-i];
            b.append(l.get(temp));
            l.remove(temp);
        }
        return b.toString();
    }
}
class Solution {
    public String getPermutation(int n, int k) {
        int[] pre=new int[10];
        pre[0]=1;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;++i){
            pre[i]=pre[i-1]*i;
            l.add(i);
        }
        int temp=0;k--;
        StringBuilder b=new StringBuilder(n);
        for(int i=1;i<=n;++i){
            temp=k/pre[n-i];
            k-=temp*pre[n-i];
            b.append(l.get(temp));
            l.remove(temp);
        }
        return b.toString();
    }
}
