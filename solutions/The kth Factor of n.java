class Solution {
    public int kthFactor(int n, int k) {
        int num=(int)Math.sqrt(n),index=0;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=num;++i){
            
            if(n%i==0){
                ++index;
                System.out.println(i);
                if(index==k)
                    return i;
                int x=n/i;
                if(x!=i)
                l.add(x);
            }
        }
        
        if((index+l.size())<k){
            return -1;
        }
        System.out.println(index+" | "+l);
        int sz=l.size();
        for(int i=sz;i>0;--i){
            if(index+i==k)
                return l.get(sz-i);
        }
        return -1;
    }
}
