package missing_number;

public class Missing_number_array {
  public static void main(String[] args) {
/*
 * Array should not allow the duplicate.
 * array no need to be  in sorted order.
 * value should be in range.
 */
	int a[]= {10,20,40,50};
	int sum1=0;
	for (int i=0;i<a.length;i++) {
		sum1=sum1+a[i];
	}
	System.out.println("ARRAY OF ELEMENT:"+sum1);
	int sum2=0;
	for (int i=10;i<=50;i+=10) {
		sum2=sum2+i;
	}
	System.out.println("ARRAY OF ELEMENT:"+sum2);
	System.out.println("THE MISSING NUMBER IN ARRAYS:"+(sum2-sum1));
	  
	  
	
	  
}
  
}
