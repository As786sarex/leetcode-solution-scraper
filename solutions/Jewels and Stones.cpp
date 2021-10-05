class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_set<char> s;
        for(auto a:J)
            s.insert(a);
        int x=0;
        for(auto a:S){
            if(s.find(a)!=s.end())
                x++;
        }
        return x;
        
    }
};
class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_set<char> s;
        for(auto a:J)
            s.insert(a);
        int x=0;
        for(auto a:S){
            if(s.find(a)!=s.end())
                x++;
        }
        return x;
        
    }
};
