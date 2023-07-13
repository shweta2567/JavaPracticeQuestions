package javaQuestion;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateWordsFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Hello I am Shweta Yadav Shweta";
	        printSentenceWithoutDuplicates(str);
	       
	}
	private static void printSentenceWithoutDuplicates(String str) {
		String[] input_arr = str.split(" ");
		String output_str = "";
		for(String s:input_arr) {
			if(!output_str.contains(s)) {
				output_str = output_str + s+ " ";
			}
		}
		output_str= output_str.trim();
		System.out.println(output_str);
		
	}
}
