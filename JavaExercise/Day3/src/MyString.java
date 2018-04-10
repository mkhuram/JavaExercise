
class MyString {
	public void printMessage(String M) {
		for(int i = 0; i < M.length(); i++) {
			System.out.println(M.substring(i, i + 1));
		}
	}
	
	public void printRevMessage(String M) {
		for(int i = M.length() - 1; i >= 0; i--) {
			System.out.println(M.substring(i, i + 1));
		}
	}
	
	public void numberOfWords(String M) {
		int word = 0;
		for(int i = 0; i < M.length() - 1; i++) {
			if(M.substring(i, i + 1).equals(" "))
				word++;
			}
			System.out.println(word+1);
	}
	
	public void printNextLine(String M) {
		for(int i = 0; i < M.length(); i++) {
			if (M.substring(i,i+1).equals(" "))
				System.out.println();
			else
				System.out.print(M.substring(i, i+1));
			}
	}
	
	public void reverseOrder(String M) {
		for(int i = M.length() - 1; i >= 0; i--) {
			if (M.substring(i, i + 1).equals(" "))
				System.out.println();
			else
				System.out.print(M.substring(i, i + 1));
		}
	}
}

