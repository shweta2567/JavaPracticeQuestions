package javaQuestion;

public class PrintAllTheSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shweta";
		printSubstring(s);

	}
	private static void printSubstring(String s)
	{
		for(int i =0;i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}

}
