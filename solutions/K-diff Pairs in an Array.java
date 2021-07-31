class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        for(int x:nums){
            int temp=mp.getOrDefault(x,0);
            mp.put(x,temp+1);
            if(k==0&&temp==1)
                ++ans;
        }
        
        if(k==0)
            return ans;
        
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            int temp=e.getKey();
            if(mp.containsKey(temp+k)){
                ++ans;
            }
        }
        
        return ans;
    }
}
