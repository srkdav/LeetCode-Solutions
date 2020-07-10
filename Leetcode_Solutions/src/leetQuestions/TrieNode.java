package leetQuestions;

public class TrieNode {

	private TrieNode[] trieNode;
	private boolean isEnd;
	TrieNode(){
		trieNode = new TrieNode[26];
	}
	public void put(char ch, TrieNode node) {
		trieNode[ch-'a']=node;
	}
	public boolean containsKey(char ch) {
		return trieNode[ch-'a']!=null;
	}
	
	public void setisEnd() {
		isEnd=true;
	}
	public boolean getisEnd() {
		return isEnd;
	}
	
	public TrieNode get(char ch) {
		return trieNode[ch-'a'];
	}
}
