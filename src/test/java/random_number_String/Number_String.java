package random_number_String;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Number_String {
	public static void main(String[] args) {
		
		//Random(apporach 1)
		//Random obj=new Random();
//		int num=obj.nextInt(29);
//		System.out.println(num);
//		
		//Double--->0.0 less than 1.0
//		double n1=obj.nextDouble();
//		System.out.println(n1);
		
		
	// apporach 2(math)
//		System.out.println(Math.random());
		
	// apporach3(API)
		
		
//   apporach4
		
   //count the random number-->10
		String value=RandomStringUtils.randomNumeric(10);
				System.out.println(value);
		
		String Alpha= RandomStringUtils.randomAlphabetic(4);
		System.out.println(Alpha);
	}

}
