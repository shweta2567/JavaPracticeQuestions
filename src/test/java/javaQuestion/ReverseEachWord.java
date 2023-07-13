package javaQuestion;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input_str = "Hello World!";
		String ouput_str = "";
		String[] input__str_arr = input_str.split(" ");
		for(String s:input__str_arr) {
			String[] word = s.split("");
			for(int i =word.length-1; i>=0; i--) {
				ouput_str = ouput_str + word[i];
				
			}
			ouput_str = ouput_str +" ";
			
		}
		ouput_str = ouput_str.trim();
		System.out.println(ouput_str);
	}
}
