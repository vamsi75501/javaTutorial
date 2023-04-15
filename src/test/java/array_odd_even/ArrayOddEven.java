package array_odd_even;

import java.util.Scanner;

public class ArrayOddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
//	int a[]= {22,46,57,58,11,13};
//	for(int i=0;i<a.length;i++ ) {
//		if(a[i]%2==0) {
//			System.out.println("IT IS A EVEN NUMBER:"+a[i]);
//		}
//		else {
//			System.out.println("IT IS A ODD NUMBER:"+a[i]);
//		}
//	}
	
//	for (int i=0;i<a.length;i++) {
		if(a%2!=0) {
			System.out.println("THE ODD NUMBER:"+a);
		}
		else {
			System.out.println("THE EVEN NUMBER:"+a);
		}
	}
	}

