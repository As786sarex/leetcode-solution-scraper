class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        char[] buffer=s.toCharArray();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<buffer.length;i++)
            if(buffer[i]>60)
                arr.add(i);
        if(arr.size()==0){
            result.add(s);
            return result;
        }
        generate(result,buffer,arr,0);
        return result;
    }
    
    void generate(List<String> result,char[] buffer,List<Integer> indexes,int 
        current){
        if(current>=indexes.size()){
            result.add(String.valueOf(buffer));
            return;
        }
        int point=indexes.get(current);
        char c=buffer[point];
        generate(result,buffer,indexes,current+1);
        if(Character.isUpperCase(c)){
            buffer[point]=(char)(c+32);
            generate(result,buffer,indexes,current+1);
        } else {
            buffer[point]=(char)(c-32);
            generate(result,buffer,indexes,current+1);    
        }
        buffer[point]=c;
    }
}
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        char[] buffer=s.toCharArray();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<buffer.length;i++)
            if(buffer[i]>60)
                arr.add(i);
        if(arr.size()==0){
            result.add(s);
            return result;
        }
        generate(result,buffer,arr,0);
        return result;
    }
    
    void generate(List<String> result,char[] buffer,List<Integer> indexes,int 
        current){
        if(current>=indexes.size()){
            result.add(String.valueOf(buffer));
            return;
        }
        int point=indexes.get(current);
        char c=buffer[point];
        generate(result,buffer,indexes,current+1);
        if(Character.isUpperCase(c)){
            buffer[point]=(char)(c+32);
            generate(result,buffer,indexes,current+1);
        } else {
            buffer[point]=(char)(c-32);
            generate(result,buffer,indexes,current+1);    
        }
        buffer[point]=c;
    }
}
