package ch08;

import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		// file writing
		try {
			FileWriter fw = new FileWriter("out.txt");
			fw.write("abcdef\n");
			fw.write("안녕하세요?");
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// file reading
		try {
			FileReader fr = new FileReader("test.txt");
			int ch = fr.read();
			while( ch != -1 ) {
				System.out.print( (char)ch );
				ch = fr.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
