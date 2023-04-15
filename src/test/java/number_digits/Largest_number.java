package number_digits;

import java.util.Scanner;

public class Largest_number {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
System.out.println("ENTER FIRST NUMBER");
int A=sc.nextInt();

System.out.println("ENTER SECOND NUMBER");
int B=sc.nextInt();

System.out.println("ENTER THIRD NUMBER");
int C=sc.nextInt();

//Approach1
//if(A>B && A>C) {
//	System.out.println("The largest value is A:"+A);
//}
//else if(B>A && B>C) {
//	System.out.println("The largest value is B:"+B);
//}
//else {
//	System.out.println("The largest value is C:"+C);
//}


//Apporach2 (terinary operator)
int largest1=A>B?A:B;
int largest2=C>largest1?C:largest1;
System.out.println("The Largest_number:"+largest2);
}
}