class Solution {
   public int calculate(String s) {
        Deque<Integer> operands = new ArrayDeque<>(3);
        Deque<Integer> operator = new ArrayDeque<>(2);
        int len = s.length(), result = 0;
        for (int i = 0; i < len; ++i) {
            char current = s.charAt(i);
            if (!validateOperands(current) && !validateOperator(current))
                continue;

            int currentInt = current - '0';
            if (validateOperands(current)) {
                while (i+1 <len && validateOperands(s.charAt(i + 1))) {
                    currentInt *= 10;
                    currentInt += (s.charAt(i + 1) - '0');
                    ++i;
                }
                operands.addLast(currentInt);
                currentInt = 0;
            } else if (validateOperator(current))
                operator.addLast((int) current);
            if (operands.size() != 3 || operator.size() != 2)
                continue;
            getValidOp(operands, operator);
        }
        if (operands.size() == 2 && operator.size() == 1) {
            int op2 = operands.pollLast();
            int op1 = operands.pollLast();
            int symbol = operator.pollLast();
            result = calculateIndividual(op1, op2, symbol);
        } else if (operands.size() == 1 && operator.size() == 0)
            result = operands.pollLast();
        return result;
    }

    private void getValidOp(Deque<Integer> operands, Deque<Integer> operator) 
        {
        int operator1 = operator.peekFirst();
        int operator2 = operator.peekLast();
        int op1 = 0, op2 = 0, symbol = 0;
        if (lowerPrecedence((char) operator1) && higherPrecedence((char) 
            operator2)) {
            op2 = operands.pollLast();
            op1 = operands.pollLast();
            symbol = operator.pollLast();
            operands.addLast(calculateIndividual(op1, op2, symbol));
        } else {
            op1 = operands.pollFirst();
            op2 = operands.pollFirst();
            symbol = operator.pollFirst();
            operands.addFirst(calculateIndividual(op1, op2, symbol));
        }
    }

    private boolean validateOperands(char c) {
        return (c >= '0' && c <= '9');
    }

    private boolean validateOperator(char c) {
        return lowerPrecedence(c) || higherPrecedence(c);
    }

    private boolean lowerPrecedence(char c) {
        return c == '+' || c == '-';
    }

    private boolean higherPrecedence(char c) {
        return c == '*' || c == '/';
    }

    private int calculateIndividual(int op1, int op2, int operator) {
        switch (operator) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            default:
                return op1 / op2;
        }
    }
}
