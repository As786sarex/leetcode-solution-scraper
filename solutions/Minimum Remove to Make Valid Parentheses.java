class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] chr=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        Stack<Integer> index=new Stack<>();
        for(int i=0;i<chr.length;++i){
            if(chr[i]=='('){
                stack.push(chr[i]);
                index.push(i);
            } else if(chr[i]==')'){
                if(!stack.empty()&&stack.peek()=='('){
                    stack.pop();
                    index.pop();
                } else {
                    stack.push(chr[i]);
                    index.push(i);
                }
            }
        }
        int x=stack.size();
        while(!stack.empty()){
            int temp=index.pop();
            stack.pop();
            chr[temp]='-';
        }
        StringBuilder b=new StringBuilder(x);
        for(char c:chr)
            if(c!='-')
                b.append(c);
        return b.toString();
    }
}
