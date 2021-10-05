class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        char[] buffer=new char[2*n];
        buffer[0]='(';
        generate(result,buffer,1,n-1,n,1);
        return result;
    }
    
    void generate(List<String> result,char[] buffer,int index,int open,int 
        close,int left){
        if(open==0&&close==0){
            result.add(String.valueOf(buffer));
            return;
        }
        if(open>0){
            buffer[index]='(';
            generate(result,buffer,index+1,open-1,close,left+1);
        }
        
        if(close>0&&left>0){
            buffer[index]=')';
            generate(result,buffer,index+1,open,close-1,left-1);
        }
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        char[] buffer=new char[2*n];
        buffer[0]='(';
        generate(result,buffer,1,n-1,n,1);
        return result;
    }
    
    void generate(List<String> result,char[] buffer,int index,int open,int 
        close,int left){
        if(open==0&&close==0){
            result.add(String.valueOf(buffer));
            return;
        }
        if(open>0){
            buffer[index]='(';
            generate(result,buffer,index+1,open-1,close,left+1);
        }
        
        if(close>0&&left>0){
            buffer[index]=')';
            generate(result,buffer,index+1,open,close-1,left-1);
        }
    }
}
