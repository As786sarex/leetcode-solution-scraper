import static java.lang.Integer.max;
import java.util.Arrays;
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] answer={-1,-1,-1};
        for(int[] triplet:triplets){
            if(triplet[0]<=target[0]&&triplet[1]<=target[1]&&triplet[2]
                <=target[2]){
                answer[0]=max(answer[0],triplet[0]);
                answer[1]=max(answer[1],triplet[1]);
                answer[2]=max(answer[2],triplet[2]);
                }
        }
        return Arrays.equals(answer,target);
    }
}
