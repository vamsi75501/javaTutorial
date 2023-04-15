package remove_junk_special_character;

public class Remove_specialchar_junk {
	public static void main(String[] args) {
		String s1="3904 !#%$#@^&&(*& JAVA @#$%^&*(selenium ";
		String s=s1.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);
	}

}
