class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        if(tickets == null || tickets.size() == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for(List<String> ticket : tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);
            if(!map.containsKey(from)){
                map.put(from, new PriorityQueue<>());
            }
            map.get(from).offer(to);
        }
        
        dfs(map, res, "JFK");
        return res;
    }
    private void dfs(Map<String, PriorityQueue<String>> map, List<String> res, 
        String curr){
        
        PriorityQueue<String> nexts = map.get(curr);
        while(nexts != null && !nexts.isEmpty()){
            String next = nexts.poll();
            dfs(map, res, next);
        }
        res.add(0, curr);
    }
}
