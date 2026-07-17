class Solution {
    static class Trie{
        Trie children[];
        boolean endOfWord;
        Trie(){
            children = new Trie[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
        static void insert(String word){
            Trie curr = Node;
            for(int i = 0; i < word.length(); i++){
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new Trie();
                }
                curr = curr.children[idx];
                if(i == word.length() - 1) curr.endOfWord = true;
            }
        }
        static int count(Trie curr){
            if(curr == null) return 0;
            int count = 0;
            for(int i = 0; i < 26; i++){
                if(curr.children[i] != null){
                    count += count(curr.children[i]);
                }
            }
            return count+1;
        }
        static Trie Node = new Trie();
    
    public static int countSubs(String s) {
        // code here
        Node = new Trie();
        for(int i = 0; i < s.length(); i++){
            String suffix = s.substring(i);
            insert(suffix);
        }
        return count(Node)-1;
    }
}