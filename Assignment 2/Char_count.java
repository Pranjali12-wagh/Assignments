package demo;







public class Char_count {
	public static void main(String[] args) {
		Char_count cc = new Char_count();
		cc.countChars("Hello World");
	}

	public void countChars(String str) {
		char[] strArr;
		do {
			strArr = str.toCharArray();
			char ch = strArr[0];
			int count = 1;
			for (int i = 1; i < strArr.length; i++) {
				if (ch == strArr[i]) {
					count++;
				}
			}
			
			if (((ch != ' ') && (ch != '\t'))) {
				System.out.println(ch + " - " + count);
			}
			
			str = str.replace("" + ch, "");
		} while (strArr.length > 1);
	}

}

