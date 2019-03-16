package corejava;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner (System.in);
		String st=s.nextLine();
		for(int i=0;i<st.length();i++) {
			
			System.out.print(st.charAt(i));
		}

	}

}
