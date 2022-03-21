class TrieNode
{
	char data;
	boolean isTreminating;
	TrieNode[] children;
	int childCount;
	
	public TrieNode(char data)
	{
		this.data=data;
		isTreminating=false;
		children=new TrieNode[26];
		 childCount=0;
		
	}
}



public class Trie {
	private TrieNode root;
	
	public Trie()
	{
		root=new TrieNode('\0');
	}
	
	
	private void add(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isTreminating=true;
			return;
		}
		
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null)
		{
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		add(child,word.substring(1));
		
	}
	public void add(String word)
	{
		add(root,word);
	}
	
	public boolean search(String word)
	{
		return search(root,word);
	}


	private boolean search(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length()==0)
		{
			//here because if news is not equal to new   here new is end but the store string is news so false;
			return root.isTreminating;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null)
			return false;
	    else
		 return search(child,word.substring(1));
	}
	
//	 private boolean search(TrieNode root,String word)
//	    {
//	        if(word.length()==0)
//	        {
//	            return root.isTreminating;
//	        }
//	       int childIndex = word.charAt(0) - 'a';
//			TrieNode child = root.children[childIndex]; 
//	        if(child==null)
//	        {
//	            return false;
//	        }
//	        else
//	        {
//	            return search(child,word.substring(1));
//	        }
//	    }
//		public boolean search(String word){
//			// Write your code here
//	        return search(root,word);
//	        
//		}
	
	public void remove(String word)
	{
		remove(root,word);
	}

//This is a fine code but here we didn't delete atleast word so space remains same
//private void remove(TrieNode root, String word) {
//	
//	if(word.length()==0) {
//		root.isTreminating=false;
//	    return;
//	    }
//	
//	int childIndex=word.charAt(0)-'a';
//	TrieNode child=root.children[childIndex];
//	if(child==null)
//	{
//		return;
//	}
//	remove(child,word.substring(1));
//	
//}

private void remove(TrieNode root, String word) {
	
	if(word.length()==0) {
		root.isTreminating=false;
	    return;
	    }
	
	int childIndex=word.charAt(0)-'a';
	TrieNode child=root.children[childIndex];
	if(child==null)
	{
		return;
	}
	remove(child,word.substring(1));
	
	
	if(!child.isTreminating && child.childCount==0)
	{
		root.children[childIndex]=null;
		child=null;//it is optional
		root.childCount--;
		
	}
	//we can remove child node only if it is non terminating and its number of children are 0

	
	
	
	//We can remove complexity it by adding one child count in trie node
	//	if(!child.isTreminating )
//	{
//		int numChild=0;
//		for(int i=0;i<26;i++)
//		{
//			if(child.children[i]!=null)
//			{
//				numChild++;
//			}
//		}
//		if(numChild==0)
//		{
//			root.children[childIndex]=null;
//	child=null;//it is optional
//		}
//	}
	
}
	
	
}
