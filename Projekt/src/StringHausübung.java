
public class StringHausübung {

	public static void main(String[] args) {

		//Aufgabe 1:
		
		String name = "Philipp Sagmeister";
		
		int alter = 15;
		
		System.out.printf("Ihr Name ist: %s. Sie sind %d jahre alt \n",name, alter);
		
	


		// Aufgabe 2:
	
		String text = "HTL Anichstraße";
		text = text.toLowerCase();
		int pos = text.indexOf('h');
		System.out.println(pos);
		pos = text.indexOf('h', pos+1);
		System.out.println(pos);
		
		
		// Aufgabe 3:
		
		String Text = "das ist ein Text";
		Text = Text.toLowerCase();
		System.out.println(Text);
		Text = Text.replace('a', 'A');
		Text = Text.replace('e', 'E');
		Text = Text.replace('i', 'I');
		Text = Text.replace('o', 'O');
		Text = Text.replace('u', 'U');
		System.out.println(Text);
		
		
		//Aufgabe 4:
		
		String TEXT = "Das ist ein Text";
		int pos2 = Text.indexOf(' ');
		System.out.println(0);
		System.out.println(pos2+1);
		pos2 = TEXT.indexOf(' ', pos2+1);
		System.out.println(pos);
		pos2 = TEXT.indexOf(' ', pos2+1);
		System.out.println(pos2+1);
		
		
		
	}
}



