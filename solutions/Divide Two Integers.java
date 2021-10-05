class Solution {
    public int divide(int dividend_n, int divisor_n) {
        int result = 0;
        if (divisor_n == 0)
            return Integer.MAX_VALUE;
        if (dividend_n == Integer.MIN_VALUE && divisor_n == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegetive = ((dividend_n > 0) && (divisor_n < 0)) || 
            ((dividend_n < 0) && (divisor_n > 0));
        long dividend = dividend_n < 0L ? -((long) dividend_n) : dividend_n;
        long divisor = divisor_n < 0 ? -((long) divisor_n) : divisor_n;
        if (dividend < divisor)
            return 0;
        if (dividend == divisor)
            return isNegetive ? -1 : 1;
        if (divisor == 1)
            return (int) (isNegetive ? -dividend : dividend);
        int n_pwr = 0;
        for (int i = 0; i < 32; i++) {
            if (((1L << i) & divisor) != 0)
                n_pwr = i;
        }
        for (int i = 31 - n_pwr; i >= 0; i--) {
            if ((divisor << i) <= dividend) {
                result += (1L << i);
                dividend -= divisor << i;
            }
        }
        return isNegetive ? -result : result;
    }
}
class Solution {
    public int divide(int dividend_n, int divisor_n) {
        int result = 0;
        if (divisor_n == 0)
            return Integer.MAX_VALUE;
        if (dividend_n == Integer.MIN_VALUE && divisor_n == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegetive = ((dividend_n > 0) && (divisor_n < 0)) || 
            ((dividend_n < 0) && (divisor_n > 0));
        long dividend = dividend_n < 0L ? -((long) dividend_n) : dividend_n;
        long divisor = divisor_n < 0 ? -((long) divisor_n) : divisor_n;
        if (dividend < divisor)
            return 0;
        if (dividend == divisor)
            return isNegetive ? -1 : 1;
        if (divisor == 1)
            return (int) (isNegetive ? -dividend : dividend);
        int n_pwr = 0;
        for (int i = 0; i < 32; i++) {
            if (((1L << i) & divisor) != 0)
                n_pwr = i;
        }
        for (int i = 31 - n_pwr; i >= 0; i--) {
            if ((divisor << i) <= dividend) {
                result += (1L << i);
                dividend -= divisor << i;
            }
        }
        return isNegetive ? -result : result;
    }
}
