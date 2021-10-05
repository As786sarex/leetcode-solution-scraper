class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(numRows == 1) {
            return s;
        }
        StringBuilder b = new StringBuilder(len);
        int current = numRows - 1;
        for(int i=0;i<len;i+=(current*2)) {
            //System.out.println(i);
            b.append(s.charAt(i));
        }
        for(int i=1;i<current;++i) {
            int curr = current - i;
            int rev = i;
            for(int j=i;j<len;){
                //System.out.println(i+" "+j+" "+curr);
                b.append(s.charAt(j));
                j+=(curr*2);
                int temp = curr;
                curr = rev;
                rev = temp;
            }
        }
        for(int i=current;i<len;i+=(current*2)) {
            b.append(s.charAt(i));
        }
        return b.toString();
    }
}
