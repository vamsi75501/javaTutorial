package sorting;

public class Sorting1 {
	public static void main(String[] args) {
		int marks[]= {1,5,2,4,3};
	     //System.out.println("Length:"+marks.length);
	     int temp;
for (int i=0;i<marks.length;i++) {
	
	for (int j=i;j<marks.length;j++) {
		
		if(marks[i]<marks[j]) {
			
			temp=marks[i];
			
			marks[i]=marks[j];
			
			marks[j]=temp;
			
			
		}
	}
}
for(int a:marks) {
	System.out.print(a);
}
	}
	
}
