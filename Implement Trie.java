class Trie {
    class Node{
        Node[] child=new Node[26];
        boolean isEnd;
    }
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node current=root;
        for (char c:word.toCharArray()){
            int index=c-'a';
            if (current.child[index]==null){
                current.child[index]=new Node();
            }
            current=current.child[index];
        }
        current.isEnd=true;
    }
    
    public boolean search(String word) {
        Node current=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return current.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node current=root;
        for(char c:prefix.toCharArray()){
            int index=c-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return true;
    }
}
 Trie object 
