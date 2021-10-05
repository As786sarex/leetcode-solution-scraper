class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
                return a[1]-b[1];
        });
        int end=intervals[0][1];
        int cnt=1;
        for(int i=1;i<intervals.length;++i){
            if(end<=intervals[i][0]){
                ++cnt;
                end=intervals[i][1];
            }
        }
        return intervals.length-cnt;
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
                return a[1]-b[1];
        });
        int end=intervals[0][1];
        int cnt=1;
        for(int i=1;i<intervals.length;++i){
            if(end<=intervals[i][0]){
                ++cnt;
                end=intervals[i][1];
            }
        }
        return intervals.length-cnt;
    }
}
