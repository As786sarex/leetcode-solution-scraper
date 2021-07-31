class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] res=new int[k];
        int maxFreq=0;
        for(int x:nums){
            int temp=mp.getOrDefault(x,0)+1;
            mp.put(x,temp);
            maxFreq=Integer.max(maxFreq,temp);
        }
        HashMap<Integer,List<Integer>> mp1=new HashMap<>();
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            List<Integer> l=mp1.getOrDefault(e.getValue(),new ArrayList<>());
            l.add(e.getKey());
            mp1.put(e.getValue(),l);
        }
        int flag=0;
        outer:
        for(int i=maxFreq;i>=1;--i){
            if(flag>=k)
                        break outer;
            if(mp1.containsKey(i)){
                for(int x:mp1.get(i)){
                    if(flag>=k)
                        break outer;
                    res[flag++]=x;
                }
            }
            
        }
        return res;
        
    }
}
