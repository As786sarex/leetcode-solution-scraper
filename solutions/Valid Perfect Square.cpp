class Solution {
public:
    bool isPerfectSquare(int n) {
    unordered_map<int,int> mp;
    int sqr=sqrt(n);
    while (n % 2 == 0){  
        mp[2]++;
        n = n/2;
    }
    for (int i = 3; i <= sqrt(n); i = i + 2){    
        while (n % i == 0){
            mp[i]++;  
            n = n/i;  
        }  
    }
    if (n > 2)  
        mp[n]++;
    
    for(auto a:mp){
        if(a.second%2==1)
            return false;
    }
    return true;
    }
};
class Solution {
public:
    bool isPerfectSquare(int n) {
    unordered_map<int,int> mp;
    int sqr=sqrt(n);
    while (n % 2 == 0){  
        mp[2]++;
        n = n/2;
    }
    for (int i = 3; i <= sqrt(n); i = i + 2){    
        while (n % i == 0){
            mp[i]++;  
            n = n/i;  
        }  
    }
    if (n > 2)  
        mp[n]++;
    
    for(auto a:mp){
        if(a.second%2==1)
            return false;
    }
    return true;
    }
};
