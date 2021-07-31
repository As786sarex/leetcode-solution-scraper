class Solution {
    public int numPairsDivisibleBy60(int[] times) {
        int[] mods=new int[60];
        int result=0;
        for(int time:times){
            mods[time%60]++;
        }
        if(mods[0]>1)
            result=(mods[0]*(mods[0]-1))/2;
        for(int i=1;i<30;++i){
            result+=(mods[i]*mods[60-i]);
        }
        if(mods[30]>1){
            result+=(mods[30]*(mods[30]-1))/2;
        }
        return result;
    }
}
