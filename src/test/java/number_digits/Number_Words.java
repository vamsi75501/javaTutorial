package number_digits;

import java.util.Scanner;

public class Number_Words {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE STRING:");
	String s=sc.nextLine();
	int length=s.length()-1;
	
	int count=1;
	
	for (int i=0;i<length;i++) {
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
			count++;
			
		}
	}
	System.out.println("count of String:"+count);
}
}
