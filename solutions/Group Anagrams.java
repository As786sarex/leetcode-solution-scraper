class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        int[] chars = new int[26];
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (char c : strs[i].toCharArray()) {
                chars[c - 'a']++;
            }
            final String s = Arrays.toString(chars);
            Arrays.fill(chars,0);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        int[] chars = new int[26];
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (char c : strs[i].toCharArray()) {
                chars[c - 'a']++;
            }
            final String s = Arrays.toString(chars);
            Arrays.fill(chars,0);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
