package sum_of_element_in_array;

public class Element_Arrays {
	public static void main(String[] args) {
		int a[]= {23,45,7,89,80};
		int sum=0;
		int val=a.length;
	System.out.println(val);
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("element of array:"+sum);
	}

}
