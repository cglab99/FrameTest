package ch15;

import java.io.*;

public class C_program1 {

	/*
	 * 지정된 폴더("C://Users//Braveheart//Desktop//C_source") 안에 있는 모든 파일중 C 프로그램 소스 파일에 대해서
	 * 맨 앞에 #define _CRT_SECURE_NO_WARNINGS 를 붙입니다.
	 * 변경한 파일은 ***.c2 와 같이 파일이름 마지막에 2를 붙여 저장 합니다. 
	 * FileReader 와 String 만 사용하여 한 글자씩 읽어 처리속도가 느립니다.
	 * 
	 * if (f.getName().length()-f.getName().lastIndexOf(".c")==2) 이부분은 ".c"로 끝나는 c 파일에 대해서만 처리 합니다.
	 *  
	 */
	public static void main(String[] args) throws Exception {
		
		File dir = new File("C://Users//Braveheart//Desktop//C_source");   
		String[] file = dir.list();
		int ch;
		String st;
		
		for( String str : file ) {
			File f = new File( dir + "//"+ str );
			System.out.println( f.getName() );
			
			if( f.getName().length()-f.getName().lastIndexOf(".c")==2 ) {
				FileReader fr = new FileReader( f.getAbsoluteFile() );
				st = "#define _CRT_SECURE_NO_WARNINGS\n";
				while( (ch=fr.read()) != -1 ) {
					st = st + (char)ch;
				}
				
				FileWriter fw = new FileWriter( dir + "//" + str + "2");
				System.out.println( " --> " + f.getName() + "2" );
				fw.write( st );
				fw.close();
			} 
			else {
				System.out.println( " -->  No C file" );
			}
		} 
	}
}
