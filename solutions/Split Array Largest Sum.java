class Solution {
    public int splitArray(int[] weight, int m) {
        int left=0,right=0;
        for(int temp:weight) {
            right+=temp;
            left=Integer.max(left,temp);
        }
        
        while(left<right) {
            int mid=(left+right)/2;
            if(getAllocation(weight,mid)>=m){
                left=mid+1;
                continue;
            }
            right=mid;
        }
        
        return left;
    }
    
    private int getAllocation(int[] weight,int mid){
        int sum=0,cnt=0;
        for(int temp:weight){
            sum+=temp;
            if(sum>mid){
                sum=temp;
                cnt++;
            }
        }
        
        return cnt;
    }
}
