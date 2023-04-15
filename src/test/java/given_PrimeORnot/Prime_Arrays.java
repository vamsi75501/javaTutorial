package given_PrimeORnot;

public class Prime_Arrays {
	public static void main(String[] args) {
		int[] a={65,77,43,36};
		
	       for(int i=0;i<a.length;i++) {
	    	   int count=0;
	    	   for(int j=1;j<a[i];j++) {
	    		   if (a[i]%j==0) {
	    			   count++;
	    		   }
	    	   }
	    	   
	       
	       if(count<2) {
	    	   System.out.println(a[i]+" a prime");
	    	   
	       }
	       else {
	    	   System.out.println(a[i]+" Not a prime");
	       }
	    	  
	       }
	       
	       
	       
	       
	       
	}
	            }
	


