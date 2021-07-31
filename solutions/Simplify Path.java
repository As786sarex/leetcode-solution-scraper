class Solution {
    public String simplifyPath(String path) {
        String[] paths=path.split("/+");
        Stack<String> stack=new Stack<>();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<paths.length;++i){
            if(i==0&&paths[0].length()==0)
                continue;
            if(".".equals(paths[i]))
                continue;
            else if("..".equals(paths[i])){
                if(!stack.empty())
                    stack.pop();
            }
            else
                stack.push(paths[i]);
        }
        if(stack.empty())
            return "/";
        for(String s:stack){
            b.append('/');
            b.append(s);
        }
        return b.toString();
    }
}
