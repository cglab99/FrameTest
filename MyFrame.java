package ch09;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	JLabel lblShow;
	JButton btnClick;
	
	MyFrame() {
		
		this.setTitle("윈도우 테스트");
		this.setBounds( 100, 100, 300, 200 );
		this.setLayout( new FlowLayout() );
		
		btnClick = new JButton("Click");
		btnClick.addActionListener( e -> {
			if( lblShow.getText().equals("Hello")  ) lblShow.setText("안녕하세요");
			else lblShow.setText("Hello");
		}  );
		this.add(btnClick);
		
		lblShow = new JLabel("test");		
		this.add(lblShow);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();

	}

}
