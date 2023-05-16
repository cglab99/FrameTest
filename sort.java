package ch07;

import java.util.Arrays;

public class CompareObject {

	public static void main(String[] args) {

		int[] intArr = new int[10];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = (int)(Math.random()*100);
		}
		for( int i:intArr ) {
			System.out.print( i + ", " );
		}
		System.out.println();
		Arrays.sort( intArr );
		for( int i:intArr ) {
			System.out.print( i + ", " );
		}		
		System.out.println();
		Rectangle[] rtArr = new Rectangle[10];
	    for(int i=0;i<rtArr.length;i++) {
	    	rtArr[i] = new Rectangle();
	    	rtArr[i].width = (int)(Math.random()*10) + 1;
	    	rtArr[i].length = (int)(Math.random()*10) + 1;
	    }
	    for( Rectangle r : rtArr ) {
	    	System.out.print( r + ", ");
	    }
	    System.out.println();
	    Arrays.sort( rtArr );
	    for( Rectangle r : rtArr ) {
	    	System.out.print( r + ", ");
	    }
	}
}

class Rectangle implements Comparable<Rectangle> {
	int width;
	int length;
	int getArea() {
		return width * length;
	}
	@Override
	public String toString() {
		return "[" + width + ", " + length + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		if( this.getArea() > o.getArea() ) return 1;
		else if( this.getArea() < o.getArea() ) return -1;
		else return 0;
	}

}

