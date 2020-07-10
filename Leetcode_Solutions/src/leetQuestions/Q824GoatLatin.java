package leetQuestions;

public class Q824GoatLatin {

	public static void main(String[] args) {

		String str = "HZ sg L";
		StringBuilder s = new StringBuilder(str);
		StringBuilder[] st = new StringBuilder[str.length()];
		int j = 0;
		int i = 0;
		for (; i < str.length() ; i++) {
			StringBuilder st1 = new StringBuilder("");
			st[j] = st1;
			while (str.charAt(i) != ' ') {
				if (i < str.length() - 1) {
					st[j].append(str.charAt(i));
					i++;
				} else {
					st[j].append(str.charAt(i));
					break;
				}
			}
			j++;
		}	
		int y=0;
		for (StringBuilder a : st) {

			if (a != null) {
				if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o'
						|| a.charAt(0) == 'u'|| a.charAt(0) == 'A' || a.charAt(0) == 'E' || a.charAt(0) == 'I' || a.charAt(0) == 'O'
						|| a.charAt(0) == 'U') {
					a.append("ma");
				} else {
					char c = a.charAt(0);
					a.deleteCharAt(0).append(c).append("ma");
				}
				for (int x = 0; x <=y; x++) {
					a.append("a");
				}
				y++;
			} else
				break;
		}
		StringBuilder fin = new StringBuilder();
		int p=0;
		for (StringBuilder a : st) {
			if(a!=null ) {
				fin.append(a);
				p++;
				if(p!=j) {
				StringBuilder fin1=new StringBuilder(" ");
				fin.append(fin1);}
				
			}
		}
		System.out.println(p);
		System.out.println(fin.toString());
	}

}
