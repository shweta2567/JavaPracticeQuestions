package javaQuestion;

public class RemoveAllSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello^^%#$(!)_+ $shwet@a";
	        System.out.print(removeSpecialCharacters(str));
	}
	private static String removeSpecialCharacters(String str)
    {
        String newStr = str.replaceAll("[%^#$()!_+@]", "");
        return newStr;
    }


}
