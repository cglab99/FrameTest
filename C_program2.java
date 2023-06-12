package ch15;

import java.io.*;

public class C_program2 {

	/*
	 * 지정된 폴더("C://Users//Braveheart//Desktop//C_source") 안에 있는 모든 파일중 C 프로그램 소스 파일에 대해서
	 * 맨 앞에 #define _CRT_SECURE_NO_WARNINGS 를 붙입니다.
	 * 변경한 파일은 ***.c2 와 같이 파일이름 마지막에 2를 붙여 저장 합니다. 
	 * BufferedReader 와 StringBuffer 를 사용하여 파일을 빠르게 처리합니다.
	 * 
	 * if (f.getName().length()-f.getName().lastIndexOf(".c")==2) 이부분은 ".c"로 끝나는 c 파일에 대해서만 처리 합니다.
	 *  
	 */
	public static void main(String[] args) throws Exception {
		
		File dir = new File("C://Users//Braveheart//Desktop//C_source");   
		String[] file = dir.list();
		String st;
		StringBuffer sb = new StringBuffer();;
		
		for( String str : file ) {
			File f = new File( dir + "//"+ str );
			System.out.println( f.getName() );
			
			if( f.getName().length()-f.getName().lastIndexOf(".c")==2 ) {
				BufferedReader br = new BufferedReader(new FileReader( f.getAbsoluteFile() ));
				sb.append("#define _CRT_SECURE_NO_WARNINGS\n");
				while( (st=br.readLine()) != null ) {
					sb.append( st+"\n" );
				}
				
				String s = sb.toString();				
				FileWriter fw = new FileWriter( dir + "//" + str + "2");
				System.out.println( " --> " + f.getName() + "2" );
				fw.write( s );
				fw.close();
			} 
			else {
				System.out.println( " -->  No C file" );
			}
		} 
	}
}
