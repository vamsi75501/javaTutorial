package palindrome;

import java.util.Scanner;

public class Palindrome_Strig {
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("ENTER THE LETTERS");
        String letters=SC.nextLine();
        String arr[]=letters.split("");
        String rev="";
        for (int i=arr.length-1;i>=0;i--) {
        	rev=rev+arr[i]+"";
        }
        System.out.println(rev);
        if(letters.equals(rev)||(letters.equalsIgnoreCase(rev))) {
        	System.out.println("PALINDROME");
        	
        }
        else {
        	System.out.println("Not a PAlindrome");
        }
        
        
       // (2program Avilable)
        
//      String Org_letters=letters;
//        String rev="";
//        int len=letters.length();
//        for (int i=len-1;i>=0;i--) {
//        	rev=rev+letters.charAt(i);
//        	//System.out.println(rev);
//        }
//        if (Org_letters.equals(rev)) {
//        	System.out.println("String is PALINDROME");
//        }
//        else {
//        	System.out.println("String is not a PALINDROME");
//        }
	}
	

}
