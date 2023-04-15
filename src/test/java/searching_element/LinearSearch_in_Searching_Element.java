package searching_element;

public class LinearSearch_in_Searching_Element {
public static void main(String[] args) {
	int num[]= {10,20,30,50,60,70};
	int num2=100;
	
	
	boolean flag=false;
	for (int i=0;i<num.length;i++) {
		//System.out.println(num[i]);
		if(num[i]==num2) {
		System.out.println("Element is found:");
		flag=true;
		}
	}
	if(flag==false) {
		System.out.println("Element Not Found");
	}
}


}
