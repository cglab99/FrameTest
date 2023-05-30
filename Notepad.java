package ch08;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.*;

public class Notepad extends JFrame {

	JTextArea text;
	Notepad() {
		this.setBounds(100, 100, 300, 300);
		this.setLayout(new BorderLayout());
		text = new JTextArea();
		this.add( text, BorderLayout.CENTER );
		
		FileReader fr;
		int ch;
		try {
			fr = new FileReader("test.txt");
			while( (ch = fr.read()) != -1 ) {
				text.setText( text.getText() + (char)ch );
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		Notepad note = new Notepad();
		note.setVisible(true);
	}
}
