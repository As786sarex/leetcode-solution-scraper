class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0,sum=0;
        mp.put(0,1);
        for(int temp:nums){
            sum+=temp;
            int prev=sum-k;
            if(mp.containsKey(prev)){
                count+=mp.get(prev);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
