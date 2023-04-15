 package searching_element;

import java.util.Arrays;

public class BinarySearch_in_Searching_Element {
public static void main(String[] args) {
	   int a[]= {10,20,30,40,50};
	   boolean flag=false;
	   int key=10;
	   int lower=0;
	   int higher=a.length-1;
	
	   while(lower<=higher) {
		   int mid=(lower+higher)/2;
		    
        if (a[mid]==key) {
	        	System.out.println("Element is found");
	        	flag=true;
	             break;
	        }
		   
	        if(a[mid]<key) {
	        	lower=mid+1;
	        	 
	        	
	        }
	        if (a[mid]>key) {
	        	higher=mid-1;
	        }
	   }
	   if (flag==false) {
		   System.out.println("Element is not Found");
	   }


// apporah 2(inbuild function)

//System.out.println(Arrays.binarySearch(a,20));
}
}
