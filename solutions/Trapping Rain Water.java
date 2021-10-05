class Solution {
    public int trap(int[] height) {
        if(height.length<3)
            return 0;
        int[] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        prefix[0]=height[0];
        suffix[height.length-1]=height[height.length-1];
        
        for(int i=1;i<height.length;++i){
            prefix[i]=Integer.max(height[i],prefix[i-1]); 
        }
        for(int i=(height.length-2);i>=0;--i){
            suffix[i]=Integer.max(height[i],suffix[i+1]);
        }
        int result=0;
        for(int i=1;i<height.length-1;i++){
            int temp=(Integer.min(prefix[i],suffix[i])-height[i]);
            result+=Integer.max(temp,0);
        }
        
        return result;
    }
}
import static java.lang.Integer.max;
import static java.lang.Integer.min;
class Solution {
    public int trap(int[] nums) {
        if(nums.length<=2)
            return 0;
        int leftMax=nums[0],rightMax=nums[nums.length-1];
        int left=1,right=nums.length-2,ans=0;
        while(left<=right) {
            if(leftMax>=rightMax) {
                int current = nums[right];
                ans += max(0,rightMax-current);
                rightMax=max(rightMax,current);
                --right;
            } else {
                int current = nums[left];
                ans += max(0,leftMax-current);
                leftMax=max(leftMax,current);
                ++left;
            }
        }
        return ans;
        
    }
}
