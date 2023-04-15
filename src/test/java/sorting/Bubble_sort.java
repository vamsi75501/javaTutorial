package sorting;

import java.util.Arrays;

public class Bubble_sort {
public static void main(String[] args) {
	int a[]= {7,2,5,30,1};
	int temp;
	System.out.println("before sorting:"+Arrays.toString(a));
	int n=a.length;
	for(int i=0;i<n-1;i++)// Number of passes
		{
		for (int j=0;j<n-1;j++) //Iteration in each pass
		{
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println("After sorting:"+Arrays.toString(a));
}
}
