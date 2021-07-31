class Trie {
    
    static class TrieNode{
        TrieNode[] triePoint;
        boolean isEnd;
        
        public TrieNode(){
            triePoint=new TrieNode[26];
            isEnd=false;
        }
    }
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] chr=word.toCharArray();
        TrieNode temp=root;
        for(int i=0;i<chr.length;i++){
            int x=chr[i]-'a';
            if(temp.triePoint[x]==null){
                temp.triePoint[x]=new TrieNode();
            }
            temp=temp.triePoint[x];
            System.out.print(x+" ");
        }
        temp.isEnd=true;
        System.out.println();
    }
    
    /** Returns if the word is in the trie. */
   public boolean search(String word) {
        char[] chr = word.toCharArray();
        TrieNode temp = root;
        for (char c : chr) {
            int x = c - 'a';
            if (temp.triePoint[x] != null) {
                temp = temp.triePoint[x];
            } else {
                return false;
            }
        }
        return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
        char[] chr = prefix.toCharArray();
        TrieNode temp = root;
        for (char c : chr) {
            int x = c - 'a';
            if (temp.triePoint[x] != null) {
                temp = temp.triePoint[x];
            } else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
