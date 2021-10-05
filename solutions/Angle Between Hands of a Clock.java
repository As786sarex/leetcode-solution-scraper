class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12)
            hour=0;
        double ans=Math.abs((minutes*(360.0/60.0))-((hour+(((double)minutes)/60
            .0))*(360.0/12.0)));
        return Math.min(360.0-ans,ans);
    }
}
class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12)
            hour=0;
        double ans=Math.abs((minutes*(360.0/60.0))-((hour+(((double)minutes)/60
            .0))*(360.0/12.0)));
        return Math.min(360.0-ans,ans);
    }
}
