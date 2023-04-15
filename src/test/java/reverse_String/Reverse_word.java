package reverse_String;

public class Reverse_word {
	public static void main(String[] args) {
		String s="HELLO GUYS WELCOME TO JAVA AND SELENIUM";
		String[] words=s.split(" ");
		String StringReverse="";
		for(String w:words) {
			String Reverseword="";
			for(int i=w.length()-1;i>=0;i--) {
				Reverseword=Reverseword+w.charAt(i);
				
			}
			StringReverse=StringReverse+Reverseword+" ";
		}
		
		System.out.println("String Reverse:"+StringReverse);
//	
//      apporach 2
//		String s="HELLO welcome to the World !@#";
//		String[] words=s.split("//s ");
//		String Reverseword="";
//        for(String w:words) {
//        	StringBuilder obj=new StringBuilder(w);
//        	obj.reverse();
//        	Reverseword=Reverseword+obj.toString();
//        	System.out.println("Reverse Words:"+Reverseword);
//        }
	}

}
