class Solution {
    public int majorityElement(int[] arr) {
        if (arr == null)
            return -1;
        int length = arr.length;
        int currentMajor = -1;
        int cnt = 0;
        for (final int i : arr) {
            if (cnt == 0) {
                currentMajor = i;
                ++cnt;
            } else {
                if (i == currentMajor)
                    ++cnt;
                else
                    --cnt;
            }
        }
        int confirmationCnt = 0;
        for (int i : arr) {
            if (i == currentMajor)
                ++confirmationCnt;
        }
        if (confirmationCnt >= (length / 2))
            return currentMajor;
        else
            return -1;
    }
}
