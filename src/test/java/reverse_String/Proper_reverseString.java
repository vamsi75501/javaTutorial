package reverse_String;

import java.util.Scanner;

public class Proper_reverseString {
	public static void main(String[] args) {
		//String letter="hello world";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String letter=sc.nextLine();
        String emptystring="";
        String sp[]=letter.split(" ");
        for(int i=0;i<=sp.length-1;i++){
            String revW="";
            String word=sp[i];
            for (int j=word.length()-1;j>=0;j--){
                revW=revW+word.charAt(j);
            }
            
            emptystring=emptystring+revW+" ";
            
        }
        System.out.println(emptystring);
		 
	}

}
