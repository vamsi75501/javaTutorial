  package count_of_vowel;

import java.util.Scanner;

public class Count_of_vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0,count_of_a=0,count_of_e=0,count_of_i=0,count_of_o=0,count_of_u=0;
		for(int i=0;i<s.length();i++) {
			char l=s.charAt(i);
			switch(l) {
			case 'a':
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': count++;
				System.out.println(l);
		}
	}
		if(count==0) {
			System.out.println("no vowel in words");
			}
		else {
			System.out.println("count_of_vowel:"+count);
		}
//		System.out.println("count_of_a:"+count_of_a);
//		System.out.println("count_of_e:"+count_of_e);
//		System.out.println("count_of_i:"+count_of_i);
//		System.out.println("count_of_o:"+count_of_o);
//		System.out.println("count_of_u:"+count_of_u);
//		
		
//		for(int i=0;i<s.length();i++) {
//			char l=s.charAt(i);
//			switch(l) {
//			case 'a': count_of_a++; break;
//			case 'e': count_of_e++; break;
//			case 'i': count_of_i++; break;
//			case 'o': count_of_o++; break;
//			case 'u': count_of_u++; break;
	}
}
	


