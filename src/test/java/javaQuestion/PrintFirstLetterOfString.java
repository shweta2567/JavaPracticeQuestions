package javaQuestion;

public class PrintFirstLetterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello I am Shweta";
		returnFirstAlphabet(str);
		

	}

	 private static void returnFirstAlphabet(String str) {
		 String word="";
		 String[] split =str.split(" ");
		 for(int i =0; i<split.length; i++) {
			 word = split[i];
			 System.out.println(word.charAt(0));
		 }
	 }
}
