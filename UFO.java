package ch09;

import java.awt.FlowLayout;
import java.time.*;
import javax.swing.*;

public class Comple extends JFrame {
	
	JLabel sec;
	JLabel counter;
	JButton click;
	Timer timer; 
	ImageIcon icon = new ImageIcon("UFO.png");
	
	Comple() {
		this.setTitle("시계");
		this.setIconImage( icon.getImage() );
		this.setBounds(100, 100, 300, 200);
		this.setLayout(null);
		this.setResizable(false);
		sec = new JLabel(  );
		
		sec.setIcon(icon);
		sec.setSize(50,33);
		sec.setLocation(50,0);
		this.add(sec);
		
		timer = new Timer( 100 , e->{
			if( sec.getLocation().getX() > 300) sec.setLocation(0, 50);
			else sec.setLocation((int)(sec.getLocation().getX() + 10), 50  );
		});
		timer.start();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Comple();
		
	}
}
