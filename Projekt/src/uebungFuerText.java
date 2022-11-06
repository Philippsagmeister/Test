
public class uebungFuerText {

	public static void main(String[] args) {
		
			String str = "Das ist ein Text";
			char c = ' ';
			
			for (int i = 0; i < str.length(); i++) {
			
			c = str.charAt(i);
			if (Character.isUpperCase(c)) {

			str = str.replace (c , 'x');

			}
			
			}
			System.out.println (str);
	}

}
