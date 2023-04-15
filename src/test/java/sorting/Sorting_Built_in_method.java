package sorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Built_in_method {
public static void main(String[] args) {
	
	//apporach1 small to big
		Integer a[]= {30,60,80,100,110,10,50,90};
	System.out.println("before sorting:"+Arrays.toString(a));
//	Arrays.parallelSort(a);
//	System.out.println("After sorting:"+Arrays.toString(a));
	
//Arrays.sort(a);
//System.out.println("After sorting:"+Arrays.toString(a));

//Apporach 2
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("After Sorting:"+Arrays.toString(a));
}
}
