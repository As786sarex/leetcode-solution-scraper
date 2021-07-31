// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long l=1,r=n,mid=1;
        while(r>=l){
            mid=(l+r)/2;
            if(l==r){
                return (int)mid;
            }
            if(isBadVersion((int)mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return (int)mid;
        
    }
};
