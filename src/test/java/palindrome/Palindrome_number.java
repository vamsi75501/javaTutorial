package palindrome;

import java.util.Scanner;

public class Palindrome_number {
	public static void main(String args[]) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number");
	     int num=SC.nextInt();
	     int pal_num=num;
	     int rev=0;
	     while(num!=0) {
	    	 
	    	 rev=rev*10+num%10;
	    	 num=num/10;
	    	 
	     }
	    if (pal_num==rev) {
	    	System.out.println("PALINDROMME");
	    }
	    else {
	    	System.out.println("NOT A PALINDROME");
	    }
	}

}
