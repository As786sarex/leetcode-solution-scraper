class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int first=0,second=nums.length-1;
        int i=second;
        while(second>=first){
            if(Math.abs(nums[first])>Math.abs(nums[second])){
                result[i]=nums[first]*nums[first];
                ++first;
            } else{
                result[i]=nums[second]*nums[second];
                --second;;
            }
            --i;
        }
        return result;
    }
}
