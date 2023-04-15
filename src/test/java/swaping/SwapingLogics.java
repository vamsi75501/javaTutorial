package swaping;

import java.util.Scanner;

public class SwapingLogics {
	public static void main(String[] args) {
//	int a=35;
//	int b=1;
//	System.out.println("before Swaping:"+a+"," +b);
	
	//Logical 1(Adding variable)
//	int c=a;
//	 a=b;
//	 b=c;
//	 System.out.println("after Swaping:"+a+" "+b);
	 
	//logical 2(addition & subtraction )
	//there is No Third Variable 
	
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("After Swaping:"+a+" "+b);
	
//logical 3(Division & Multiplication)
//	a=a*b;
//	b=a/b;
//	a=a/b;
//	System.out.println("After Swaping:"+a+" "+b);
	
//logical 4 bitwise XOR(^)
//logical 5 single  statement
	/*
	 * it will start from    
	  <----*/
//	b=a+b-(a=b);
//	System.out.println("After Swaping:"+a+","+b);
		Scanner obj=new Scanner(System.in);
	     System.out.println("Enter the number a:");
	     System.out.println("Enter the number b:");
	     int a= obj.nextInt();
	     int b=obj.nextInt();
	     System.out.println("Before Swapping:"+a+" "+b);
	     int c=a;
	     a=b;
	     b=c;
	     System.out.println("After Swapping:"+a+" "+b);
	
	}

}