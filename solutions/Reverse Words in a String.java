class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder builder=new StringBuilder();
        for (int i = str.length-1; i>0 ; i--) {
            builder.append(str[i]).append(" ");
        }
        builder.append(str[0]);
        return builder.toString();
    }
}
