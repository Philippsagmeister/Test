package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket s = null;
		DataOutputStream dout = null;
		try {
			s = new Socket("localhost", 6666);
			dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF(readTerminal());
			dout.flush();

			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String response = "";
			while ((response = in.readLine()) != null) {
				System.out.println(response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
				dout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String readTerminal() {
		Scanner s = new Scanner(System.in);
		System.out.println("Senden(erstelle) oder Empfangen(zeige):");
		String sendenEmpfangen = s.nextLine();
		String rückgabe;
		if (sendenEmpfangen.equals("erstelle")) {
			System.out.println("Dateinamen eingeben:");
			String dateiname = s.nextLine();
			System.out.println("Inhalt eingeben:");
			String text = s.nextLine();
			s.close();
			rückgabe = sendenEmpfangen + "#" + dateiname + ".txt" + "#" + text;
		} else if (sendenEmpfangen.equals("zeige")) {
			s.close();
			rückgabe = sendenEmpfangen;
		} else {
			System.out.println("Falsche Eingabe");
			rückgabe = "";
		}
		return rückgabe;
	}

}