import static java.lang.Math.abs;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int x:asteroids){
            if(x<0){
                while(!stack.empty()&&stack.peek()>0&&(stack.peek()+x)<0)
                    stack.pop();
                if(stack.empty()){
                    stack.push(x);
                    continue;
                }
                if(stack.peek()+x==0&&stack.peek()>0)
                    stack.pop();
                else if(!stack.empty()&&stack.peek()<0)
                    stack.push(x);
            } else 
                stack.push(x);
        }
        int n=stack.size();
        int[] res=new int[n];
        for(int i=0;i<n;++i){
            res[n-1-i]=stack.pop();
        }
        return res;
    }
}
import static java.lang.Math.abs;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int x:asteroids){
            if(x<0){
                while(!stack.empty()&&stack.peek()>0&&(stack.peek()+x)<0)
                    stack.pop();
                if(stack.empty()){
                    stack.push(x);
                    continue;
                }
                if(stack.peek()+x==0&&stack.peek()>0)
                    stack.pop();
                else if(!stack.empty()&&stack.peek()<0)
                    stack.push(x);
            } else 
                stack.push(x);
        }
        int n=stack.size();
        int[] res=new int[n];
        for(int i=0;i<n;++i){
            res[n-1-i]=stack.pop();
        }
        return res;
    }
}
