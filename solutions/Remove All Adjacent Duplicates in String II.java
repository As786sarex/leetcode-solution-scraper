class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<s.length();++i){
            int curr=s.charAt(i);
            if(!stack.empty()&&stack.peek()[1]==k){
                    stack.pop();
            }
            if(!stack.empty()&&stack.peek()[0]==curr){
                int[] arr=stack.pop();
                ++arr[1];
                stack.push(arr);
            }else{
                stack.push(new int[]{curr,1});
            }
        }
        
        if(!stack.empty()&&stack.peek()[1]==k){
            stack.pop();
        }
        StringBuilder b=new StringBuilder();
        while(!stack.empty()){
            int[] temp=stack.pop();
            for(int i=0;i<temp[1];++i)
                b.append((char)temp[0]);
        }
        return b.reverse().toString();
    }
    
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<s.length();++i){
            int curr=s.charAt(i);
            if(!stack.empty()&&stack.peek()[1]==k){
                    stack.pop();
            }
            if(!stack.empty()&&stack.peek()[0]==curr){
                int[] arr=stack.pop();
                ++arr[1];
                stack.push(arr);
            }else{
                stack.push(new int[]{curr,1});
            }
        }
        
        if(!stack.empty()&&stack.peek()[1]==k){
            stack.pop();
        }
        StringBuilder b=new StringBuilder();
        while(!stack.empty()){
            int[] temp=stack.pop();
            for(int i=0;i<temp[1];++i)
                b.append((char)temp[0]);
        }
        return b.reverse().toString();
    }
    
}
