package count_String;

import java.util.Scanner;

public class Count_Words {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE STRINGS:");
	String s=sc.nextLine();
	int count=1;

	for(int i=0;i<s.length()-1;i++) {
		if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){
			count=count+1;
		}
	}
	System.out.println("Number of words:"+count);
	 
}
}
