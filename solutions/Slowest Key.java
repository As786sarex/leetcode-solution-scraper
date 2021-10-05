class Solution {
    public char slowestKey(int[] nums, String keys) {
        int prev=0,mx=-1,chr=0;
        for(int i=0;i<nums.length;++i){
             int temp=nums[i];
             nums[i]=temp-prev;
             prev=temp;
             if(mx<nums[i]){
                 mx=nums[i];
                 chr=keys.charAt(i);
             } else if(mx==nums[i] && chr<keys.charAt(i)){
                 chr=keys.charAt(i);
             }
        }
        return (char) chr;
        
    }
}
