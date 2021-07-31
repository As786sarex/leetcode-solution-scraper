class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int[] result = new int[size - k + 1];
        final Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        for (int i = 0; i < size; ++i) {
            if (!deque.isEmpty() && deque.peek() <= i - k)
                deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast();
            deque.addLast(i);
            if (!deque.isEmpty() && i + 1 >= k)
                result[index++] = nums[deque.peek()];
        }
        return result;
    }
}
