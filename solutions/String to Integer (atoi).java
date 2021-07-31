class Solution {

    int INT_MAX_D = 2147483647;
    int INT_MIN_D = -2147483648;

    public int myAtoi(String s) {
        boolean isMinus = false, isNonZeroOccured = false;
        int[] minusLimit = { 2, 1, 4, 7, 4, 8, 3, 6, 4, 8 };
        int[] plusLimit = { 2, 1, 4, 7, 4, 8, 3, 6, 4, 7 };
        Queue<Integer> digits = new LinkedList<>();
        String trimmed = s.trim();
        if (trimmed.isEmpty())
            return 0;
        char[] chars = trimmed.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (i == 0 && chars[0] == '+')
                continue;
            if (i == 0 && chars[0] == '-') {
                isMinus = true;
                continue;
            }
            if (!isNonZeroOccured && chars[i] == '0') {
                continue;
            } else {
                isNonZeroOccured = true;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                digits.add(chars[i] - '0');
            } else if (chars[i] == ' ') {
                break;
            } else {
                break;
            }

            if (digits.size() > minusLimit.length) {
                if (isMinus)
                    return INT_MIN_D;
                else
                    return INT_MAX_D;
            }
        }
        if (digits.isEmpty())
            return 0;
        else if (digits.size() == minusLimit.length) {
            if (isMinus)
                return -1 * getParsedIntegerIfEqual(isMinus, minusLimit, 
                    digits);
            else
                return getParsedIntegerIfEqual(isMinus, plusLimit, digits);
        } else {
            if (isMinus)
                return -1 * parseFromQueue(digits);
            else
                return parseFromQueue(digits);
        }
    }

    int parseFromQueue(Queue<Integer> digits) {
        int result = 0;
        while (!digits.isEmpty()) {
            int digit = digits.poll();
            result = (result * 10) + digit;
        }
        return result;
    }

    int getParsedIntegerIfEqual(boolean isMinus, int[] limits, Queue<Integer> 
        digits) {
        int result = 0;
        for (int i = 0; i < limits.length; i++) {
            int digit = digits.poll();
            if (digit < limits[i]) {
                result = (result * 10) + digit;
                break;
            } else if (digit > limits[i]) {
                if (isMinus)
                    return INT_MIN_D;
                else
                    return INT_MAX_D;
            } else {
                result = (result * 10) + digit;
            }
        }
        while (!digits.isEmpty()) {
            int digit = digits.poll();
            result = (result * 10) + digit;
        }
        return result;
    }
}
