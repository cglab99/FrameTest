package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RefactoringTest extends JFrame implements ActionListener {

	JLabel label;
	JButton[] btn = new JButton[3];
	String[] action = { "# 1.", "# 2.", "# 3." };
	
	RefactoringTest() {
		this.setBounds(100, 100, 300, 200);
		this.setLayout(new FlowLayout() );
		
		label = new JLabel("안녕");
		this.add(label);
		
		for(int i=0;i<btn.length;i++) {
			btn[i] = new JButton( (i+1) + "번");
			btn[i].addActionListener( this );
			this.add(btn[i]);
		}
	}
	
	public static void main(String[] args) {
		RefactoringTest rt = new RefactoringTest();
		rt.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch( e.getActionCommand() ) {
		case "1번": 
			label.setText( action[0] );
			break;
		case "2번": 
			label.setText( action[1] );
			break;
		case "3번": 
			label.setText( action[2] );
			break;
		default:
		}
	}

}
