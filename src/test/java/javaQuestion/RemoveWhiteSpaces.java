package javaQuestion;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "         Hello              Shwet     aa         ";
	        System.out.print(removeWhiteSpace(str));

	}
	 private static String removeWhiteSpace(String str)
	    {
	        String newStr = str.replaceAll("\\s", "");
	        return newStr;
	    }
}
