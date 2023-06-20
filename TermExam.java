import java.awt.*;
import java.io.*;
import javax.swing.*;

public class TermExam {

	static int counter = 0;
	public static void main(String[] args) throws IOException {
		// 1번 문제 출력용 
		ColorRectangle obj = new ColorRectangle(100,100,"blue");
		System.out.println("가로 : " + obj.width );
		System.out.println("세로 : " + obj.height );
		System.out.println("색상 : " + obj.color );
		
		// 2번 출력용
		Circle circle = new Circle( 5.0 );
		System.out.println( "둘레 : " + circle.perimeter() );
		System.out.println( "면적 : " + circle.area() );
		
		// 3번 문제 풀이
		JFrame frame = new JFrame("3번 문제");
		frame.setBounds(100, 100, 400, 200);
		frame.setLayout(new FlowLayout() );
		JLabel label = new JLabel("카운터값");
		frame.add(label);
		JTextField text = new JTextField(10);
		text.setText(counter + "");
		frame.add(text);
		JButton button = new JButton("증가");
		button.addActionListener(e -> {
			counter = counter + 1;
			text.setText(counter+"");
		});
		frame.add(button);
		frame.setVisible(true);

		// 4번 문제 풀이
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int cnt = 1;
		while( (line = br.readLine()) != null ) {
			System.out.println( cnt + " " + line );
			cnt = cnt + 1;
		}
	}
}

// 1번 문제 기본 class
class Rectangle {
	int width, height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

// 1번 문제 풀이 
class ColorRectangle extends Rectangle {
	String color;
	public ColorRectangle( int width, int height, String color ) {
		super(width, height);
		this.color = color;
	}
}

// 2번 기본 class
interface GetInfo {
	public double perimeter();
	public double area();
}

// 2번 문제 풀이
class Circle implements GetInfo {
	double radius;
	Circle( double radius ) {
		this.radius = radius;
	}
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
}
