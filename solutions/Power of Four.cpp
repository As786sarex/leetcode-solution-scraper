class Solution {
public:
    bool isPowerOfFour(int num) {
        if(num<=0)
            return false;
        int base4=log(num)/log(4);
        int ex=pow(4,base4);
        if(ex==num)
            return true;
        else
            return false;
        
    }
};
class Solution {
public:
    bool isPowerOfFour(int num) {
        if(num<=0)
            return false;
        int base4=log(num)/log(4);
        int ex=pow(4,base4);
        if(ex==num)
            return true;
        else
            return false;
        
    }
};
