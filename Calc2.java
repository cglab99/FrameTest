package ch09;
import java.awt.*;
import javax.swing.*;

public class Calcultor extends JFrame {

	JTextField display;
	JLabel history;
	JPanel panel;
	JButton button;
	Calcultor(){
		this.setBounds(100, 100, 300, 500);
		this.setTitle("계산기");
		this.setLayout(new BorderLayout());
		display = new JTextField(30);
		display.setText("0");
		display.setFont(new Font("궁서체", Font.BOLD, 35));
		display.setHorizontalAlignment( SwingConstants.RIGHT );
		
		this.add(display, BorderLayout.NORTH);
		history = new JLabel("--");
		this.add(history, BorderLayout.SOUTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(6,4));

		button = new JButton("%");
		panel.add(button);
		button = new JButton("CE");
		panel.add(button);
		button = new JButton("C");
		panel.add(button);
		button = new JButton("<-");
		button.addActionListener(e->{
			display.setText( display.getText().substring(0, display.getText().length()-1 ) );
		});
		panel.add(button);
		button = new JButton("1/x");
		panel.add(button);
		button = new JButton("x^2");
		panel.add(button);
		button = new JButton("Sqrt");
		panel.add(button);
		button = new JButton("/");
		panel.add(button);
		button = new JButton("7");
		button.addActionListener(e->{
			if( display.getText().equals("0") ) display.setText( "7");
			else display.setText( display.getText() + "7");
		});
		panel.add(button);
		button = new JButton("8");
		button.addActionListener(e->{
			display.setText( display.getText() + "8");
		});
		panel.add(button);
		button = new JButton("9");
		panel.add(button);
		button = new JButton("*");
		panel.add(button);
		button = new JButton("4");
		panel.add(button);
		button = new JButton("5");
		panel.add(button);
		button = new JButton("6");
		panel.add(button);
		button = new JButton("-");
		panel.add(button);
		button = new JButton("1");
		panel.add(button);
		button = new JButton("2");
		panel.add(button);
		button = new JButton("3");
		panel.add(button);
		button = new JButton("+");
		panel.add(button);
		button = new JButton("+/-");
		button.addActionListener(e->{
			if( !display.getText().equals("0") ) {
				if( display.getText().contains("-") ) {
					display.setText( display.getText().substring(1) );				
				} else {
					display.setText( "-" + display.getText() );				
				}
			}
		});
		panel.add(button);
		button = new JButton("0");
		button.addActionListener(e -> {
			if( !display.getText().equals("0") ) { 
				display.setText( display.getText() + "0");
			}
		});
		panel.add(button);
		button = new JButton(".");
		button.addActionListener(e->{
			if( !display.getText().contains(".") ) {
				display.setText( display.getText() + ".");
			}
		});
		panel.add(button);
		button = new JButton("=");
		panel.add(button);














		this.add(panel, BorderLayout.CENTER); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Calcultor();

	}

}
