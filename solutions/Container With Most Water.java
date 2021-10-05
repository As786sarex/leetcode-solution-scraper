class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int result=0;
        while(left<right){
            int min=Integer.min(height[left],height[right]);
            result=Integer.max(result,min*(right-left));
            if(min==height[left])
                left++;
            else
                right--;
        }
        return result;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int result=0;
        while(left<right){
            int min=Integer.min(height[left],height[right]);
            result=Integer.max(result,min*(right-left));
            if(min==height[left])
                left++;
            else
                right--;
        }
        return result;
    }
}
