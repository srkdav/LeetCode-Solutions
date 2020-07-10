package leetQuestions;

public class Q211Word {

	TrieNode root;

	Q211Word() {
		root = new TrieNode();
	}

	public void addWord(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!node.containsKey(ch)) {
				node.put(ch, new TrieNode());
			}
			node = node.get(ch);
		}
		node.setisEnd();
	}

	public void search(String word) {
		TrieNode node = root;
		boolean ans = searchHelper(word, node, 0);
		System.out.println(ans);
	}

	public boolean searchHelper(String word, TrieNode node, int idx) {
		if (idx >=word.length()) {
			return node.getisEnd();
		}
		if (word.charAt(idx) == '.') {
			for (int j = 97; j < 123; j++) {
				char ch = (char) j;
				if (node.containsKey(ch)) {
					if (searchHelper(word, node.get(ch), idx + 1)) {
						return true;
					}
				}
			}
		} else {
			return node.containsKey(word.charAt(idx)) && searchHelper(word, node.get(word.charAt(idx)), idx + 1);
		}
		return false;
	}

	public static void main(String[] args) {

		Q211Word node = new Q211Word();
		node.addWord("at");
		node.addWord("and");
		node.addWord("an");
		node.addWord("add");
		node.search("a");
		node.search(".at");
		node.addWord("bat");
		node.search(".at");
	}

}
