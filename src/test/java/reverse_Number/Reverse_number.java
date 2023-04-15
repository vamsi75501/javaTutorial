 package reverse_Number;

import java.util.Scanner;

public class Reverse_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value: ");
	int value=sc.nextInt();
	
	//Algorithm methods(logic 1)
	
	int rev=0;
	
	while(value!=0) {
		
		rev=rev*10+value%10;
		value=value/10;
	}
	System.out.println("REVERSE NUMBER:"+rev);
	//StringBuffer(logic 2)
//	StringBuffer sb = new StringBuffer(String.valueOf(value));
//	StringBuffer rev=sb.reverse();
//	System.out.println("REVERSE NUMBER:"+rev);
	
//	StringBulider(logic 3)
//	StringBuilder SB=new StringBuilder();
//	SB.append(value);
//	StringBuilder rev=SB.reverse();
//	System.out.println("REVERSE NUMBER:"+rev);
	
	
	 
}
}