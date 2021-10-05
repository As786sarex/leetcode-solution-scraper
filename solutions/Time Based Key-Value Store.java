class TimeMap {

    /** Initialize your data structure here. */
    Map<String,List<Pair>> mp;
    public TimeMap() {
        mp=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key))
            mp.put(key,new ArrayList<>());
        mp.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!mp.containsKey(key))
            return "";
        return binarySearch(mp.get(key),timestamp);
    }
    
    private String binarySearch(List<Pair> list,int time){
        int low = 0, high = list.size() - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (list.get(mid).time == time) return list.get(mid).val;
            if (list.get(mid).time < time) {
                if (list.get(mid+1).time > time) return list.get(mid).val;
                low = mid + 1;
            }
            else high = mid -1;
        }
        return list.get(low).time <= time ? list.get(low).val : "";
    }
}

class Pair{
    int time;
    String val;
    Pair(String v,int t){
        time=t;
        val=v;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
