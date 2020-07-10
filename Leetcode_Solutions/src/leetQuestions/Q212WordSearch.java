package leetQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q212WordSearch {

	TrieNode root;
	Set<String> res = new HashSet<String>();

	Q212WordSearch() {
		root = new TrieNode();
	}

	public void addWord(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			if (!node.containsKey(ch)) {
				node.put(ch, new TrieNode());
			}
			node = node.get(ch);
		}
		node.setisEnd();
	}

	public void findList1(char a[][]) {
		TrieNode node = root;
		String ans = "";
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (node.containsKey(a[row][col])) {
					dfs1(a, row, col, ans);
				}
			}
		}
		System.out.println(res);
	}

	public void dfs1(char a[][], int row, int col, String ans) {
		if (col < 0 || row < 0 || row >= a.length || col >= a[row].length || a[row][col] == '$') {
			return;
		}
		ans = ans + a[row][col];
		if (!startsWith(ans)) {
			return;
		}
		if (search(ans)) {
			res.add(ans);
		}
		Character ch = a[row][col];
		a[row][col] = '$';
		dfs1(a, row - 1, col, ans);
		dfs1(a, row + 1, col, ans);
		dfs1(a, row, col + 1, ans);
		dfs1(a, row, col - 1, ans);
		a[row][col] = ch;
	}

	public boolean search(String word) {
		TrieNode node = root;
		boolean ans = searchHelper(word, node, 0);
		return ans;
	}

	public boolean searchHelper(String word, TrieNode node, int idx) {
		if (idx >= word.length()) {
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

	public boolean startsWith(String prefix) {
		TrieNode node = root;
		for (char c : prefix.toCharArray()) {
			if (node.get(c) == null)
				return false;
			node = node.get(c);
		}
		return true;
	}

	public static void findList(char a[][], String[] words) {
		HashMap<Character, List<Integer[]>> hm = new HashMap<>();
		for (String word : words) {
			char ch = word.charAt(0);
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[row].length; col++) {
					if (a[row][col] == ch) {
						Integer[] start = new Integer[2];
						start[0] = row;
						start[1] = col;
						if (hm.containsKey(ch)) {
							List<Integer[]> list = hm.get(ch);
							list.add(start);
							hm.put(ch, list);
						} else {
							List<Integer[]> list = new ArrayList<>();
							list.add(start);
							hm.put(ch, list);
						}
					}
				}
			}
		}
		List<String> ans = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			char ch = words[i].charAt(0);
			List<Integer[]> list = hm.get(ch);
			if (list != null)
				for (Integer[] start : list) {
					if (dfs(a, hm, words[i], start[0], start[1], ans, 0)) {
						ans.add(words[i]);
						break;
					}
				}
		}
		System.out.println(ans);
	}

	public static boolean dfs(char[][] a, HashMap<Character, List<Integer[]>> hm, String word, int row, int col,
			List<String> ans, int idx) {
		if (row < 0 || row >= a.length || col < 0 || col >= a[row].length || idx >= word.length()
				|| a[row][col] == '$') {
			return false;
		}
		if (idx == word.length() - 1) {
			if (a[row][col] == word.charAt(idx))
				return true;
			else {
				return false;
			}
		}
		if (a[row][col] == word.charAt(idx)) {
			a[row][col] = '$';
			boolean r = dfs(a, hm, word, row, col + 1, ans, idx + 1);
			boolean l = dfs(a, hm, word, row, col - 1, ans, idx + 1);
			boolean u = dfs(a, hm, word, row - 1, col, ans, idx + 1);
			boolean d = dfs(a, hm, word, row + 1, col, ans, idx + 1);
			a[row][col] = word.charAt(idx);
			return r || l || u || d;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		char[][] a = new char[][] { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };

		String[] words = new String[] { "oath", "pea", "eat", "rain" };
		Q212WordSearch q = new Q212WordSearch();
		for (String w : words) {
			q.addWord(w);
		}

		q.findList1(a);
	}

}
