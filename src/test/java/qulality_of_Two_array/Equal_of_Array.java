package qulality_of_Two_array;

import java.util.Arrays;

public class Equal_of_Array {
	public static void main(String[] args) {
		
		//Inbuild function;
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,5};
//	boolean status=Arrays.equals(a1, a2);
//	if(status==true) {
//		System.out.println("THE ARRAYS ARE EQUAL");
//	}
//	else {
//		System.out.println("The ARE NOT EQUAL");
//	}
//	
	
	//PROGRAM
	boolean status=true;
	if (a1.length==a2.length) {
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				status=false;
			}
		}
		
	}
	else {
		status=false;
	}
	if(status==true) {
		System.out.println("THE ARRAYS ARE EQUAL");
	}
	else {
		System.out.println("THE ARRAYS ARE UNEQUAL");
	}
	
		
	}

}
