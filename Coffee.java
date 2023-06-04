package ch10;

import java.io.*;

public class Coffee {

	public static void main(String[] args) throws Exception {

		File file = new File("coffe.csv");
		FileInputStream fis = new FileInputStream(file); 
		InputStreamReader isr = new InputStreamReader(fis,"euc-kr");
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		String[] data;
		
		FileReader fr = new FileReader(file);
		int a;
		// br = new BufferedReader(fr);
		
		/*
		while ( (a = fr.read()) != -1 ) {
			if( a != 10 && a != 13  ) line = line + (char)a;
			else { 
				data = line.split(",");
				for ( String s : data ) {
					System.out.print( s + '\t');
				}
				System.out.println();
				line = "";
			}
		}
		*/

		/*
		int a;
		while( (a=isr.read()) != -1  ) {
			
			if( a != 10 && a != 13  ) line = line + (char)a;
			else { 
				data = line.split(",");
				for ( String s : data ) {
					System.out.print( s + '\t');
				}
				System.out.println();
				line = "";
			}
		}
		*/
		
		while( (line=br.readLine()) != null ) {
			data = line.split(",");
			for( String s : data ) {
				System.out.print( s + "\t" );
			}
			System.out.println();
		}
	}
}
