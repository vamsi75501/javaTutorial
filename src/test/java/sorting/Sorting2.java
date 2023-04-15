package sorting;

import java.util.Arrays;

public class Sorting2 {
	public static void main(String[] args) {
//		int marks[]= {1,5,2,5,4,3};
//		System.out.println("before sorting:"+Arrays.toString(marks));
//	     //System.out.println("Length:"+marks.length);
//	     int temp;
//for (int i=0;i<marks.length;i++) {
//	for (int j=i;j<marks.length;j++) {
//		if(marks[i]>marks[j]) {
//			temp=marks[i];
//			marks[i]=marks[j];
//			marks[j]=temp;
//			
//			
//		}
//	}
//}
////for(int a:marks) {
////	System.out.println(a);
////}
//System.out.println("After sorting:"+Arrays.toString(marks));
		 int marks[]={10,45,86,78,90};
	       System.out.println("Before sorting:"+Arrays.toString(marks));
	       int temp;
	       for(int i=0;i<marks.length;i++){
	           for(int j=0;j<marks.length;j++){
	               if(marks[i]<marks[j]){
	                   temp=marks[i];
	                   marks[i]=marks[j];
	                   marks[j]=temp;
	               }
	           }
	       }
	      System.out.println("After sorting:"+Arrays.toString(marks));
	   
	}
	
}




