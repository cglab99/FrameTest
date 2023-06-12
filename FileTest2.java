package ch15;

import java.io.*;

public class FileTest {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\DCU\\eclipse-workspace\\ch15");
		String[] dir = file.list();
		for(int i=0;i<dir.length;i++) {
			File f = new File(dir[i]);
			System.out.println( f.getName() );
			System.out.println( f.getPath() );
			System.out.println( f.getParent() );
			System.out.println( f.getAbsolutePath() );
			System.out.println( f.getCanonicalPath() );
			System.out.println( f.isDirectory() );
			System.out.println( f.isFile() );
			System.out.println("********************");
		}
	}

}
