//Aufgabe 1 :

public class StringcharAt {

	static void ausgabe(String name, int alter) {

		System.out.printf("%s %d", name, alter);

		
		}

	
	public static void main(String[] args) {

		ausgabe ("Hubert", 50);
		
		
		
	//Aufgabe 2:
		
		String str = "Das ist ein Text.";
		int y = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') 
			{
				y++;
			}
			
		}
		System.out.printf("\n Wörter:" + y);
	


	//Aufgabe 3:



String stri = "a2el4ima3n";
String stri1 = "";
char a = ' ';

for (int i = 0; i < stri.length(); i++) {
a = stri.charAt(i);
if (Character.isDigit(a))		{
stri1 = stri1 + a;
			}
		}
System.out.printf("\n Die Zahlen lauten:" + stri1);
	


	//Aufgabe 4:

String string = "\n Innsbruck";
String strin = string.replace ("n" , "x");
System.out.println(strin);
	}
}
