class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length;
        while(low<high){
            int mid=(high+low)/2;
            if(mid+1>=arr.length||mid-1<0)
                return mid;
            if(arr[mid+1]<arr[mid]&&arr[mid-1]<arr[mid])
                return mid;
            else if(arr[mid-1]>arr[mid])
                high=mid;
            else if(arr[mid-1]<arr[mid])
                low=mid+1;
        }
        return high+1;
    }
}
