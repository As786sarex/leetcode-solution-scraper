class Solution {
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts);
        Arrays.sort(vCuts);
        long maxH=hCuts[0],maxV=vCuts[0];
        long mod=(long) 1e9+7;
        for(int i=1;i<=hCuts.length;++i){
            if(i==hCuts.length){
                maxH=Long.max(maxH,h-hCuts[i-1]);
                break;
            }
            maxH=Long.max(maxH,hCuts[i]-hCuts[i-1]);
        }
        
        for(int i=1;i<=vCuts.length;++i){
            if(i==vCuts.length){
                maxV=Long.max(maxV,w-vCuts[i-1]);
                break;
            }
            maxV=Long.max(maxV,vCuts[i]-vCuts[i-1]);
        }
        
        maxH%=mod;
        maxV%=mod;
        return (int) ((maxH*maxV)%mod);
    }
}
