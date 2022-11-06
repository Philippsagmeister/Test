
public class StringBsp {
	

		public static void main(String[] args) {
			int i = 12;
			//          0123456
			String s = "HTL HTL";
			int l = s.length();
			System.out.println(l);
			
			char c = s.charAt(1);
			System.out.println(c);
			
			int posL = s.indexOf('L');
			System.out.println(posL);
			
			int posL2 = s.indexOf('L', 3);
			System.out.println(posL2);
			
			int pos = s.indexOf('X');
			System.out.println(pos);
			
			String s2 = s.toLowerCase();
			System.out.println(s2);
			
			String sub = s.substring(4, 7);
			System.out.println(sub);
		}

	}