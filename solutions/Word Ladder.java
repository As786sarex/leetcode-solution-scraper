class Solution {
    public int ladderLength(String start, String end, List<String> list) {
        HashSet<String> wordlist=new HashSet<>(list);
        if (start.equals(end) || !wordlist.contains(end))
            return 0;
        Queue<String> queue = new LinkedList<>();
        int level = 0;
        int currentLevel = 1;
        queue.add(start);
        while (!queue.isEmpty()) {
            ++level;
            while (currentLevel > 0) {
                String token = queue.poll();
                boolean isFound = computeCurrentLevel(token, end, wordlist, 
                    queue);
                if (isFound) return level + 1;
                --currentLevel;
            }
            currentLevel = queue.size();
        }
        return 0;
    }
    private boolean computeCurrentLevel(String token, String end,
                                               final HashSet<String> wordlist, 
                                       final Queue<String> queue) {
        char[] currentElement = Objects.requireNonNull(token).toCharArray();
        for (int i = 0; i < currentElement.length; i++) {
            for (char j = 'a'; j <= 'z'; ++j) {
                char temp = currentElement[i];
                currentElement[i] = j;
                String afterModification = String.valueOf(currentElement);
                if (afterModification.equals(token))
                    continue;
                if (end.equals(afterModification))
                    return true;
                if (wordlist.contains(afterModification)) {
                    wordlist.remove(afterModification);
                    queue.add(afterModification);
                }
                currentElement[i] = temp;
            }
        }
        return false;
    }
}
