class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        for(int e:nums){
            single^=e;
        }
        return single;
    }
}
