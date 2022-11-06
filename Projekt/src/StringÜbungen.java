
public class String‹bungen {

	public static void main(String[] args) {
		
		String s = "Das ist ein ganz normaler Text";
				s.indexOf('s');
				int pos = s.indexOf('s');
				System.out.printf("Position: %d\n", pos);
				pos = s.indexOf('s', pos+1);
				System.out.printf("Position: %d\n", pos);
				pos = s.indexOf('s', pos+1);
				System.out.printf("Position: %d\n", pos);
				
				char c = s.charAt(8);
				System.out.printf("%s\n", c);
				
				int l = s.length();
				System.out.println(l);
				
				s = s.toUpperCase();
				System.out.println(s);
				
				s = s.toLowerCase();
				System.out.println(s);
				
				s = s.replace('a', 'i');
				System.out.println(s);
				
				String name = "     Hubert Staller     ";
				name.replace(' ', '_');
				System.out.println(name);
				
				
				name = name.trim();
				
				String s2 = "Hallo HTL";
				String s2sub = s2.substring(6);
				System.out.println(s2sub);
	}

}
