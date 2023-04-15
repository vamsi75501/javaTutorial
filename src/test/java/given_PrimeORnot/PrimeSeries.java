package given_PrimeORnot;

public class PrimeSeries {
public static void main(String[] args) {
	int num=10;
	
	for(int i=1;i<=num;i++) {
		boolean flag=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.print("Prime Series:"+i+",");
		}
	}
}
}
