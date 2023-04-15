package factorial_Method;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
         int num=sc.nextInt();
		//int num=10;
         long fact=1;
         for(int i=1;i<=num;i++) {
        	 fact=fact*i;
         }
         System.out.println("The factorial value is :"+fact);
//		long factorial=1;
//		for(int i=num;i>=1;i--) {
//			factorial=factorial*i;
//			
//			
//		}
//		System.out.println("Fact value: "+factorial);
	}

}
