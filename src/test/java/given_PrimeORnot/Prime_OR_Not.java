package given_PrimeORnot;

import java.util.Scanner;

public class Prime_OR_Not {
	public static void main(String[] args) {
		
		/*
		 * Natural number>1
		 * which has factorial divisible 1 and itself
		 * 
		 * 
		 * example prime number-19->1 and 19
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
			for(int i=1;i<num;i++) {
				if(num%i==0)
					count++;
			}
			if(count<2) {
				System.out.println("Prime number");
			}
			else {
				System.out.println(" Not Prime number");
			}
		}
		
		}


