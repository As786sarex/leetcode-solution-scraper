class Solution {
    private int i;


    public int calculate(String s) {
        if(i>=s.length())
            return 0;
        int result=0,operand=0,sign=1;
        for(;i<s.length();++i){
            char current=s.charAt(i);
            if(!(isOperator(current)||isOperand(current)||current=='
                ('||current==')'))
                continue;
            if(isOperator(current))
                sign=getSign(current);
            else if(isOperand(current)){
                int digits=0;
                while(i<s.length()&&isOperand(s.charAt(i))){
                    digits*=10;
                    digits+=(s.charAt(i)-'0');
                    ++i;
                }
                --i;
                operand=digits;
                result+=(sign*operand);
            } else if(current=='('){
                ++i;
                operand= calculate(s);
                result+=(sign*operand);
            } else{
                return result;
            }
        }
        return result;
    }

    int getSign(char c){
        return c=='+'?1:-1;
    }

    boolean isOperator(char c){
        return c=='+'||c=='-';
    }

    boolean isOperand(char c){
        return c>='0'&&c<='9';
    }
}
