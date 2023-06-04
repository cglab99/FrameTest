package ch10;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class ScrollTest extends JFrame {

	JTextArea textArea;
	JButton btnLoad, btnSave;
	JPanel panel;
	FileWriter fw;
	FileReader fr;
	
	ScrollTest() {
		this.setBounds(100,100,300,300);
		this.setTitle("메모장");
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane sp = new JScrollPane(textArea);
		this.add(sp, BorderLayout.CENTER );
		
		btnLoad = new JButton("가져오기");
		btnLoad.addActionListener(e->{
			loadFile();
		});
		btnSave = new JButton("저장하기");
		btnSave.addActionListener(e->{
			saveFile();
		});
		panel = new JPanel(new FlowLayout());
		panel.add(btnLoad);
		panel.add(btnSave);
		this.add(panel, BorderLayout.SOUTH);
		
	}
	
	void saveFile() {
		try {
			fw = new FileWriter("out.txt");
			fw.write( textArea.getText() );
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadFile() {
		int inChar;
		File file = chooseFile();
		BufferedReader br;
		try {
			fr = new FileReader( file );
			br = new BufferedReader(fr);
			String line;
			/*
			while( (line = br.readLine()) != null ) {
				textArea.setText( textArea.getText() + line );
			}
			*/
			char[] a = new char[ (int)file.length() ];
			fr.read(a);
			textArea.setText( new String(a) );
			
			fr.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, file.getName() + "파일이 없습니다.", "경고", JOptionPane.INFORMATION_MESSAGE);	
		}
	}

	private File chooseFile() {
	    JFileChooser fileChooser = new JFileChooser(".");
	    File file;
	    int returnValue = fileChooser.showOpenDialog(null);
	    if (returnValue == JFileChooser.APPROVE_OPTION) {
	    	file = fileChooser.getSelectedFile();
	    } else {
	    	file = new File("in.txt");
	    }
		return file;
	}

	public static void main(String[] args) {

		ScrollTest st = new ScrollTest();
		st.setVisible(true);
	}
}
