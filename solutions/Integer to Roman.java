class Solution {
    int[] vals={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV"
        ,"I"};
    
    public String intToRoman(int num) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        while(num>0){
            int divisor=num/vals[i];
            if(divisor>0){
                for(int j=0;j<divisor;++j){
                    builder.append(symbols[i]);
                }
                num-=vals[i]*divisor;
            }
            ++i;
        }
        return builder.toString();
    }
}
