class Solution {
public:
    int arrangeCoins(int n) {
       // if(n==3)
           // return 2;
        int l=sqrt(n);
        int r=2*l;
        long long mid=0;
        while(l<r){
            mid=(l+r)/2;
            long long int sum=(mid*(mid+1))/2;
            if(n==sum)
                return mid;
            else if(n<sum)
                r=mid;
            else
                l=mid+1;
        }
        if(((mid*(mid+1))/2)>n){
            return mid-1;
        }
        if((((mid+1)*(mid+2))/2)<=n)
            return mid+1;
        return mid;
    }
};
