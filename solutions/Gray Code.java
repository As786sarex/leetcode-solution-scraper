class Solution {
    public List<Integer> grayCode(int n) {
        int upto = 1 << n, prev = 1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < upto; ++i) {
            int x = i ^ (i >> 1);
            result.add(x);
        }
        return result;
    }
}
