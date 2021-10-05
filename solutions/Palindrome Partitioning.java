class Solution {
    public List<List<String>> partition(String s) {
        Deque<int[]> stack = new ArrayDeque<>();
        int len = s.length();
        List<List<String>> result = new LinkedList<>();
        byte[][] dp = new byte[len][len];
        partitionRecursion(s, dp, result, stack, 0, len - 1);
        return result;
    }

    private void partitionRecursion(String s, byte[][] dp, List<List<String>> 
        res, Deque<int[]> stack, int start, int end) {
        if (start > end) {
            List<String> l = new LinkedList<>();
            for (int[] arr : stack)
                l.add(s.substring(arr[0], arr[1] + 1));
            res.add(l);
            return;
        }

        for (int i = start; i <= end; ++i) {
            if (isPalindrome(s, start, i, dp) > 1) {
                stack.add(new int[]{start, i});
                partitionRecursion(s, dp, res, stack, i + 1, end);
                stack.pollLast();
            }
        }
    }

    private byte isPalindrome(String s, int start, int end, byte[][] dp) {
        if (start > end)
            return (byte) 2;
        if (start == end)
            return dp[start][end] = 2;
        if (dp[start][end] > 0)
            return dp[start][end];
        return dp[start][end] = (s.charAt(start) == s.charAt(end)) ? 
            isPalindrome(s, ++start, --end, dp) : 1;
    }
}
