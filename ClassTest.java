package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ClassTest extends JFrame implements ActionListener {
	JLabel label;
	JButton click, click2, click3, click4, click5;
	
	ClassTest() {
		this.setBounds(100, 100, 300, 200);
		FlowLayout layout = new FlowLayout();
		this.setLayout( layout );
		label = new JLabel(" hello ~ ");
		this.add(label);
		
		click = new JButton("click");
		ActionListener actionListener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("감사합니다.2");
			}
		};
		class MyAL implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("감사합니다.");
			}
		}
		MyAL actionListener = new MyAL();
		click.addActionListener( actionListener );
		this.add(click);
		
		click2 = new JButton("click2");
		click2.addActionListener( actionListener2 );
		this.add(click2);
		
		click3 = new JButton("click3");
		click3.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("3번");
			}
		} );
		this.add(click3);
		
		click4 = new JButton("click4");
		click4.addActionListener( (e) -> {
			label.setText("click4");
		} );
		this.add(click4);
		
		click5 = new JButton("click5");
		click5.addActionListener( this );
		this.add(click5);
		
	}
	
	public static void main(String[] args) {
		ClassTest myFrame = new ClassTest();
		myFrame.setVisible(true);
		myFrame.setTitle("프레임 테스트");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("Number 5");
	}
}
