class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n<0)
            return false;
        int bit=(log(n)/log(2));
        if((1<<bit)==n)
            return true;
        else
            return false;
        
    }
};
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n<0)
            return false;
        int bit=(log(n)/log(2));
        if((1<<bit)==n)
            return true;
        else
            return false;
        
    }
};
