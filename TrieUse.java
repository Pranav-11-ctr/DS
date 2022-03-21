
public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie=new Trie();
		trie.add("news");
		trie.add("this");
		System.out.println(trie.search("news"));
		trie.remove("news");
		System.out.println(trie.search("news"));
		System.out.println(trie.search("the"));
		

	}

}
