class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chr=s.toCharArray();
        for(int i=0;i<chr.length;i++){
            if (chr[i]=='('||chr[i]=='{'||chr[i]=='['){
                stack.push(chr[i]);
            }
            else{
                if (stack.empty()){
                    return false;
                }
                else {
                    char c=stack.pop();
                    if(chr[i]==')'&&c=='(')
                        continue;
                    else if(chr[i]=='}'&&c=='{')
                        continue;
                    else if(chr[i]==']'&&c=='[')
                        continue;
                    else
                        return false;
                }
            }
        }
        return stack.empty();
        
    }
}
