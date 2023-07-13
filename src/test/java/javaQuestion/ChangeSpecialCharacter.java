package javaQuestion;

public class ChangeSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Hello $hwet@ Y@d@v";
		 System.out.println(printDifferntSpecialChar(str));
		 

	}
	private static String printDifferntSpecialChar(String s) {
		
		return s.replace('@', '_');
		
	}

}
