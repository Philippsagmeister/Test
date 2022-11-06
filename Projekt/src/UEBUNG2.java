
public class UEBUNG2 {

	public static void main(String[] args) {

		char c = ' ';
		String str = "6h9d7wa9dj9k2";
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			c =  str.charAt(i);
			if (Character.isDigit(c)) {
				str2 = str2 + c;
				
			}
			
			
		}
		System.out.printf(str2);
		
	}

}
