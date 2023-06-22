package Chat_Erweiterung;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class EinfacherChatClient extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JTextArea eingehend;
    private JTextField ausgehend;
    private JTextField nameField; // Textfeld für den Namen
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket sock;
    private String clientName; // Name des Clients

    public EinfacherChatClient(String title) {
        super(title);
        JPanel hauptPanel = new JPanel();
        eingehend = new JTextArea(15, 20);
        eingehend.setLineWrap(true);
        eingehend.setWrapStyleWord(true);
        eingehend.setEditable(false);
        JScrollPane fScroller = new JScrollPane(eingehend);
        fScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ausgehend = new JTextField(20);
        nameField = new JTextField(10);
        JButton sendenButton = new JButton("Senden");
        sendenButton.addActionListener(this);
        ausgehend.addActionListener(this); // Hinzufügen des Action Listeners zum Ausgehend-Textfeld
        nameField.addActionListener(this); // Hinzufügen des Action Listeners zum Namenstextfeld
        hauptPanel.add(fScroller);
        hauptPanel.add(nameField);
        hauptPanel.add(ausgehend);
        hauptPanel.add(sendenButton);

        netzwerkEinrichten();
        Thread readerThread = new Thread(new EingehendReader());

        readerThread.start();
        add(BorderLayout.CENTER, hauptPanel);
    }

    private void netzwerkEinrichten() {
        try {
            sock = new Socket("localhost", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Netzwerkverbindung steht...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class EingehendReader implements Runnable {
        @Override
        public void run() {
            String nachricht;
            int i = 2;
            try {
                while ((nachricht = reader.readLine()) != null) {
                    System.out.println("gelesen" + nachricht);
                    eingehend.append(nachricht + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!ausgehend.getText().isEmpty()) {
            if (clientName == null) {
                // Wenn noch kein Name eingegeben wurde, den eingegebenen Text als Namen verwenden
                clientName = nameField.getText();
                nameField.setEditable(false); // Das Name-Feld nach der Eingabe sperren
            }
            writer.println(clientName + ": " + ausgehend.getText());
            writer.flush();
            ausgehend.setText("");
            ausgehend.requestFocus();
        }
    }

    public static void main(String[] args) {
        EinfacherChatClient client = new EinfacherChatClient("Einfacher Chat-Client");
        client.setSize(400, 500);
        client.setVisible(true);
    }
}