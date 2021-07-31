class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        int ne=n;
        while(true){
            if(hs.contains(ne)){
                if(ne==1)
                    return true;
                else 
                    return false;
            }
            else 
                hs.add(ne);
            while(ne>0){
            int digit=ne%10;
            ne=ne/10;
            sum+=(digit*digit);
            }
            ne=sum;
            sum=0;
        }
        
    }
}
