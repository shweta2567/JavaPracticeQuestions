package javaQuestion;

public class ExtractLast4CharactersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Shweta";
		printLastChars(str);

	}
	private static void printLastChars(String s) {
		
		int size = s.length();
		int counter = size - 4;
		for( int i= counter; i<size; i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
