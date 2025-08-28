
class StringSubString {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		int count=0;
		// System.out.println("Enter First string:");
		String str = "sri ssrim dri ssrim sri 1srimsrim";
		// System.out.println("Enter Second string:");
		String str1 = "sri";
		int str1len=str1.length();

		for (int i = 0; i < str.length(); i++) {
			int check=i+str1len;
			if(check<str.length()-1) {
				String checker =str.substring(i,i+str1len+2);
				if(checker.contains(str1) && !checker.contains(" ") && checker.charAt(1)==str1.charAt(0)) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}