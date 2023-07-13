package javaQuestion;

public class RemoveDuplicateCharcater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helloo I am Shwetaa Yadav";
		String[] str_arr = s.split("");
		String expected_str = "";
		for(String str:str_arr) {
			if(!expected_str.contains(str) || str.equalsIgnoreCase(" "))
			{
				expected_str = expected_str + str;	
			}
			
		}
		System.out.println(expected_str);
		

	}

}
