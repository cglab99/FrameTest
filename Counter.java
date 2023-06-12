package ch15;

import java.io.*;

public class Counter {

	public static void main(String[] args) throws Exception {

		File file = new File("C://Users//Braveheart//Desktop//C_source//main.cpp");
		FileReader fr = new FileReader( file );
		int ch;
		int wc = 0;
		char findChar = 'e';
		
		// 캐릭터스트림으로 파일을 열어 한 문자씩 읽고, 읽은 문자가 찾는 문자와 같으면 wc를 1씩 증가 시킨다.
		while( (ch=fr.read()) != -1 ) {
			if( ch == findChar ) wc++;
		}
		
		System.out.println(  file.getName() + " 파일에 있는 문자" + findChar + "의 개수 : " + wc );
	}
}
