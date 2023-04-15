 package number_Occurance;

import java.util.Scanner;

public class Char_String {
	public static void main(String[] args) {
		
		String s="Hello welcome to the Chennai";
		
		int totalcount=s.length();
		
		//int AfterRemove=s.replace("e", "").length();
		int AfterRemove=s.replace("o", "").length();
		
		int count=totalcount-AfterRemove;
		
	System.out.println("Number of Occurance:"+count);
	}

}
