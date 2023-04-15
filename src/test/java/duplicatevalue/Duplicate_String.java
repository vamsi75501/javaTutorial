package duplicatevalue;

public class Duplicate_String {
 public static void main(String[] args) {
	String val[]= {"sivakumar","sivasankari","senthil","sivakumar"};
	boolean names=false;
	for (int i=0;i<val.length;i++) 
	{
		for(int j=i+1;j<val.length;j++) {
			
			if((val[i]==val[j])||(val[i].equalsIgnoreCase(val[j]))) {
				System.out.println("Duplicate value:"+val[i]);
				names=true;
			}
		}
	}
	if(names==false) {
		System.out.println("There is no Duplicated names");
	}
}
}
