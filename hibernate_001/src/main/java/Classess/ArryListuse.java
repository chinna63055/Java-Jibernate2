package Classess;

import java.util.ArrayList;

public class ArryListuse {

	public static void main(String[] args) {
		ArrayList<Object> b=new ArrayList<>();
		b.add(1);
		b.add("LOKESH");
		b.add('q');
		b.add(b);
		
		for(Object n:b) {
			System.out.println(n );
		}
	}

}
