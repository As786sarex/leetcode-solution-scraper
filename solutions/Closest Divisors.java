class Solution {
    public int[] closestDivisors(int n) {
        int[] one=getMinDiffDivisor(n+1);
        int[] two=getMinDiffDivisor(n+2);
        
        return ((one[1]-one[0])<(two[1]-two[0]))?one:two;
        
    }
    
    int[] getMinDiffDivisor(int n){
        int sqr=(int) Math.sqrt(n);
        int min=(int) 1e9+7;
        int[] result=new int[2];
        for(int i=1;i<=sqr;++i){
            if(n%i==0){
                int comp=n/i;
                if((comp-i)<min){
                    min=comp-i;
                    result[0]=i;
                    result[1]=comp;
                }
            }
        }
        return result;
    }
}
