package duplicatevalue;

public class Duplicate_Number_Array {
	public static void main(String[] args) {
		int a[]= {1,2,5,3,6,4,5,6,7};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate element are :"+a[i]);
					flag=true;
				}
				
			}
			}
		if(flag==false) {
			System.out.println("Duplicate Element is not found");
		}
		
//		Apporach 2(With Hashset)
		//Apporach 3(loop condition)
	
		
			}
	
		}
	


