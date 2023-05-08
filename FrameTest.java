package ch09;

import java.awt.*;
import javax.swing.*;

public class FrameTest extends JFrame {
	JButton btnClick, btnClick2, btnK2M;
	JLabel lblDisplay, lblK2M;
	int i;
	JTextField txtK2M;
	double mile;
	
	FrameTest() {
		this.setTitle("0");
		this.setBounds(100, 100, 300, 200);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		btnClick = new JButton("Click");
		btnClick.addActionListener( e -> {
			if( lblDisplay.getText().equals("Hello")  ) lblDisplay.setText("Thank You");
			else lblDisplay.setText("Hello");
		});
		lblDisplay = new JLabel("Hello");
		
		btnClick2 = new JButton("타이틀 변화");
		btnClick2.addActionListener(e->{
			i = Integer.parseInt(this.getTitle());    // parse... 숫자로된 스트링을 ...형의 값으로 바꾸는 메소드
			this.setTitle( i + 1 + "");
		});
		txtK2M = new JTextField(20);
		btnK2M = new JButton("킬로 마일 변환");
		btnK2M.addActionListener(e->{
			mile = Double.parseDouble(txtK2M.getText()) / 1.6;
			lblK2M.setText( txtK2M.getText() + "킬로는" + mile + "마일입니다");
		});
		lblK2M = new JLabel("000");
		this.add(btnClick);
		this.add(lblDisplay);
		this.add(btnClick2);
		this.add(txtK2M);
		this.add(btnK2M);
		this.add(lblK2M);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest();
	}

}
