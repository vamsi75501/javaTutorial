package number_digits;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count=even_count+1;
			}
			else {
				odd_count=odd_count+1;
			}
			num=num/10;
		}
		System.out.println("Even no:"+even_count);
		System.out.println("Odd no:"+odd_count);
		}
	

}
