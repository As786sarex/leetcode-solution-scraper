class Solution {
    char[][] keyboard = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 
        'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } 
                };
    char[] combinationArray = null;
    List<String> combinations = null;

    public List<String> letterCombinations(String digits) {
        combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty())
            return combinations;
        int size = digits.length();
        combinationArray = new char[size];
        generateCombination(digits.toCharArray(), 0, size);
        return combinations;
    }

    void generateCombination(char[] digit, int current, int finish) {
        if (current == finish) {
            combinations.add(String.valueOf(combinationArray));
        } else {
            int pos = digit[current] - '2';
            for (char c : keyboard[pos]) {
                combinationArray[current] = c;
                generateCombination(digit, current + 1, finish);
            }
        }
    }
}
