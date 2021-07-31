class Solution {
    public int calPoints(String[] ops) {
        int one=0,two=0,sum=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine
            =0,ten=0;
        for(String s:ops){
            char chr=s.charAt(0);
            switch(chr){
                case 'C':{
                    sum-=one;
                    one=two;
                    two=three;
                    three=four;
                    four=five;
                    five=six;
                    six=seven;
                    seven=eight;
                    eight=nine;
                    nine=ten;
                    break;
                }
                case 'D':{
                    int num=(one+one);
                    sum+=num;
                    ten=nine;
                    nine=eight;
                    eight=seven;
                    seven=six;
                    six=five;
                    five=four;
                    four=three;
                    three=two;
                    two=one;
                    one=num;
                    break;
                }
                case '+':{
                    int num=(one+two);
                    sum+=num;
                    ten=nine;
                    nine=eight;
                    eight=seven;
                    seven=six;
                    six=five;
                    five=four;
                    four=three;
                    three=two;
                    two=one;
                    one=num;
                    break;
                }
                default:{
                    int x=Integer.parseInt(s);
                    sum+=x;
                    ten=nine;
                    nine=eight;
                    eight=seven;
                    seven=six;
                    six=five;
                    five=four;
                    four=three;
                    three=two;
                    two=one;
                    one=x;
                    break;
                }
            }
        }
        return sum;

    }
}
