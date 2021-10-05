class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int sz=heights.size();
        if(heights.size()==0)
            return 0;
        int cnt=0;
        int v[sz];
        for(int i=0;i<sz;++i)
            v[i]=heights[i];
        sort(v,v+sz);
        for(int i=0;i<sz;++i){
            if(v[i]!=heights[i])
                cnt++;
        }
        return cnt;
    }
};
class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int sz=heights.size();
        if(heights.size()==0)
            return 0;
        int cnt=0;
        int v[sz];
        for(int i=0;i<sz;++i)
            v[i]=heights[i];
        sort(v,v+sz);
        for(int i=0;i<sz;++i){
            if(v[i]!=heights[i])
                cnt++;
        }
        return cnt;
    }
};
