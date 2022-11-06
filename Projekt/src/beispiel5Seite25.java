
public class beispiel5Seite25 {

	public static void main(String[] args) {

		String str = "Mois ist ein Ehrenmann";
		char c = ' ';
		String str2 = " ";
		
		
		
		for (int i = 0; i < str.length(); i++) {
			
			str = str.toLowerCase();
			c = str.charAt(i);
			if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				str2 = str2 + c;
			}
			
		}
		System.out.println(str2);
	}

}
