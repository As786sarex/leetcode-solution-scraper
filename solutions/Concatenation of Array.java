class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int dob=2*n;
        int[] res=new int[dob];
        for(int i=0;i<dob;++i)
            res[i]=nums[i%n];
        return res;
    }
}
