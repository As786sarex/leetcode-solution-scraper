class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer i : nums) {
            if (pq.size() < k) {
                pq.add(i);
            } else if (pq.peek() < i) {
                pq.poll();
                pq.add(i);
            }
        }
        return pq.peek();
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer i : nums) {
            if (pq.size() < k) {
                pq.add(i);
            } else if (pq.peek() < i) {
                pq.poll();
                pq.add(i);
            }
        }
        return pq.peek();
    }
}
