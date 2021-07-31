class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(first,second)->{
            String[] subArr1=first.split(" ");
            String[] subArr2=second.split(" ");
            if(Character.isAlphabetic(subArr1[1].charAt(0))){
                if(Character.isAlphabetic(subArr2[1].charAt(0))){
                    String sub1=first.substring(subArr1[0].length());
                    String sub2=second.substring(subArr2[0].length());
                    if(sub1.equals(sub2)){
                        return subArr1[0].compareTo(subArr2[0]);
                    } else{
                        return sub1.compareTo(sub2);
                    }
                } else{
                    return -1;
                }
            } else{
                if(Character.isAlphabetic(subArr2[1].charAt(0))){
                    return 1;
                } else{
                    return 0;
                }
            }
        });
        return logs;
    }
}
